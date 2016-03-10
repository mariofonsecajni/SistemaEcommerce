package model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="TB_PRODUTO")
public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_PRODUTO")
	private Integer codigo;
	@Column(name="NM_PRODUTO")
	private String nome;
	@Column(name="VL_PRECO")
	private double preco;
	@Column(name="QT_ESTOQUE")
	private Integer quantidade;
	@Column(name="NM_IMAGEM")
	private String nomeImagem;
	
	@ManyToOne
	@JoinColumn(name = "CD_CATEGORIA", referencedColumnName = "CD_CATEGORIA")
	private Categoria categoria;
	
	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produto(Integer codigo, String nome, double preco, Integer quantidade, String nomeImagem) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.nomeImagem = nomeImagem;
	}
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", quantidade="
				+ quantidade + ", nomeImagem=" + nomeImagem + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Produto other = (Produto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	public Integer getcodigo() {
		return codigo;
	}
	public void setcodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public String getNomeImagem() {
		return nomeImagem;
	}
	public void setNomeImagem(String nomeImagem) {
		this.nomeImagem = nomeImagem;
	}
	
	
	
	

}
