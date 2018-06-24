package jogo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		int sentinela = 0;
		Rank rank = new Rank();
		while (sentinela != 3) {
			Roleta roleta = new Roleta();
			Boneco boneco = new Boneco();
			Jogador pl = new Jogador();
			Jogo jogo = new Jogo(pl, boneco);
		try {
			pl.cadastroNome();
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			//main();
		}

		//roleta.iniciarRoleta();
		
		do {
			jogo.Jogar(roleta);
			sentinela = jogo.menu();
		} while (sentinela == 1);
			rank.adicionar(pl);
		}
		rank.mostrarRank();

	}
}
