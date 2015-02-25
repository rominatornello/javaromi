package examples;


import java.util.*;

public class ProblemaTercias {
	
	private static Scanner sc;

	public static void main (String [] args){
		System.out.println("Por favor ingrese tres o mas numeros distintos o -1 para salir");
		SortedSet<Integer>sortedSet = new TreeSet<Integer>();
		ProblemaTercias pt = new ProblemaTercias();

		sc = new Scanner(System.in);
		 while(true){
			 int n = sc.nextInt();
			 if(n==-1)
				 break;
			 sortedSet.add(n);

		 }
		 try {
			pt.AreMoreThatThree(sortedSet);
			pt.calculateTriplets(sortedSet);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	 void calculateTriplets(SortedSet<Integer> sortedSet){

		 ArrayList<Triplet> tripletList =new ArrayList<Triplet>();
		 ArrayList <Integer> numbers = new ArrayList<Integer>();
		 numbers.addAll(sortedSet);

		 int quantity = 0 ;
		 int arithmeticQuantity = 0 ;

		 for(int i=0; i<=(numbers.size()-3);i++){
			 for(int j = 1; j<=(numbers.size()-2) ; j++){
				 for(int k = j+1; k <=numbers.size() -1; k++){
					 if(i!=j && j!=k){
						 try {
							 if(areDifferent(numbers.get(i),numbers.get(j),numbers.get(k))){
								 Triplet triplet = new Triplet(numbers.get(i),numbers.get(j),numbers.get(k));
								 tripletList.add(quantity, triplet);
								 if (triplet.isSucesion())
									 arithmeticQuantity = arithmeticQuantity+1;
								 quantity = quantity+1;
							 }
						 } catch (Exception e) {
							 e.printStackTrace();
						 }
					 }
				 }
			 }
		 }
		 System.out.println("La quantity de sucesiones son:" + quantity);
		 System.out.println("La quantity de sucesiones aritmeticas son:" + arithmeticQuantity);
	}


	 void AreMoreThatThree(SortedSet<Integer>sortedlist) throws Exception{
		if(sortedlist.size()<3)
			throw new Exception("Tiene que ingresar mas de tres numeros diferentes");
		
	}

	 boolean areDifferent(Integer int1, Integer int2, Integer int3) {
		if(int1 !=int2 && int1 != int3 && int2!=int3)
			return true;
		else
			return false;
	}
	  
}
 


 //todo
//agregar exepcion de si son iguales
//agregar atributo a triplex si es sucesion  LISTO
//poder ingresar  x cantidad de numeros para las tripletas LISTO
//usar el ordenador del collecion LISTO SE USO EL ORDENADOR DE ARRAY
//separar el ingreso por teclado de el armado de tripletas LISTO�

//todo version 2
//agregar validacion tripleta de si son eguales no te deje crearlos antes de crear tripletas
