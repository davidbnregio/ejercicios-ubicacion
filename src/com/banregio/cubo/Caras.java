package com.banregio.cubo;

public class Caras {
	
	int cara[][]; 
	
	public Caras() {
	
	cara= new int[3][3];

}
	public void inicio() {
		
		cara[0][0] = 1;
		cara[0][1] = 1;
		cara[0][2] = 1;
		cara[1][0] = 1;
		cara[1][1] = 1;
		cara[1][2] = 1;
		cara[2][0] = 1;
		cara[2][1] = 1;
		cara[2][2] = 1;
			
		for (int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(cara[i][j] + " ");
			}
			System.out.println(" *");
		}
	}
	
	public void validacion() {
		
	}
	
	
	
}
