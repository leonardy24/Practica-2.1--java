package app.curso.banco.main;




import app.curso.banco.entidad.*;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Cliente c1 = new Cliente(1, "Paco", "(+34)987 654 321", 0 );
	Gestor g1 = new Gestor (02, "pedro", "123 456 789", 7);
	
	Cliente c2H = new Cliente (1 , "ALE", "123456", 0);
	
	
	c2H.abrirCuenta("ES123", 88.0f);
	System.out.println("--------------------------------------");
	c2H.mostrarInfo();
	System.out.println("--------------------------------------");
	c2H.abrirCuenta("ES189", 48.0f);
	System.out.println("--------------------------------------");
	c2H.mostrarInfo();
	System.out.println("--------------------------------------");
	
	
	
	/*c1.mostrarInfo();
	System.out.println("--------------------------------------");
	c1.agregarDinero(122);
	System.out.println("--------------------------------------");
	c1.mostrarInfo();
	System.out.println("--------------------------------------");
	c1.retirarDinero(130);
	System.out.println("--------------------------------------");
	c1.mostrarInfo();
	System.out.println("--------------------------------------");

	g1.mostrarInfo();
	System.out.println("--------------------------------------");*/
	
	
	
	
	
	}

}
