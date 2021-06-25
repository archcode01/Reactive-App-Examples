package com.demo.reactive.cassandra.dao;

import com.datastax.oss.driver.api.mapper.annotations.DaoFactory;
import com.datastax.oss.driver.api.mapper.annotations.Mapper;

@Mapper
public interface ProductMapper {

  @DaoFactory
  ProductDao productDao();

  @DaoFactory
  ProductReactiveDao productReactiveDao();

}
