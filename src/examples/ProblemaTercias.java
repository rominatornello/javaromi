package examples;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProblemaTercias {
	
	private static Scanner sc;

	public static void main (String [] args){		
		System.out.println("Por favor ingrese tres o mas numeros distintos o -1 para salir");		 	
		 ArrayList<Integer>arraylist = new ArrayList<>();		 
		 sc = new Scanner(System.in);
		 while(true){
			 int n = sc.nextInt();
			 if(n==-1)
				 break;
			 arraylist.add(n);
		 }
		 try {
			AreMoreThatThree(arraylist);
			calculateTripletas(arraylist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	
	static void calculateTripletas(ArrayList<Integer> numbers){
		Collections.sort(numbers);
		
		 for(int i=0;i<numbers.size();i++){ 
			 System.out.println(numbers.get(i));
		 }
		 ArrayList<Triplet> tripletList =new ArrayList<Triplet>();
		 int cantidad = 0 ;
		 int cantidadAritmeticas = 0 ;
		 
		 for(int i=0; i<=(numbers.size()-3);i++){
			 for(int j = 1; j<=(numbers.size()-2) ; j++){
				 for(int k = j+1; k <=numbers.size() -1; k++){
					 if(i!=j && j!=k){
						 try {
							checkIsAreEquales(numbers.get(i),numbers.get(j),numbers.get(k));
							Triplet triplet = new Triplet(numbers.get(i),numbers.get(j),numbers.get(k));
							 tripletList.add(cantidad, triplet);												
							 if (triplet.isSucesion())
								 cantidadAritmeticas = cantidadAritmeticas+1;
							 cantidad = cantidad+1;
						} catch (Exception e) {
							e.printStackTrace();
						}						 
					 }
					 }				
				 }
			 }
		 System.out.println("La cantidad de sucesiones son:" + cantidad);
		 System.out.println("La cantidad de sucesiones aritmeticas son:" + cantidadAritmeticas);	
	}
	
	static void checkIsAreEquales(int num1,int num2, int num3) throws Exception{
		if(num1 == num2 || num2 == num3 ||num1 == num3)
			throw new Exception("No puede ingresar numeros iguales");
		
	}
	
	static void AreMoreThatThree(ArrayList<Integer>arraylist) throws Exception{
		if(arraylist.size()<3)
			throw new Exception("Tiene que ingresar mas de tres numeros");
		
	}
	  
}
 


 //todo
//agregar exepcion de si son iguales
//agregar atributo a triplex si es sucesion  LISTO
//poder ingresar  x cantidad de numeros para las tripletas LISTO
//usar el ordenador del collecion LISTO SE USO EL ORDENADOR DE ARRAY
//separar el ingreso por teclado de el armado de tripletas LISTO�

