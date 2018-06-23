package jogo;

import java.util.Scanner;

//pq um jogador é um cadastro???
public class Jogador extends Cadastro {
	private int vitorias, derrotas, pontos = 6;
	private String nome;
	private char letra;
	private Roleta row;
	private boolean acerto, erro;
	public Jogador() {
		super();
	}

	@Override
	public void cadastroNome() {
		System.out.println("digite o nome do jogador");
		
		Scanner teclado = new Scanner(System.in);
		String nome = teclado.nextLine();
		
		if(nome.length() > 10)
			throw new IllegalArgumentException("Nome maior que o permitido para o rank");
		
		this.nome = nome;
	}
	
	public void escolherLetra(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("\nDigite uma letra: ");
		this.letra = teclado.next().charAt(0);
	}
	
	/*public void Acertar(boolean acerto) {
		this.acerto = acerto;
		if (!acerto) {
			pontos++;
		}
	}*/
	
	public String getNome() {
		return nome;
	}
	
	public char getLetra() {
		return this.letra;
	}
	
	public int getPontos() {
		return pontos;
	}
	
	public void Errar(boolean erro) {
		this.erro = erro;
		if (erro) {
			pontos--;
		}
	}
	

	
}
