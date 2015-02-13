package Patterns;

public class MainPatterns {
	
	public static void main(String... argv) {		 
		
		Contador c = new Contador(0,255);		 
	    Detector d = new Detector();
	    
	    c.agregarObservador(d);
	    c.incrementarContador(5);
	
	    ValorContador v = new ValorContador(c);
	    c.agregarObservador(v);
	    c.incrementarContador(5);
	
	    Medidor m = new Medidor(c);
	    c.agregarObservador(m);
	    c.eliminarObservador(d);	    
	    c.incrementarContador(19);
	    
	 }
    
}
