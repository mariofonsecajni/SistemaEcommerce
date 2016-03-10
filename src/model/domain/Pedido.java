package model.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="TB_PEDIDO")
public class Pedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="NR_PEDIDO")
	private Integer numero;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_PEDIDO")
	private Date data;
	
	@ManyToOne
	@JoinColumn(name = "CD_CLIENTE", referencedColumnName = "CD_CLIENTE")
	private Cliente cliente;
	
	
	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", data=" + data + "]";
	}
	public Integer getnumero() {
		return numero;
	}
	public void setnumero(Integer numero) {
		this.numero = numero;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pedido(Integer numero, Date data) {
		super();
		this.numero = numero;
		this.data = data;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}
	

}
