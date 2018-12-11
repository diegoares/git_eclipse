package git;


import java.util.ArrayList;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class relog {
	private int hora;
	private int minutos;
	private int segundos;
	
	public int getHora() {
		return hora;
	}




	public void setHora(int hora) {
		this.hora = hora;
	}




	public int getMinutos() {
		return minutos;
	}




	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}




	public int getSegundos() {
		return segundos;
	}




	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}




	public void constructor(int hora,int minutos,int segundos) {
		this.hora=hora;
		this.minutos=minutos;
		this.segundos=segundos;
	}

	public void print(String Entrada) {
		int numEquipos = 5;

		ArrayList<String> liga = new ArrayList<>();
		ArrayList<String> liga2 = new ArrayList<>();

		System.out.println();

		for(int i = 0; i < numEquipos; i++) {
			System.out.print("Dime el equipo número " + (i + 1) + ": ");
			liga.add(Entrada);
		}

		liga2 =  liga;

		System.out.println("\n\tArrayList liga: " + liga);
		System.out.println("\tArrayList liga2: " + liga2);

		System.out.println("\n\tCantidad de valores del ArrayList liga: " + liga.size());

		liga.remove(4);
		System.out.println("\n\tPosición 4 del ArrayList liga borrado: " + liga);

		System.out.print("\nDime un nuevo equipo para la posición 2 del ArrayList: ");
		String posicion2 = Entrada;
		liga.set(2, posicion2);
		System.out.println("\n\tosicón 2 del ArrayList liga sustituido: " + liga);

		System.out.print("\nDime el equipo que esta en la posicion 3 del Arralist: ");
		String posicion3 = Entrada;
		liga.remove(posicion3);
		System.out.println("\n\tArrayList liga con la posición 3 borrada: " + liga);}

	public void write() {
		File origen = new File("origen.txt");
		File destino = new File("destino.txt");

		try {
		  InputStream in = new FileInputStream(origen);
		  OutputStream out = new FileOutputStream(destino);
						
		  byte[] buf = new byte[1024];
		  int len;

		  while ((len = in.read(buf)) > 0) {
		    out.write(buf, 0, len);
		  }
				
		  in.close();
		  out.close();
		} catch (IOException ioe){
		  ioe.printStackTrace();
		}


	}
}
