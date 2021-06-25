package com.demo.reactive.cassandra.services;

import com.demo.reactive.cassandra.dao.ProductDao;
import com.demo.reactive.cassandra.dao.ProductReactiveDao;
import com.demo.reactive.cassandra.entity.Product;
import com.demo.reactive.cassandra.model.ProductDto;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class ProductReactiveService {
  @Inject
  ProductReactiveDao dao;

  public Uni<Void> insert(ProductDto prod) {
    Product p = new Product();
    p.setPrdt_id(prod.getId());
    p.setTitle(prod.getTitle());
    return dao.update(p);
  }

  public Multi<ProductDto> getAll() {
    return dao.findAll().map(p -> new ProductDto(p.getPrdt_id(), p.getTitle()));
  }
}
