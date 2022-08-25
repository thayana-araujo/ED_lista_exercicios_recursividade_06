package view;

import javax.swing.JOptionPane;

import controller.ControllerFat;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Metodo construtor
		ControllerFat cf = new ControllerFat();
		
		
//		variavel que recebe o número para calcular a série
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular a série "));
		
		
//      Validação se o número de entrada é maior que 10				
			    if (num > 10){
		            System.out.println("Informe um número até 10");
		    		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número até 10 para calcular a série "));
		        }
		        double result = cf.calcSerie(num);
		       
//		exibição do resultado
		System.out.println("Resultado da série : " + result +".");

		        
	

	}

}
