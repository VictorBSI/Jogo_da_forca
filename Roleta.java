package jogo;

import java.security.SecureRandom;
import java.util.Random;

public class Roleta extends Jogo implements Resultados{
	private int tamanho;
	private String[] animais;
	//private int animal_atual;
	
	public void iniciarRoleta() {
		String[] animais = {"girafa","cachorro","gato","pato","morcego","lobo"};
		this.animais = animais;
		
	}
	
	public String rodarRoleta(){
		SecureRandom random = new SecureRandom();
		this.tamanho = random.nextInt(this.animais.length);
		return this.animais[tamanho];
	}
	
	
	
	public String getAnimais(){
		return this.animais[tamanho];
	}
	
	@Override
	public void mostrarResultados(){
		//SecureRandom random = new SecureRandom();
		//this.tamanho = animais.length;
		System.out.println(tamanho);
	}
	
	/*public int tamanho(){
		return tamanho;
	}*/
}
