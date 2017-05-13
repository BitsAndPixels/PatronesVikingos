package Vikingos;

public class Vikingo {
	public int salud;
	public int fuerza;
	public Estado estado;
	
	public Vikingo(){
		this.salud=100;
		this.fuerza=100;
		this.estado = new EstadoNormal();
	}
	
	public void serAtacado(int valor){
		this.salud-=valor;
		this.estado = this.estado.serAtacado(this.salud);
	}
	
	public void calmarse() {
		this.estado = this.estado.calmarse();
	}
	
	public String getEstado(){
		return this.estado.getEstado();
	}
	
	public int atacar(){
		return this.estado.atacar(this.fuerza);		
	}
	

}
