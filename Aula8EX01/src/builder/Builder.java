package builder;

import java.util.Scanner;

import models.FuncionarioHorista;
import models.FuncionarioMensalista;

public class Builder {
	
	public FuncionarioHorista createFuncionarioHorista (Scanner sc) {
		
		System.out.println("Numero Cracha: ");
		Integer numeroCracha = sc.nextInt();
		System.out.println("Digite o Nome: ");
		String nome = sc.next();
		System.out.println("Digite o Setor: ");
		String setor = sc.next();
		System.out.println("Digite a Funcao: ");
		String funcao = sc.next();
		System.out.println("Digite a Quantidade Hora: ");
		Integer quantidadeHora = sc.nextInt();
		System.out.println("Digite o ValorHora: ");
		Double valorHora = sc.nextDouble();
		
		return new FuncionarioHorista(numeroCracha,nome,setor,funcao,quantidadeHora,valorHora);
	} 
	
	public FuncionarioMensalista createFuncionarioMensalista (Scanner sc) {
		
		System.out.println("Numero Cracha: ");
		Integer numeroCracha = sc.nextInt();
		System.out.println("Digite o Nome: ");
		String nome = sc.next();
		System.out.println("Digite o Setor: ");
		String setor = sc.next();
		System.out.println("Digite a Funcao: ");
		String funcao = sc.next();
		System.out.println("Digite o Salario: ");
		Double salario = sc.nextDouble();

		
		return new FuncionarioMensalista(numeroCracha,nome,setor,funcao,salario);
	} 
}
