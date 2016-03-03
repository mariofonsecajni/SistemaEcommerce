package model.facade.rs;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.domain.Cliente;

@Path("/cliente")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class ClienteFacade {

	@GET
	public List<Cliente> getClientes() {
		return Arrays.asList(new Cliente(1, "carlos", "carlos@gmail.com"),
				new Cliente(2, "fulano", "fulano@gmail.com"));
	}

	@GET
	@Path("/{codigo}")
	public Cliente getClientes(@PathParam("codigo") Integer codigo) {

		if (codigo == 1) {
			return new Cliente(1, "carlos", "carlos@gmail.com");
		} else {
			return new Cliente(3, "novo cliente", "novo@gmail.com");
		}
	}
	
	@POST
	public Cliente salvar(Cliente cliente){
		
		
		return null;
		
	}

}
