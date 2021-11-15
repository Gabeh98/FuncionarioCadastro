package models;

public class FuncionarioHorista extends Funcionario {
	public Integer quantidadeDeHoras;
	public Double valorHora;
	
	public FuncionarioHorista() {
	}
	public FuncionarioHorista(FuncionarioHorista funcionarioHorista) {
	}

	public FuncionarioHorista(Integer numeroCracha, String nome, String setor, String funcao, Integer quantidadeDeHoras,
			Double valorHora) {
		super(numeroCracha, nome, setor, funcao);
		this.quantidadeDeHoras = quantidadeDeHoras;
		this.valorHora = valorHora;
	}

	public Integer getQuantidadeDeHoras() {
		return quantidadeDeHoras;
	}

	public void setQuantidadeDeHoras(Integer quantidadeDeHoras) {
		this.quantidadeDeHoras = quantidadeDeHoras;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public String toString() {
		return "Numero Cracha: " + getNumeroCracha() + " Nome: " + getNome() + " Setor: " + getSetor() + " Funcao: "
				+ getFuncao() + " Quantidade de Horas: " + quantidadeDeHoras + " ValorHora: " + valorHora;
	}
	

}
