package git;

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
}
