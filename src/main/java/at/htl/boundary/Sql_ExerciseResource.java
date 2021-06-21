package at.htl.boundary;

import at.htl.control.Sql_ExerciseRepository;
import at.htl.entity.Sql_Exercise;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
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

    @Transactional
    @DELETE
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteDancer(@PathParam("name") String name){
        Sql_Exercise deletedExcercise = sqlExerciseRepository.removeExercise(name);
        return Response.ok(deletedExcercise.getName()).build();
    }
}
