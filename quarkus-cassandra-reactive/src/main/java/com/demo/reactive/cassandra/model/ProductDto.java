package com.demo.reactive.cassandra.model;

import java.util.Objects;

public class ProductDto {
  private Integer id;
  private String title;

  public ProductDto(Integer id, String title) {
    this.id = id;
    this.title = title;
  }

  public ProductDto(){}

  public void setTitle(String t) {
    this.title = t;
  }

  public String getTitle() {
    return title;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ProductDto fruitDto = (ProductDto) o;

    if (!Objects.equals(id, fruitDto.id)) return false;
    return Objects.equals(title, fruitDto.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title);
  }
}
