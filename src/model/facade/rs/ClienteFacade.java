package model.facade.rs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.dao.ClienteDao;
import model.domain.Cliente;

@Path("/cliente")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class ClienteFacade {
	
	private ClienteDao clienteDao;
	@GET
	public List<Cliente> getClientes() {
		return clienteDao.getClientes(new Cliente());
	}
	
	@GET
	@Path("/{codigo}")
	public List<Cliente> getClientes(@PathParam("codigo") Integer codigo) {
		
		Cliente cliente = new Cliente();
		cliente.setCodigo(codigo);
		return clienteDao.getClientes(cliente);

	}
		
	/* antes do daoIml
	 *
	private static List<Cliente> clientes = new ArrayList<Cliente>();

	// simula o dao, construtor de classe (executa uma vez s�, o de objeto
	// executa em todos objetos)
	static {

		//clientes.add(new Cliente(1, "carlos", "carlos@gmail.com"));
		//clientes.add(new Cliente(2, "fulano", "fulano@gmail.com"));
	}
	  
	 * @GET
	@Path("/{codigo}")
	public Cliente getClientes(@PathParam("codigo") Integer codigo) {
		try {
			return getCliente(codigo);
		} catch (ClienteNaoEncontradoException e) {
			throw new WebApplicationException(404);
		}

	}

	private Cliente getCliente(Integer codigo) throws ClienteNaoEncontradoException {
		for (Cliente cliente : clientes) {
			if (cliente.getCodigo().equals(codigo)) {
				return cliente;
			}

		}
		throw new ClienteNaoEncontradoException(codigo);
	}
*/
	
	
	
	
	
/*	@POST
	public Cliente salvar(Cliente cliente) {
		clientes.add(cliente);
		return cliente;

	}

	@GET
	public List<Cliente> getClientes() {
		return clientes;
	}

	@PUT
	public Cliente atualizarCliente(Cliente cliente) {
		int pos = clientes.indexOf(cliente);
		if (pos >= 0) {
			clientes.set(pos, cliente);
			return cliente;
		}
		throw new WebApplicationException(404);
	}

	@DELETE
	@Path("/{codigo}")
	public Cliente deletarCliente(@PathParam("codigo") Integer codigo) {
		try {
			Cliente cliente = getCliente(codigo);
			clientes.remove(clientes.indexOf(cliente));
			return cliente;
		} catch (ClienteNaoEncontradoException e) {
			throw new WebApplicationException(404);
		}
	}*/
}
