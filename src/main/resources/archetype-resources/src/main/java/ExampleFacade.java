package $package;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.biosnet.arq.exception.BiosnettcsException;
import com.biosnet.arq.util.GenericResponse;

@Path("/example")
@Produces( "application/json" )
public interface ExampleFacade {
	
	@GET
	@Path("/")
	public GenericResponse getPlayerInfo() throws BiosnettcsException; 

}
