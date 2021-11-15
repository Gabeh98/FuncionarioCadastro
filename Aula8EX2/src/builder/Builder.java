package builder;

import java.util.Scanner;

import models.ImovelNovo;
import models.ImovelVelho;

public class Builder {
	public ImovelNovo createImovelNovo(Scanner sc) {

		System.out.println("Codigo: ");
		Integer codigo = sc.nextInt();
		System.out.println("Digite o Endereco: ");
		String endereco = sc.next();
		System.out.println("Digite o Valor: ");
		Double valor = sc.nextDouble();
		System.out.println("Digite o Valor Adicional: ");
		Double valorAdicional = sc.nextDouble();

		return new ImovelNovo(codigo, endereco, valor, valorAdicional);
	}
	public ImovelVelho createImovelVelho(Scanner sc) {
		System.out.println("Codigo: ");
		Integer codigo = sc.nextInt();
		System.out.println("Digite o Endereco: ");
		String endereco = sc.next();
		System.out.println("Digite o Valor: ");
		Double valor = sc.nextDouble();
		System.out.println("Digite o Valor Descontol: ");
		Double valorDesconto = sc.nextDouble();

		return new ImovelVelho(codigo, endereco, valor, valorDesconto);
	}
}
