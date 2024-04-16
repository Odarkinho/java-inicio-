package aplicacao;
import java.util.Scanner;


public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.println("informe o produto");
		produto.produto = teclado.next();
		
		System.out.println("informe a quantidade");
		produto.quantidade = teclado.nextDouble();
		
		System.out.println("informe o preço");
		produto.preco = teclado.nextDouble();
		
		System.out.println("confirmção: " + produto.produto +  "Estoque:  " + produto.quantidade +  "preço: "  + produto.preco);
		
		System.out.println("deseja inserir mais produtos? quantos: ");
     	int estoque = teclado.nextInt();
     	produto.addProduto(estoque);
     	
     	System.out.println("Atualização: " + produto.produto +  "estoque atual " + produto.quantidade + "preço" + produto.preco);
     	
      	System.out.println("atualmente... quanto foi vendido?");
	    estoque = teclado.nextInt();
	    produto.subProduto(estoque);
	    
	    System.out.println("Atualização pós: " + produto.produto +  "estoque atual " + produto.quantidade + "preço" + produto.preco);
	
     
		teclado.close();
	}

}
