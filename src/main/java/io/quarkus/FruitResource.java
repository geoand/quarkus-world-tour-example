package io.quarkus;

import io.smallrye.common.annotation.Blocking;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("fruit")
@Blocking
public class FruitResource {

    @GET
    public List<Fruit> listAll() {
        return Fruit.listAll();
    }
}
