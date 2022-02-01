package com.banregio.cubo;

public class Cubo {

	private PiezaCentro pcentro[];
	private PiezaLateral plateral[];
	private PiezaEsquina pesquina[];
	
	public Cubo() 
	{
		pcentro = new PiezaCentro[6];
		for (int i = 0; i < pcentro.length; i++)
		{
			pcentro[i] = new PiezaCentro();
		}
		
		plateral = new PiezaLateral[12];
		for (int i = 0; i < plateral.length; i++)
		{
			plateral[i] = new PiezaLateral();
		}
		
		pesquina = new PiezaEsquina[8];
		for (int i = 0; i < pesquina.length; i++)
		{
			pesquina[i] = new PiezaEsquina();
		}
	}
	
	public String bCentro(String dir)
	{
		boolean estaPieza = false;
		String color = "";
		int i = 0;
		int j = 0;
		while (i < pcentro.length && !estaPieza) {
			j = 0;
			while(j < pcentro[i].elemento.dir.length && !estaPieza) {
				if (pcentro[i].elemento.dir[j] == dir) {
					estaPieza = true;
					color = pcentro[i].elemento.color[j];
				}else j++;
			}
			i++;
		}
		return color;
	}
	
	public String bLateral(String dir1, String dir2, String dirColor)
	{
		boolean estaPieza = false;
		boolean posicionamiento1 = false;
		boolean posicionamiento2 = false;
		int i = 0;
		int j = 0;
		int k = 0;
		String color = " ";
		
		while (i < plateral.length && !estaPieza) {
			j = 0;
			while (j < plateral[i].elemento.dir.length && !posicionamiento1) 
			{
				if (plateral[i].elemento.dir[j] == dir1) {
					posicionamiento1 = true;
				} else
					j++;
				}
				k = 0;
				while (k < plateral[i].elemento.dir.length && !posicionamiento2) {
					if (plateral[i].elemento.dir[k] == dir2) {
						posicionamiento2 = true;
					} else
						k++;
				}
				if (posicionamiento1 && posicionamiento2) {
					if (dir1 == dirColor)
						color = plateral[i].elemento.color[j];
					else
						color = plateral[i].elemento.color[k];
					estaPieza = true;
				} else {
					posicionamiento1 = false;
					posicionamiento2 = false;
					i++;
				}
				}
				return color;
	}
	
	public String bEsquina(String dir1, String dir2, String dir3,
			String dirColor) 
	{
			boolean estaPieza = false;
			boolean posicionamiento1 = false;
			boolean posicionamiento2 = false;
			boolean posicionamiento3 = false;
			int i = 0, j = 0, k = 0, l = 0;
			String color = " ";

			while (i < pesquina.length && !estaPieza) {
				j = 0;
				while (j < pesquina[i].elemento.dir.length && !posicionamiento1) {
					if (pesquina[i].elemento.dir[j] == dir1) {
						posicionamiento1 = true;
					} else
						j++;
				}
				k = 0;
				while (k < pesquina[i].elemento.dir.length && !posicionamiento2) {
					if (pesquina[i].elemento.dir[k] == dir2) {
						posicionamiento2 = true;
					} else
						k++;
				}
				l = 0;
				while (l < pesquina[i].elemento.dir.length && !posicionamiento3) {
					if (pesquina[i].elemento.dir[l] == dir3) {
						posicionamiento3 = true;
					} else
						l++;
				}
				if (posicionamiento1 && posicionamiento2 && posicionamiento3) {
					if (dir1 == dirColor)
						color = pesquina[i].elemento.color[j];
					else if (dir2 == dirColor)
						color = pesquina[i].elemento.color[k];
					else
						color = pesquina[i].elemento.color[l];
					estaPieza = true;
				} else {
					posicionamiento1 = false;
					posicionamiento2 = false;
					posicionamiento3 = false;
					i++;
				}
				}
				return color;
				}
	
