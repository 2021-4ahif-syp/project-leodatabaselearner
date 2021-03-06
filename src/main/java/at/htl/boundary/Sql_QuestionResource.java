package at.htl.boundary;

import at.htl.control.Sql_QuestionRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("/Exercise")
public class Sql_QuestionResource {

    @Inject
    Sql_QuestionRepository sqlQuestionRepository;

    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Response findAll(){
        return Response.ok(sqlQuestionRepository.findAllQuestions()).build();
    }

}
