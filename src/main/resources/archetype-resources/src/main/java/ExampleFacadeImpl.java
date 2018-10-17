package $package;


import org.springframework.stereotype.Service;

import com.biosnet.arq.exception.BiosnettcsException;
import com.biosnet.arq.util.GenericResponse;

@Service("exampleService")
public class ExampleFacadeImpl implements ExampleFacade {
	
	
	@Override
	public GenericResponse getPlayerInfo() throws BiosnettcsException {
		return new GenericResponse("Hi");
	}

}
