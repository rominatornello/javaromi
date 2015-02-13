package Patterns;

public class Contador extends Observable {
	 /*El constructor inicializa el estado del objeto: el maximo y el
	    *valor inicial, siempre en el rango 0..maximo. Adicionalmente,
	    *inicializa la parte de Observable que tiene un Contador...
	    */
	    public Contador(int valor, int maximo) {
	        super();
	        _maximo = maximo;
	        _valor = enRango(valor);
	    }
	 
	    //Este metodo privado asegura que un valor n esta entre 0..maximo
	    private int enRango(int n) {
	        if (n < 0) {
	            return 0;
	        } else if (n > _maximo) {
	            return _maximo;
	        } else {
	            return n;
	        }
	    }
	 
	    //Estos dos metodos permiten el acceso al estado del contador
	    public int valor() {
	        return _valor;
	    }
	 
	    public int maximo() {
	        return _maximo;
	    }
	 
	    /*Este metodo afecta al estado: primero se modifica de forma consistente
	    *el estado y despues se notifica a los observadores del cambio
	    */
	    public void incrementarContador(int n) {
	        _valor = enRango(_valor+n);
	        notificarObservadores();
	    }
	 
	    //Atributos privados que mantienen el estado del contador
	    private int _valor, _maximo;


}
