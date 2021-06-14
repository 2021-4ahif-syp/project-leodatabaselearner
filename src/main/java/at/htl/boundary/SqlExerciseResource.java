package at.htl.boundary;

import at.htl.control.SqlExerciseRepository;
import at.htl.entity.Sql_Exercise;
import io.quarkus.narayana.jta.runtime.TransactionConfiguration;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;

@RequestScoped
@Path("/Exercise")
public class SqlExerciseResource {
    @Inject
    SqlExerciseRepository sqlExerciseRepository;

    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Response findAll(){
        return Response.ok(sqlExerciseRepository.findAllExercises())
    }

}
