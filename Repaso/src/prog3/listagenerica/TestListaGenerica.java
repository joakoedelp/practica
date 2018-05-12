package prog3.listagenerica;

public class TestListaGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaGenericaEnlazada<Integer> l = new ListaGenericaEnlazada<Integer>();
		l.agregarInicio(1);
		l.agregarInicio(2);
		l.agregarInicio(4);
		l.agregarInicio(14);
		l.agregarInicio(13);
		l.agregarInicio(3);
		System.out.println(l.toString());
		ListaGenericaEnlazada<Integer> l2 = new ListaGenericaEnlazada<Integer>();
		l2 = l.invertir();
		System.out.println(l2.toString());
	}

}
