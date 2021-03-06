package at.htl.boundary;

import at.htl.control.Sql_StatementRepository;
import at.htl.control.Sql_TeacherRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("/Teacher")
public class Sql_TeacherResource {
    @Inject
    Sql_TeacherRepository sqlTeacherRepository;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response findAll()
    {
        return Response.ok(sqlTeacherRepository.listAll()).build();
    }
}
