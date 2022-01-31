package com.banregio.sudoku;

public class main {

	public static void main(String argvs[])  
	{  
	  
	// 9x9 sudoku  
	int[][] b = new int[][] { { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
        { 6, 7, 2, 1, 9, 5, 3, 4, 8 },   
        { 1, 9, 8, 3, 4, 2, 5, 6, 7 },   
        { 8, 5, 9, 7, 6, 1, 4, 2, 3 },   
        { 4, 2, 6, 8, 5, 3, 7, 9, 1 },   
        { 7, 1, 3, 9, 2, 4, 8, 5, 6 },   
        { 9, 6, 1, 5, 3, 7, 2, 8, 4 },   
        { 2, 8, 7, 4, 1, 9, 6, 3, 5 },   
        { 3, 4, 5, 2, 8, 6, 1, 7, 9 }
        
        };  
	  
	
	sudoku objSudoku = new sudoku();  
	  
	// Guarda el Tamaño
	int size = b.length;  
	  
	System.out.println("El tablero inicial: "); 
	
	
	for(int i = 0; i < size; i++)
		{  
	for(int j = 0; j < size; j++)  
		{  
		System.out.print(b[i][j] + " ");    
		}  
	  
		System.out.println();  
		}  
		System.out.println(); 
	
	//valida
	if (objSudoku.solveSudoku(b, size))  
		{ 	
	//Muestra Solución
	System.out.println("Solución: ");
	objSudoku.display(b, size);  
		}  
		else	
			{  
			System.out.println("No hay solución.");  
			}  
		}
	
		}  

