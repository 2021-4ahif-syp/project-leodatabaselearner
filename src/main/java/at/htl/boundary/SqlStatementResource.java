package at.htl.boundary;

import at.htl.control.SqlStatementRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/resteasy/leodatabase")
public class SqlStatementResource {

    @Inject
    SqlStatementRepository sqlStatementRepository;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response findAll()
    {
        return Response.ok(sqlStatementRepository.listAll()).build();
    }
}