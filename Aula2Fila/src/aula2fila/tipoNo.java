package aula2fila;

public class tipoNo{
	public int info;
	public tipoNo prox;
	
	public tipoNo(){}
	
	public void setInfo(int info){
		this.info=info;
	}

	public void setProx(tipoNo prox){
		this.prox=prox;
	}
	
	public int getInfo(){
		return info;
	}
	public tipoNo getProx(){
		return prox;
	}

	
}