package models;

public class FuncionarioMensalista extends Funcionario {
	private Double salario;

	public FuncionarioMensalista() {

	}

	public FuncionarioMensalista(Integer numeroCracha, String nome, String setor, String funcao, Double salario) {
		super(numeroCracha, nome, setor, funcao);
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Numero Cracha: " + getNumeroCracha() + " Nome: " + getNome() + " Setor: " + getSetor() + " Funcao: "
				+ getFuncao() + " Salario: " + salario;
	}

}
