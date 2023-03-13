package spc;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello")
public class HelloController {

    @GET
    public String get() {
        return "Hello from Jersey";
    }

}
