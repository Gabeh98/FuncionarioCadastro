/*
 Cadastro de funcionarios Ex.8 
 15/09/21
 MIT License©
 Desenvolvido por Gabriel Henrique
 
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;
import builder.Builder;
import models.FuncionarioHorista;
import models.FuncionarioMensalista;
import resources.Menu;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Builder builder = new Builder();
		Menu menu = new Menu();
		ArrayList<FuncionarioHorista> listaDeFuncionariosHoristas = new ArrayList<FuncionarioHorista>();
		ArrayList<FuncionarioMensalista> listaDeFuncionariosMensalistas = new ArrayList<FuncionarioMensalista>();
		int opcao, insertOption;

		do {
			menu.display();
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				menu.insert();
				System.out.println("Tipo de funcionario");
				System.out.println("Add Funcionario Horista [1]");
				System.out.println("Add Funcionario Mensalistas [2]");
				insertOption = sc.nextInt();
				if (insertOption == 1)
					listaDeFuncionariosHoristas.add(builder.createFuncionarioHorista(sc));
				else if (insertOption == 2)
					listaDeFuncionariosMensalistas.add(builder.createFuncionarioMensalista(sc));
				else
					System.out.println("Opcao Invalida!!");
				break;
			case 2:
				menu.get();
				System.out.println("Lista de Horistas");
				for (FuncionarioHorista funcionario : listaDeFuncionariosHoristas) {
					System.out.println(funcionario);
				}
				System.out.println("Lista de Mensalistas");
				for (FuncionarioMensalista funcionario : listaDeFuncionariosMensalistas) {
					System.out.println(funcionario);
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