	public void imprimePiezas() {
		System.out.println(" " + bEsquina("U", "L", "B", "U") +
		bLateral("U", "B", "U") + bEsquina("U", "R", "B", "U"));
		System.out.println(" " + bLateral("U", "L", "U") +
		bCentro("U") + bLateral("U", "R", "U"));
		System.out.println(" " + bEsquina("U", "F", "L", "U") +
		bLateral("U", "F", "U") + bEsquina("U", "F", "R", "U"));
		System.out.print("" + bEsquina("L", "U", "B", "L") +
		bLateral("L", "U", "L") + bEsquina("L", "U", "F", "L") + " ");
		System.out.print("" + bEsquina("F", "U", "L", "F") +
		bLateral("F", "U", "F") + bEsquina("F", "U", "R", "F") + " ");
		System.out.print("" + bEsquina("F", "U", "R", "R") +
		bLateral("R", "U", "R") + bEsquina("R", "U", "B", "R") + " ");
		System.out.println("" + bEsquina("B", "U", "R", "B") +
		bLateral("B", "U", "B") + bEsquina("B", "U", "L", "B") + " ");
		System.out.print("" + bLateral("L", "B", "L") +
		bCentro("L") + bLateral("L", "F", "L") + " ");
		System.out.print("" + bLateral("L", "F", "F") +
		bCentro("F") + bLateral("F", "R", "F") + " ");
		System.out.print("" + bLateral("F", "R", "R") +
		bCentro("R") + bLateral("R", "B", "R") + " ");

		System.out.println("" + bLateral("R", "B", "B") +
		bCentro("B") + bLateral("L", "B", "B") + " ");
		System.out.print("" + bEsquina("L", "D", "B", "L") +
		bLateral("L", "D", "L") + bEsquina("L", "D", "F", "L") + " ");
		System.out.print("" + bEsquina("F", "D", "L", "F") +
		bLateral("F", "D", "F") + bEsquina("F", "D", "R", "F") + " ");
		System.out.print("" + bEsquina("F", "D", "R", "R") +
		bLateral("R", "D", "R") + bEsquina("R", "D", "B", "R") + " ");
		System.out.println("" + bEsquina("B", "D", "R", "B") +
		bLateral("B", "D", "B") + bEsquina("B", "D", "L", "B") + " ");
		System.out.println(" " + bEsquina("D", "L", "F", "D") +
		bLateral("D", "F", "D") + bEsquina("D", "F", "R", "D"));
		System.out.println(" " + bLateral("D", "L", "D") +
		bCentro("D") + bLateral("D", "R", "D"));
		System.out.println(" " + bEsquina("D", "L", "B", "D") +
		bLateral("D", "B", "D") + bEsquina("D", "R", "B", "D"));
		System.out.println("");
		}
		public void iniciaPiezas() {
		pcentro[0].elemento.dir[0] = "R";
		pcentro[1].elemento.color[0] = "Y";
		pcentro[1].elemento.dir[0] = "F";
		pcentro[2].elemento.color[0] = "R";
		pcentro[2].elemento.dir[0] = "U";
		pcentro[3].elemento.color[0] = "G";
		pcentro[3].elemento.dir[0] = "L";
		pcentro[4].elemento.color[0] = "O";
		pcentro[4].elemento.dir[0] = "D";
		pcentro[5].elemento.color[0] = "W";
		pcentro[5].elemento.dir[0] = "B";
		plateral[0].elemento.color[0] = "R";
		plateral[0].elemento.dir[0] = "U";
		plateral[0].elemento.color[1] = "Y";
		plateral[0].elemento.dir[1] = "F";
		plateral[1].elemento.color[0] = "B";
		plateral[1].elemento.dir[0] = "R";
		plateral[1].elemento.color[1] = "Y";
		plateral[1].elemento.dir[1] = "F";
		plateral[2].elemento.color[0] = "O";
		plateral[2].elemento.dir[0] = "D";
		plateral[2].elemento.color[1] = "Y";
		plateral[2].elemento.dir[1] = "F";
		plateral[3].elemento.color[0] = "G";
		plateral[3].elemento.dir[0] = "L";
		plateral[3].elemento.color[1] = "Y";
		plateral[3].elemento.dir[1] = "F";
		plateral[4].elemento.color[0] = "R";
		plateral[4].elemento.dir[0] = "U";
		plateral[4].elemento.color[1] = "B";
		plateral[4].elemento.dir[1] = "R";
		plateral[5].elemento.color[0] = "R";
		plateral[5].elemento.dir[0] = "U";
		plateral[5].elemento.color[1] = "G";
		plateral[5].elemento.dir[1] = "L";
		plateral[6].elemento.color[0] = "O";
		plateral[6].elemento.dir[0] = "D";
		plateral[6].elemento.color[1] = "B";
		plateral[6].elemento.dir[1] = "R";

		plateral[7].elemento.color[0] = "O";
		plateral[7].elemento.dir[0] = "D";
		plateral[7].elemento.color[1] = "G";
		plateral[7].elemento.dir[1] = "L";
		plateral[8].elemento.color[0] = "R";
		plateral[8].elemento.dir[0] = "U";
		plateral[8].elemento.color[1] = "W";
		plateral[8].elemento.dir[1] = "B";
		plateral[9].elemento.color[0] = "G";
		plateral[9].elemento.dir[0] = "L";
		plateral[9].elemento.color[1] = "W";
		plateral[9].elemento.dir[1] = "B";
		plateral[10].elemento.color[0] = "B";
		plateral[10].elemento.dir[0] = "R";
		plateral[10].elemento.color[1] = "W";
		plateral[10].elemento.dir[1] = "B";
		plateral[11].elemento.color[0] = "O";
		plateral[11].elemento.dir[0] = "D";
		plateral[11].elemento.color[1] = "W";
		plateral[11].elemento.dir[1] = "B";
		pesquina[0].elemento.color[0] = "R";
		pesquina[0].elemento.dir[0] = "U";
		pesquina[0].elemento.color[1] = "Y";
		pesquina[0].elemento.dir[1] = "F";
		pesquina[0].elemento.color[2] = "B";
		pesquina[0].elemento.dir[2] = "R";
		pesquina[1].elemento.color[0] = "R";
		pesquina[1].elemento.dir[0] = "U";
		pesquina[1].elemento.color[1] = "Y";
		pesquina[1].elemento.dir[1] = "F";
		pesquina[1].elemento.color[2] = "G";
		pesquina[1].elemento.dir[2] = "L";
		pesquina[2].elemento.color[0] = "O";
		pesquina[2].elemento.dir[0] = "D";
		pesquina[2].elemento.color[1] = "Y";
		pesquina[2].elemento.dir[1] = "F";
		pesquina[2].elemento.color[2] = "B";
		pesquina[2].elemento.dir[2] = "R";
		pesquina[3].elemento.color[0] = "O";
		pesquina[3].elemento.dir[0] = "D";
		pesquina[3].elemento.color[1] = "Y";
		pesquina[3].elemento.dir[1] = "F";
		pesquina[3].elemento.color[2] = "G";
		pesquina[3].elemento.dir[2] = "L";
		pesquina[4].elemento.color[0] = "R";
		pesquina[4].elemento.dir[0] = "U";
		pesquina[4].elemento.color[1] = "B";
		pesquina[4].elemento.dir[1] = "R";
		pesquina[4].elemento.color[2] = "W";
		pesquina[4].elemento.dir[2] = "B";
		pesquina[5].elemento.color[0] = "R";
		pesquina[5].elemento.dir[0] = "U";
		pesquina[5].elemento.color[1] = "G";
		pesquina[5].elemento.dir[1] = "L";
		pesquina[5].elemento.color[2] = "W";
		pesquina[5].elemento.dir[2] = "B";
		pesquina[6].elemento.color[0] = "O";
		pesquina[6].elemento.dir[0] = "D";
		pesquina[6].elemento.color[1] = "B";
		pesquina[6].elemento.dir[1] = "R";

		pesquina[6].elemento.color[2] = "W";
		pesquina[6].elemento.dir[2] = "B";
		pesquina[7].elemento.color[0] = "O";
		pesquina[7].elemento.dir[0] = "D";
		pesquina[7].elemento.color[1] = "G";
		pesquina[7].elemento.dir[1] = "L";
		pesquina[7].elemento.color[2] = "W";
		pesquina[7].elemento.dir[2] = "B";
		}
		
