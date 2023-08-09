package br.com.fiap.manin;

import javax.swing.JOptionPane;

import br.com.fiap.Produto;

public class Teste {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	static double valorTotal(Produto[] p , int i){
		double total=0;
		
		for(int c= 0; c < i; c++) {
			total += p[c].getValor()* p[c].getQuantidade();
			
		}
		return total;
	}
	
	public static void main(String[] args) {
	
		Produto[] vetorProdutos = new Produto[3];
		
		int indice = 0;
		
		do {
			vetorProdutos[indice] = new Produto();
			vetorProdutos[indice].setTipo(texto("Tipo de Produto: "));
			vetorProdutos[indice].setMarca(texto("Nome da marca:  "));
			vetorProdutos[indice].setQuantidade(inteiro("Quantidade: "));
			vetorProdutos[indice].setValor(real("Valor: "));
		
			indice ++;
		}while(JOptionPane.showConfirmDialog(null,"adicionar produto no carrinho?", 
			"carrinho de compras",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
		for (int contador =0; contador < indice; contador ++) {
			System.out.println("Tipo: " + vetorProdutos[contador].getTipo()+
								"\nMarca: "+ vetorProdutos[contador].getMarca()+
								"\nQuantidade: "+ vetorProdutos[contador].getQuantidade()+
								"\nValor: "+ vetorProdutos[contador].getValor());
		}

		System.out.println("valor total");
		
	}
	

}