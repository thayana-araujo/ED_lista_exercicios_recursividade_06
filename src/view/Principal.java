package view;

import javax.swing.JOptionPane;

import controller.ControllerFat;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Metodo construtor
		ControllerFat cf = new ControllerFat();
		
		
//		variavel que recebe o n�mero para calcular a s�rie
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para calcular a s�rie "));
		
		
//      Valida��o se o n�mero de entrada � maior que 10				
			    if (num > 10){
		            System.out.println("Informe um n�mero at� 10");
		    		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero at� 10 para calcular a s�rie "));
		        }
		        double result = cf.calcSerie(num);
		       
//		exibi��o do resultado
		System.out.println("Resultado da s�rie : " + result +".");

		        
	

	}

}
