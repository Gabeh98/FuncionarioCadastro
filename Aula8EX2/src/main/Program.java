package main;


import java.util.ArrayList;
import java.util.Scanner;

import builder.Builder;
import models.ImovelNovo;
import models.ImovelVelho;
import resources.Menu;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Builder builder = new Builder();
		Menu menu = new Menu();
		ArrayList<ImovelNovo> ListaImovelNovo = new ArrayList<ImovelNovo>();
		ArrayList<ImovelVelho> ListaImovelVelho = new ArrayList<ImovelVelho>();
		int opcao, insertOption;

		do {
			menu.display();
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				menu.insert();
				System.out.println("Tipo de Imovel");
				System.out.println("Add Imovel Novo [1]");
				System.out.println("Add Imovel Velho [2]");
				insertOption = sc.nextInt();
				if (insertOption == 1)
					ListaImovelNovo.add(builder.createImovelNovo(sc));
				else if (insertOption == 2)
					ListaImovelVelho.add(builder.createImovelVelho(sc));
				else
					System.out.println("Opcao Invalida!!");
				break;
			case 2:
				menu.get();
				System.out.println("Lista de Imoveis Novos");
				for (ImovelNovo imovel : ListaImovelNovo) {
					System.out.println(imovel);
				}
				System.out.println("Lista de Imoveis Velhos");
				for (ImovelVelho imovel : ListaImovelVelho) {
					System.out.println(imovel);
				}
				break;
			case 3:
				menu.exit();
				break;
			default:
				menu.invalid();
			}
		} while (opcao != 3);
		sc.close();

	}
}
