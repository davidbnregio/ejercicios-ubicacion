package com.banregio.ajedrez;

public class tablero {
	private static int tablero[][];
	private int numReinas;
	
	public tablero() {
		numReinas = 0;
		tablero = new int[8][8];
		for (int j = 0; j < 8; j++) {
			for (int k = 0; k < 8; k++) {
				tablero[j][k] = 0;
			}
		}
	}
	
	
	
	public int getNumReinas() {
		return numReinas;
	}
	
	public void inicio() {
		solucion(0);
	}
	
	public boolean solucion(int numReinas) {
		if (numReinas == 8) {
			System.out.print("LISTO!!!\n");
			this.mostrarTablero();
			return true;
		}
		else {
			for(int j = 0; j < 8; j++)
			{
				for(int k = 0; k < 8; k++)
				{
					if(desplazamiento(j,k) == 0) 
					{
						this.ubicacionReina(j, k, 0);
						numReinas++;
						if(solucion(numReinas))
						{
							return true;
						} else
						{
							this.ubicacionReina(j, k, 1);
							numReinas--;
						}
					}
				}
			}
		}
		return false;
	}
	
	
	//Desplazamientoxy
	public static int desplazamiento(int x, int y) {
		for (int j = 0; j <8; j++) {
			if (get(x,j) == 1)
			{
				return -1;
			}
			if (get(j,y) == 1) 
			{
				return -1;
			}
		}

	
	//Diagonal
	for (int j = 0; j < 8; j++) {
		
		if(get(x-j, y-j) == 1)
		{
			return -1;
		}
		
		if(get(x-j, y+j) == 1) 
		{
			return -1;
		}
		
		if(get(x+j, y-j) == 1) 
		{
			return -1;
		}
		
		if(get(x+j, y+j) == 1) 
		{
			return -1;
		}
		
		}
	return 0;
	}
	

	
	public int ubicacionReina(int x, int y, int type) {
		if (type == 0)
		{
			tablero[x][y] = 1;
			numReinas++;
			return 0;
			
		}else if(type == 1){
			tablero[x][y] = 0;
			return 0;
		}
		System.out.print("Incorrecto");
		return -3;
	}
	
	public static int get(int x, int y) {
		if (x < 0 || y < 0 || x > 7 || y > 7)
		{
		return -1;
		}
		return tablero[x][y];
	}
	
	public void mostrarTablero() {
		for (int j = 0; j < 8; j++) {
			for  (int k=0; k < 8; k++) {
				System.out.print(this.get(j,k) + " ");
			}
			System.out.print("\n");
		}
	}
	
}
