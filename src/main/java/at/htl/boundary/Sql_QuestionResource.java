package at.htl.boundary;

import at.htl.control.SqlExerciseRepository;
import at.htl.control.Sql_QuestionRepository;
import at.htl.entity.Sql_Question;

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






}
