package jogo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static int i = 0;
	
	public static void main(String... args) {
		Roleta roleta = new Roleta();
		Jogo jogo = new Jogo();
		Jogador pl = new Jogador();
		
		try {
			pl.cadastroNome();
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			main();
		}

		roleta.iniciarRoleta();
		roleta.rodarRoleta();
		
		System.out.println("player 1 " + pl.getNome());
		jogo.Jogar(roleta.getAnimais());
	
		Rank rank = new Rank(jogo.Pontos(), pl.getNome());
		rank.mostrarResultados();

	}
}
