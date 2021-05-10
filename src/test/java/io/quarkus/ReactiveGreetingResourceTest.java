package io.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ReactiveGreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("Hello"));
    }

    @Test
    public void testHelloEndpoint2() {
        given()
                .when().get("/hello/2")
                .then()
                .statusCode(200)
                .body(is("Hello 2"));
    }

}
