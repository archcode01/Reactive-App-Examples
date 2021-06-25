package com.demo.reactive.cassandra.resources;

import com.demo.reactive.cassandra.model.ProductDto;
import com.demo.reactive.cassandra.services.ProductReactiveService;
import com.demo.reactive.cassandra.services.ProductService;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/reactiveproducts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProductReactiveResource {

  @Inject
  ProductReactiveService service;

  @GET
  public Multi<ProductDto> getAllProds() {
    return service.getAll();
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public Uni<Void> insertProd(ProductDto prod) {
    return service.insert(prod);
  }
}
