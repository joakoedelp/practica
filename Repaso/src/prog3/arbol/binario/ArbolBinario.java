package prog3.arbol.binario;

import prog3.listagenerica.ListaGenerica;
import prog3.listagenerica.ColaGenerica;
import prog3.listagenerica.ListaGenericaEnlazada;

public class ArbolBinario<T> {

	private NodoBinario<T> raiz;
	
	public ArbolBinario(){		
		this.raiz = null;
	}
	
	public ArbolBinario(T dato){		
		this.raiz = new NodoBinario<T>(dato);
	}	
	
	private ArbolBinario(NodoBinario<T> nodo){		
		this.raiz = nodo;
	}
	
	private NodoBinario<T> getRaiz(){		
		return raiz;
	}
	
	public T getDatoRaiz(){
		if (this.getRaiz() != null){
			return this.getRaiz().getDato();
		}else{
			return null;
		}
	}
	
	public ArbolBinario<T> getHijoIzquierdo(){		
		return new ArbolBinario<T>(this.raiz.getHijoIzquierdo());
	}
	
	public ArbolBinario<T> getHijoDerecho(){		
		return new ArbolBinario<T>(this.raiz.getHijoDerecho());
	}	
	
	public void agregarHijoIzquierdo(ArbolBinario<T> hijo){		
		this.raiz.setHijoIzquierdo(hijo.getRaiz());
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo){		
		this.raiz.setHijoDerecho(hijo.getRaiz());
	}	
	
	public void eliminarHijoIzquierdo(){		
		this.raiz.setHijoIzquierdo(new NodoBinario<T>(null));
	}
	
	public void eliminarHijoDerecho(){		
		this.raiz.setHijoDerecho(new NodoBinario<T>(null));
	}	
	
	public boolean esVacio(){
		return this.raiz==null;
	}
	
	public boolean esHoja(){
		return this.getDatoRaiz()!=null && this.getHijoIzquierdo().esVacio() && this.getHijoDerecho().esVacio();
	}
	
	public void preOrder() {
		System.out.println(this.getDatoRaiz());
		if (!this.getHijoIzquierdo().esVacio())
		this.getHijoIzquierdo().preOrder();
		if (!this.getHijoDerecho().esVacio())
			this.getHijoDerecho().preOrder();	
	}
	
	public void inOrder() {
		if (!this.getHijoIzquierdo().esVacio())
			this.getHijoIzquierdo().preOrder();
		System.out.println(this.getDatoRaiz());
		if (!this.getHijoDerecho().esVacio())
			this.getHijoDerecho().preOrder();	
	}
	public void postOrder() {
		if (!this.getHijoIzquierdo().esVacio())
			this.getHijoIzquierdo().preOrder();
		if (!this.getHijoDerecho().esVacio())
			this.getHijoDerecho().preOrder();	
		System.out.println(this.getDatoRaiz());	
	}
	
	public void recursion(ListaGenerica<T> l) {
		if (!this.getHijoIzquierdo().esVacio())
			this.getHijoIzquierdo().frontera();
		if (!this.getHijoDerecho().esVacio())
			this.getHijoDerecho().frontera();
		if(this.esHoja())
			l.agregarInicio(this.getDatoRaiz()); 
	}
	
	public ListaGenerica<T> frontera(){
		ListaGenerica<T> l = new ListaGenericaEnlazada<T>();
		recursion(l);
		return l;
	}
	

	public boolean lleno() {
		ArbolBinario<T> ab = null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		int cantNodos = 1 ;
		int nivel = 0;
		boolean t = true;
		cola.encolar(this);
		cola.encolar(null);
		while(!cola.esVacia() && t) {
			ab = cola.desencolar();
			if (ab != null) {
				System.out.print(ab.getDatoRaiz());
				if (!ab.getHijoIzquierdo().esVacio()) {
				cola.encolar(ab.getHijoIzquierdo());
				cantNodos++;
				}
				if (!ab.getHijoDerecho().esVacio()) {
				cola.encolar(ab.getHijoDerecho());
				cantNodos++;
				}
				} else
				if (!cola.esVacia()) {
				nivel++;
				if (Math.pow(2,nivel) != cantNodos)
					t = false;
				cola.encolar(null);
				cantNodos = 0 ;
				
			}
				}
			
	
		return true;
	}
	
	public boolean completo() {
		ArbolBinario<T> ab = null;
    ListaGenerica<ArbolBinario<T>> list = new ListaGenericaEnlazada<ArbolBinario<T>>();;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		int cantNodos = 1 ;
		int nivel = 0;
		boolean t = true;
		cola.encolar(this);
		cola.encolar(null);
		while(!cola.esVacia() && t) {
			ab = cola.desencolar();
			if (ab != null) {
				list.agregarFinal(ab);
				if (!ab.getHijoIzquierdo().esVacio()) {
				cola.encolar(ab.getHijoIzquierdo());
				cantNodos++;
				}
				if (!ab.getHijoDerecho().esVacio()) {
				cola.encolar(ab.getHijoDerecho());
				cantNodos++;
				}
				} else
				if (!cola.esVacia()) {
				nivel++;
        
				if (Math.pow(2,nivel) != cantNodos)
					t = false;
        else{
				cola.encolar(null);
        list = new ListaGenericaEnlazada<ArbolBinario<T>>();
				cantNodos = 0 ;
      }
				
			}
				}
		if (t)
    	       return t;
    else{
      boolean aux = false;
      ArbolBinario<T> arb = list.proximo();
     

 
          arb = list.proximo();
      }
    
	
		return t;
	}
	
	
}