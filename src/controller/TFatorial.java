package controller;

public class TFatorial extends Thread{

	int N;
	int idThread;
	int resultR=0;
	int resultF=0;
	long tempInicial = 0;
	long tempFinal = 0;
	long tempTotal = 0;
	int func = 1;
	
	
	public TFatorial(int N, int idThread) {
		this.N = N;
		this.idThread = idThread;
	}
	public void run() {
		escolha();
	}
	private void escolha() {
		switch(idThread) {
		
			case 0: tempInicial = System.nanoTime();
					resultR = Recursiva(N);
					tempFinal = System.nanoTime();
					tempTotal = tempFinal - tempInicial;
					System.out.println("O fatorial do numero " + N + " é " + resultR + " por recursiva durou " + tempTotal);
					break;
					
			case 1: tempInicial = System.nanoTime();
					resultF = Funcao(N, func);
					tempFinal = System.nanoTime();
					tempTotal = tempFinal - tempInicial;
					System.out.println("O fatorial do numero " + N + " é " + resultF + " por função durou " + tempTotal);
					break;
			
		}
	}
	private static  int Recursiva(int N) {
		
		if(N > 1) {
			return N * Recursiva(N - 1);
		}
		else {
			return 1;
		}
	}
	private static int Funcao(int N, int func) {
		
		for(int i = N; i>1; i--){
			func = func * i;
		}
			
		return func;
		
	}
	
}
