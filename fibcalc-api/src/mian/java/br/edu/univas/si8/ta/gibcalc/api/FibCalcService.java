package br.edu.univas.si8.ta.gibcalc.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.univas.si8.ta.gibcalc.api.Result;

@Path("/fibcalc")
public interface FibCalcService {
	
	@GET
	@Path("/fib/{num}")
	@Produces(MediaType.APPLICATION_JSON)
	Result fibcalc(@PathParam("num") int num);
	
	

}
