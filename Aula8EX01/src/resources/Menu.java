package resources;

public class Menu {
	
	public void display(){
        System.out.println("\tCadastro de Funcionario");
        System.out.println("1. Inserir");
        System.out.println("2. Exibir");
        System.out.println("3. Fim");
        System.out.println("Opcao:");
    }
	
    public void insert(){
        System.out.println("Você entrou no método Inserir.");
    }
    
    public void get(){
        System.out.println("Você entrou no método Exibir.");
    }
    
    public void exit(){
        System.out.println("Bye!");
    }

    public void invalid() {
    	System.out.println("Opção invalida!");
    }
}
