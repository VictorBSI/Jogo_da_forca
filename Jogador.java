package jogo;

import java.util.Scanner;

//pq um jogador é um cadastro???
public class Jogador extends Cadastro implements Comparable<Jogador> {
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
		System.out.println("digite o nome do jogador (max 5 caracteres) ");
		
		Scanner teclado = new Scanner(System.in);
		nome = teclado.nextLine();
		
		if(nome.length() > 5)
			throw new IllegalArgumentException("Nome maior que o permitido para o rank");
		this.nome = nome;
	}
	
	public void escolherLetra(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("\nDigite uma letra: ");
		this.letra = teclado.next().charAt(0);
	}
	
	public String getNome() {
		return nome;
	}
	
	public char getLetra() {
		return letra;
	}
	
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias() {
		vitorias += 1;
	}
	public void setVitorias(int n) {
		vitorias = n;
	}
	
	protected int getDerrotas() {
		return derrotas;
	}
	protected void setDerrotas() {
		this.derrotas += 1;
	}
	
	protected void setDerrotas(int n) {
		this.derrotas = n;
	}

	
	@Override
	public int compareTo(Jogador jogador) {
		return Integer.compare(this.vitorias, jogador.vitorias);
		
	}
	
	
	/*public void Acertar(boolean acerto) {
		this.acerto = acerto;
		if (!acerto) {
			pontos++;
		}
	}*/
	
	
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
