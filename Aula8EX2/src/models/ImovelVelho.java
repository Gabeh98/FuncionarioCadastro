package models;

public class ImovelVelho extends Imovel {
	private Double valorDesconto;

	public ImovelVelho() {
	}

	public ImovelVelho(Integer codigo, String endereco, Double valor, Double valorDesconto) {
		super(codigo, endereco, valor);
		this.valorDesconto = valorDesconto;
	}

	public Double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(Double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public Double calcularValorImovel() {
		return null;
	}

	@Override
	public String toString() {
		return "ImovelVelho " + " Codigo: " + getCodigo() + " Endereco: " + getEndereco() + " Valor: " + getValor()
				+ " Valor Desconto: " + valorDesconto;
	}

}
