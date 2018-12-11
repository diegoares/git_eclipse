package git;

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
