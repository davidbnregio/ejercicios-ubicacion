package com.banregio.cubo;

public class main {

	public static void main(String[] args)
	{
	Cubo cubo = new Cubo();
	cubo.iniciaPiezas();
	cubo.imprimePiezas();
	cubo.movHorizontal("U",0);
	cubo.movHorizontal("D",0);
	cubo.imprimePiezas();
	}
}
