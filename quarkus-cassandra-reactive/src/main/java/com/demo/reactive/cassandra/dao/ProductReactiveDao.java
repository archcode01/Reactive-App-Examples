package com.demo.reactive.cassandra.dao;

import com.datastax.oss.driver.api.core.PagingIterable;
import com.datastax.oss.driver.api.mapper.annotations.Dao;
import com.datastax.oss.driver.api.mapper.annotations.Select;
import com.datastax.oss.driver.api.mapper.annotations.Update;
import com.datastax.oss.quarkus.runtime.api.reactive.mapper.MutinyMappedReactiveResultSet;
import com.demo.reactive.cassandra.entity.Product;
import io.smallrye.mutiny.Uni;

@Dao
public interface ProductReactiveDao {

  @Update
  Uni<Void> update(Product prod);

  @Select
  MutinyMappedReactiveResultSet<Product> findAll();
}