		public void movHorizontal(String cara, int signo){
			String movsH[] = {"F","L","B","R"};
			for (int i = 0; i < plateral.length ; i++)
			{
				for (int j = 0; j < plateral[i].elemento.dir.length;j++) 
				{
			if (plateral[i].elemento.dir[j] == cara)
			{
			for (int k = 0; k < plateral[i].elemento.dir.length; k++) 
			{
				if (plateral[i].elemento.dir[k] != cara){
					String caraActual =plateral[i].elemento.dir[k];
					int caraNueva = 0;
					while (caraActual != movsH[caraNueva])
						caraNueva++;
					if (signo == 0)
						caraNueva++;
					else
						caraNueva--;
					if (caraNueva < 0)
						caraNueva = 3;
					else
						if (caraNueva > 3)
							caraNueva = 0;
					plateral[i].elemento.dir[k] =
							movsH[caraNueva];
					}
				}
				}
				}
				}
				for (int i = 0; i < pesquina.length ; i++) {
					for (int j = 0; j < pesquina[i].elemento.dir.length;
							j++) {
						if (pesquina[i].elemento.dir[j] == cara){
							for (int k = 0; k <
									pesquina[i].elemento.dir.length ; k++) {
								if (pesquina[i].elemento.dir[k] != cara){
				String caraActual =
						pesquina[i].elemento.dir[k];
				int caraNueva = 0;
				while (caraActual != movsH[caraNueva])
					caraNueva++;
				if (signo == 0)
			caraNueva++;
				else
					caraNueva--;
				if (caraNueva < 0)
				caraNueva = 3;
				else
					if (caraNueva > 3)
						caraNueva = 0;

				pesquina[i].elemento.dir[k] =
						movsH[caraNueva];
								}
							}
						}
					}
				}
		}
}
		

