package br.com.fiap.manin;

import javax.swing.JOptionPane;

import br.com.fiap.Produto;

public class TesteDois {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	public static void main(String[] args) {
		Produto[] vetorProduto = new Produto[3];
		
		int indice =0;
		int continuar =0;
		
		while(continuar ==0){
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setTipo(texto("Tipo de Produto: "));
			vetorProduto[indice].setMarca(texto("Nome da marca:  "));
			vetorProduto[indice].setQuantidade(inteiro("Quantidade: "));
			vetorProduto[indice].setValor(real("Valor: "));
			indice ++;
		
			continuar= JOptionPane.showConfirmDialog(null, "adicionar produto?",
					"carrinho de compras", JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			
		}
		
		
		}
	
	
	}

