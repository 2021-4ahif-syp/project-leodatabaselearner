package at.htl.boundary;

import at.htl.control.Sql_StatementRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/resteasy/leodatabase")
public class Sql_StatementResource {

    @Inject
    Sql_StatementRepository sqlStatementRepository;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response findAll()
    {
        return Response.ok(sqlStatementRepository.listAll()).build();
    }
}