package controller;

public class ControllerFat {
	
	 public ControllerFat() {
	        super();
	    }

		public double calcFatorial(double num){
			
			
			//condi��o de parada
			//Se o n�mero de entrada for igual ou menor que 1, ent�o o retorno ser� 1
			if(num <= 1) {
			return 1;
			}
			//Se o n�mero informado pelo usu�rio for maior que 1, ent�o ser� calculado o fatorial deste n�mero. 
			return num * calcFatorial(num - 1);
		}
		
		
		public double calcSerie(double num) {
			
			
	//Se o n�mero de entrada for um o retorno ser� um.				
		    if (num == 1){
	            return 1;
	        }else {
	//Retorno da s�rie     
	            return 1 / calcFatorial(num) + calcSerie(num - 1);
	        }
	    }

}
