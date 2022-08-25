package controller;

public class ControllerFat {
	
	 public ControllerFat() {
	        super();
	    }

		public double calcFatorial(double num){
			
			
			//condição de parada
			//Se o número de entrada for igual ou menor que 1, então o retorno será 1
			if(num <= 1) {
			return 1;
			}
			//Se o número informado pelo usuário for maior que 1, então será calculado o fatorial deste número. 
			return num * calcFatorial(num - 1);
		}
		
		
		public double calcSerie(double num) {
			
			
	//Se o número de entrada for um o retorno será um.				
		    if (num == 1){
	            return 1;
	        }else {
	//Retorno da série     
	            return 1 / calcFatorial(num) + calcSerie(num - 1);
	        }
	    }

}
