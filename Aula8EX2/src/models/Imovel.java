package models;

public class Imovel {
	private Integer codigo;
	private String endereco;
	private Double valor;
	public Imovel() {
	}
	public Imovel(Integer codigo, String endereco, Double valor) {
		super();
		this.codigo = codigo;
		this.endereco = endereco;
		this.valor = valor;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
