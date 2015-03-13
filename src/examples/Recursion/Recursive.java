package examples.Recursion;

public class Recursive {
	
	
	public static void main (String [] args){	

		Recursive re=new Recursive();
		//int invertido = re.invertir(123);
		//System.out.print(invertido);
		int invertidoRecursive = re.sumar(5);
		System.out.print(invertidoRecursive);
	}

	 int invertir (int n) {
		 int numero_invertido = 0 ;
		 int division = n ;
		 int resto_division = 0;
		 while (division != 0) {
			 resto_division = division % 10 ;
			 division = division / 10 ;
			 numero_invertido = numero_invertido * 10 + resto_division; 
		
		}
		return numero_invertido;
	 }
	 
	 public int sumar(int a){
	        if(a>0){
	            return a+sumar(a-1);
	        }
	        else{
	            return 0;
	        }
	        }
}
