package prog3.arbol.binario.util;

import prog3.arbol.binario.ArbolBinario;
import prog3.listagenerica.*;

public class Recorrido<T> {

	public void imprimirPreOrder(ArbolBinario<T> aBinario) {
		System.out.println(aBinario.getDatoRaiz());
		if (!aBinario.getHijoIzquierdo().esVacio())
			aBinario.getHijoIzquierdo().preOrder();
		if (!aBinario.getHijoDerecho().esVacio())
			aBinario.getHijoDerecho().preOrder();	

	}

	public void imprimirInOrder(ArbolBinario<T> aBinario) {

	
		if (!aBinario.getHijoIzquierdo().esVacio())
			aBinario.getHijoIzquierdo().preOrder();
		System.out.println(aBinario.getDatoRaiz());
		if (!aBinario.getHijoDerecho().esVacio())
			aBinario.getHijoDerecho().preOrder();	
	}

	public void imprimirPostOrder(ArbolBinario<T> aBinario) {

		if (!aBinario.getHijoIzquierdo().esVacio())
			aBinario.getHijoIzquierdo().preOrder();
		
		if (!aBinario.getHijoDerecho().esVacio())
			aBinario.getHijoDerecho().preOrder();	
		System.out.println(aBinario.getDatoRaiz());

	}
	
	
	public static void main(String[] args){
		ArbolBinario<String> arbolBinarioB=new ArbolBinario<String>("¿Tiene 4 patas?");		
		ArbolBinario<String> hijoIzquierdoB=new ArbolBinario<String>("¿Se mueve?");
		ArbolBinario<String> hijoIzquierdoBB=new ArbolBinario<String>("¿Ladra?");
		hijoIzquierdoBB.agregarHijoIzquierdo(new ArbolBinario<String>("Es un perro"));
		hijoIzquierdoB.agregarHijoIzquierdo(hijoIzquierdoBB);
		ArbolBinario<String> hijoDerechoB=new ArbolBinario<String>("¿Tiene alguna pata?");
		arbolBinarioB.agregarHijoIzquierdo(hijoIzquierdoB);
		arbolBinarioB.agregarHijoDerecho(hijoDerechoB);
		Recorrido<String> recorrido= new Recorrido<String>();
		Adivinanza a = new Adivinanza();
		ListaGenericaEnlazada<String> l = new ListaGenericaEnlazada<String>();
		l = a.secuenciaConMasPreguntas(arbolBinarioB);
		System.out.println(l.toString());
	}
}
