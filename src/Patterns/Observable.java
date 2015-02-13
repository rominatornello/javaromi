package Patterns;

import java.util.ArrayList;

public abstract class Observable {

	//El constructor crea el vector con la asociacion Observable-Observador
    public Observable() {
        _observadores = new ArrayList<Observador>();
    }
 
    //Agregar y eliminar sencillamente operan sobre vector _observadores...
    public void agregarObservador(Observador o) {
        _observadores.add(o);
    }
 
    public void eliminarObservador(Observador o) {
        _observadores.remove(o);
    }
 
    //Notificacion: Para cada observador se invoca el método actualizar().
    public void notificarObservadores() {
        for (Observador o:_observadores) {
            o.actualizar();
        }
    }
 
    //Este atributo privado mantiene el vector con los observadores
    private ArrayList<Observador> _observadores;
	
}
