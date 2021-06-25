package com.demo.reactive.cassandra.services;

import com.demo.reactive.cassandra.dao.ProductDao;
import com.demo.reactive.cassandra.entity.Product;
import com.demo.reactive.cassandra.model.ProductDto;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ProductService {
  @Inject ProductDao dao;

  public void insert(ProductDto prod) {
    Product p = new Product();
    p.setPrdt_id(prod.getId());
    p.setTitle(prod.getTitle());
    dao.update(p);
  }

  public List<ProductDto> getAll() {
    return dao.findAll().map(p -> new ProductDto(p.getPrdt_id(), p.getTitle())).all();
  }
}
