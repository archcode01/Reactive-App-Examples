package com.demo.reactive.cassandra.dao;

import com.datastax.oss.driver.api.core.PagingIterable;
import com.datastax.oss.driver.api.mapper.annotations.Dao;
import com.datastax.oss.driver.api.mapper.annotations.Select;
import com.datastax.oss.driver.api.mapper.annotations.Update;
import com.demo.reactive.cassandra.entity.Product;

@Dao
public interface ProductDao {

  @Update
  void update(Product prod);

  @Select
  PagingIterable<Product> findAll();
}
