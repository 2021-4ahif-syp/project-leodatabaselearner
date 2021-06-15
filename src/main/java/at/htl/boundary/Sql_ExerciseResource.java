package at.htl.boundary;

import at.htl.control.Sql_ExerciseRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("/Exercise")
public class Sql_ExerciseResource {
    @Inject
    Sql_ExerciseRepository sqlExerciseRepository;

    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Response findAll(){
        return Response.ok(sqlExerciseRepository.findAllExercises()).build();
    }

    /**
     *
     * @return all exercises sorted by 'name'
     */
    @GET
    @Path("name")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAllSortedByName() {
        return Response.ok(sqlExerciseRepository.findAllSortedByName()).build();
    }

}
