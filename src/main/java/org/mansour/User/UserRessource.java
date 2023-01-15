package org.mansour.User;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/api/user")
public class UserRessource {

    @Path("/yo")
    @GET
    public String yo()
    {
        return "one day bro \n";
    }

    @Path("/all")
    @GET
    public List<User> getAllUsers()
    {
        return User.listAll();
    }
    
}

