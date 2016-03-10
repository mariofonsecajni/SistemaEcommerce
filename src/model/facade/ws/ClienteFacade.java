package model.facade.ws;

import java.util.Arrays;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import model.domain.Cliente;

@WebService(serviceName = "ws/cliente")
public class ClienteFacade {

	@WebMethod
	public List<Cliente> getClientes() {
		return Arrays.asList(
				new Cliente(1, "carlos", "professor", "tamoios", "ituiutaba", "39419-987", "Brasil", "38488-8744",
						"nao"),
				new Cliente(2, "luis", "porteiro", "europa", "uberlandia", "38400-981", "Brasil", "33254-8874", "nao"));
	}

	@WebMethod(operationName = "getClientesParametro")
	public List<Cliente> getClientes(Cliente cliente) {
		if (cliente.getCodigo() == null) {
			return Arrays.asList(new Cliente(0, "cliente não existe", "", "", "", "", "", "", ""));
		}
		if (cliente.getCodigo() == 1) {
			return Arrays.asList(new Cliente(1, "carlos", "professor", "tamoios", "ituiutaba", "39419-987", "Brasil",
					"38488-8744", "nao"));
		} else {
			return Arrays.asList(new Cliente(2, "luisa", "porteira", "europa", "uberlandia", "38400-981", "Brasil",
					"33254-8874", "nao"));
		}
	}

}
