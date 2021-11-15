package models;

public class ImovelNovo extends Imovel {
	private Double valorAdicional;

	public ImovelNovo() {
	}

	public ImovelNovo(Integer codigo, String endereco, Double valor, Double valorAdicional) {
		super(codigo, endereco, valor);
		this.valorAdicional = valorAdicional;
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	public Double calcularValorImovel() {
		return getValor() + valorAdicional;
	}

	@Override
	public String toString() {
		return "ImovelVelho " + " Codigo: " + getCodigo() + " Endereco: " + getEndereco() + " Valor: " + getValor()
		+ " Valor Adicional: " + valorAdicional;
	}

}
