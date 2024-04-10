package view;

import controller.TFatorial;

public class Principal {

	public static void main(String[] args) {
		
		int N = (int) ((Math.random()* 10) + 0);
		
		for(int idThread =0; idThread<2; idThread++) {
			Thread thread = new TFatorial(N, idThread);
			thread.start();
		}
		

	}

}
