
public class main {
	
	public static void main(String[] args) {
		
		carro carro1 = new carro();
		
		System.out.println();
		
		carro1.ano = 2003;
		carro1.setMarca("Chevrolet");
		carro1.setModelo("Astra");
		carro1.setQuatroPortas(true);
		carro1.buzinar();
		carro1.imprimirDados();
		
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		
		moto moto1 = new moto();
		
		System.out.println();
		
		moto1.setAno(2010);
		moto1.setMarca("Honda");
		moto1.setModelo("150");
		moto1.empinar();
		moto1.buzinar();
		moto1.imprimirDados();
		
	}
	
}
