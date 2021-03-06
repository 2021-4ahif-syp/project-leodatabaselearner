package at.htl.boundary;

import at.htl.control.Sql_AnswerRepository;
import at.htl.control.Sql_ExerciseRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("/Answer")
public class Sql_AnswerResource {

    @Inject
    Sql_AnswerRepository sql_answerRepository;

    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Response findAll(){
        return Response.ok(sql_answerRepository.findAll()).build();
    }

}
