package controleEstoque; 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu extends Produto {

	List<Produto> produtos = new ArrayList<>();
	
	private void exibirMenu() {
		System.out.println("CONTROLE DE ESTOQUE");
		System.out.println("1. Cadastrar Produto");
		System.out.println("2. Verificar Estoque");
		System.out.println("3. Calcular Custo");
		System.out.println("4. Sair");
	}

	private void cadastrarProduto() {
		
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();

		System.out.print("Produto: ");
		produto.setNome(sc.nextLine());

		System.out.print("Quantidade: ");
		produto.setQnt(sc.nextInt());

		System.out.print("Preço: ");
		produto.setPreco(sc.nextFloat());

		produtos.add(produto);
	}

	private void exibirProduto() {
		for (Produto p : produtos) {
			System.out.println("Nome: " + p.getNome());
			System.out.println("Quantidade: " + p.getQnt());
			System.out.println("Preço: " + p.getPreco());
		}
	}

	private void CalcularCusto() {
		int i = 0 ; 
		for ( i = 0; i < produtos.size(); i ++) { 
			custoTotal = (int) (qnt * preco);
			System.out.println(custoTotal);
		}
		
	}

	public static void main(String[] args) {
		short opcao; 
		Scanner sc = new Scanner(System.in); 
		Menu menu = new Menu(); 
		
		do { 
			menu.exibirMenu();
			
			System.out.print("Opção Menu:  ");
			opcao = sc.nextShort(); 
			
			switch(opcao) { 
				case 1 : 
					System.out.println("/////////");
					menu.cadastrarProduto();
					break; 
				case 2: 
					System.out.println("PRODUTOS EM ESTOQUE");
					System.out.println("/////////");
					menu.exibirProduto();
					System.out.println("/////////");
					break;
				case 3: 
					System.out.println("CUSTO TOTAL DOS PRODUTOS");
					System.out.println("/////////");
					menu.CalcularCusto();
					System.out.println("/////////");
					break; 
			}
		}while(opcao != 4); 
			System.out.println("USUÁRIO SAIU DO MENU!  ");
	}

}