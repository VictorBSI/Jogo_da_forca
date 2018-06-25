package jogo;

import java.security.SecureRandom;
import java.util.Random;

public class Roleta{
	private int tamanho1;
	private int tamanho2;
	private String[] temas, escolhido, nome;
	private String temanome;
	//private int animal_atual;
	
	
	/*public void iniciarRoleta() {
		String[] animais = {"girafa","cachorro","gato","pato","morcego","lobo"};
		this.animais = animais;
		
	}*/
	
	public String[] rodarRoletaTemas(){
		Temas tema = new Temas();
		SecureRandom random = new SecureRandom();
		this.tamanho1 = random.nextInt(tema.getTema().length);
		switch (tamanho1){
			case 0:
				this.temanome = "Animais";
				return nome = tema.getAnimais();
			case 1: 
				this.temanome = "Objetos";
				return nome = tema.getObjetos();
			case 2: 
				this.temanome = "Filmes";
				return nome = tema.getFilmes();
			case 3: 
				this.temanome = "Profissões";
				return nome = tema.getProfissoes();
			case 4: 
				this.temanome = "Frutas";
				return nome = tema.getFrutas();
			case 5: 
				this.temanome = "Cidades";
				return nome = tema.getCidades();
			default: 
				this.temanome = "Times";
				return nome = tema.getTimes();
		}
		//return temas[tamanho1];
	}
	
	
	
	public String[] getTemas(){
		return this.nome;
	}
	
	public String getTemanome() {
		return this.temanome;
	}
	
	
	public String rodarRoletaEscolhido(String[] escolhido) {
		SecureRandom random = new SecureRandom();
		this.tamanho2 = random.nextInt(escolhido.length);
		return escolhido[tamanho2];
	}
	
	
	
	/*public int tamanho(){
		return tamanho;
	}*/
}
