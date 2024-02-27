package Controller;

public class Par {

	public Par() {
		super();
			
	}
	
	
	public int funcPar(int vet[], int tam) {
		
		if (tam < 0 ) {
			
			return 0;
			
		}
		
		if (vet[tam] % 2 != 0 ) {
			
			return funcPar(vet, tam - 1);
		}
		
		
		return 1 + funcPar(vet, tam - 1);
	}
	
	

}
