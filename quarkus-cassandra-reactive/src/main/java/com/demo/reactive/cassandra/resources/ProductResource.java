package com.demo.reactive.cassandra.resources;

import com.demo.reactive.cassandra.model.ProductDto;
import com.demo.reactive.cassandra.services.ProductService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/products")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {

  @Inject ProductService service;

  @GET
  public List<ProductDto> getAllProds() {
    return service.getAll();
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public void insertProd(ProductDto prod) {
    service.insert(prod);
  }
}
