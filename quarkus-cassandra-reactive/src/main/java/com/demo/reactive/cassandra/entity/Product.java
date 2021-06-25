package com.demo.reactive.cassandra.entity;

import com.datastax.oss.driver.api.mapper.annotations.Entity;
import com.datastax.oss.driver.api.mapper.annotations.PartitionKey;

@Entity
public class Product {

  @PartitionKey private Integer prdt_id;
  private String title;

  public void setPrdt_id(Integer id) {
    this.prdt_id = id;
  }

  public Integer getPrdt_id() {
    return this.prdt_id;
  }

  public void setTitle(String t) {
    this.title = t;
  }

  public String getTitle() {
    return this.title;
  }
}
