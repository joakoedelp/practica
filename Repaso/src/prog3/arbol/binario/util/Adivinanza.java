package prog3.arbol.binario.util;
import prog3.listagenerica.ListaGenericaEnlazada;
import prog3.arbol.binario.*;

public class Adivinanza {

	public void auxSecuencia(ListaGenericaEnlazada<String> l,ListaGenericaEnlazada<String> l2,ArbolBinario<String> ab){
			if (ab.esHoja()){
				l.agregarFinal(ab.getDatoRaiz());
			 if	(l.tamanio()>l2.tamanio()){
				 l2 = new ListaGenericaEnlazada<String>();
					l.comenzar();
					while(!l.fin()){
							l2.agregarFinal(l.proximo());
					}
				}
			 l.eliminarEn(l.tamanio()-1);
			}
			else {
				if(!ab.getHijoIzquierdo().esVacio()){
				l.agregarFinal(ab.getDatoRaiz());
				auxSecuencia(l,l2,ab.getHijoIzquierdo());
				l.eliminarEn(l.tamanio()-1);
			}
			if(!ab.getHijoDerecho().esVacio()){
			l.agregarFinal(ab.getDatoRaiz());
			auxSecuencia(l,l2,ab.getHijoDerecho());
			l.eliminarEn(l.tamanio()-1);
	}
	}
	}

	public ListaGenericaEnlazada<String> secuenciaConMasPreguntas(ArbolBinario<String> abinario){
			ListaGenericaEnlazada<String> l = new ListaGenericaEnlazada<String>();
            ListaGenericaEnlazada<String> l2 = new ListaGenericaEnlazada<String>();
			auxSecuencia(l,l2,abinario);
			return l2;
			
	}
		
	}

	

