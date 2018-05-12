package prog3.listaenteros;

public class TestOrdenamientos {

	public static void main(String[] args) {
		ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();
		l.agregarInicio(6);
		l.agregarInicio(5);
		l.agregarInicio(4);
		l.agregarInicio(3);

		ListaDeEnterosEnlazada l2 = new ListaDeEnterosEnlazada();
		l2.agregarInicio(9);
		l2.agregarInicio(8);
		l2.agregarInicio(2);
		l2.agregarInicio(1);
		System.out.println(l.toString());
		System.out.println(l2.toString());
		ListaDeEnterosEnlazada l3 = new ListaDeEnterosEnlazada();
		l3 = l.combinarOrdenado(l2);
		System.out.println(l3.toString());

	}

}
