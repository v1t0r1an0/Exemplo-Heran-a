
public class carro  extends veiculo{


	private boolean quatroPortas;
	
	public boolean isQuatroPortas() {
		
		return quatroPortas;
		
	}
	
	public void setQuatroPortas(boolean quatroPortas) {
		
		this.quatroPortas = quatroPortas;
		
	}
	
	@Override //Sobrescreve o m�todo imprimir dados
	public void imprimirDados() {
		// TODO Auto-generated method stub
		super.imprimirDados();//super = realiza o m�todo da classe e depois executa o restante
		
		System.out.println("Quatro Portas: " + quatroPortas);
		
	}
	
}
