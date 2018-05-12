package prog3.listagenerica;

public class ColaGenerica<T> {
	private ListaGenericaEnlazada<T> l;
	
	public ColaGenerica(){
		l = new ListaGenericaEnlazada<T>();
	}
	
	public void encolar(T dato) {
		l.comenzar();
		l.agregarFinal(dato);
	}
	
	public T desencolar() {
		l.comenzar();
		return l.proximo();
	}
	public boolean esVacia() {
		return (l.esVacia());
	}

}
