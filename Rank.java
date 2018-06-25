package jogo;

import java.util.*;

class Rank implements Resultados{
	List<Jogador> rank = new ArrayList<>();

	public void adicionar(Jogador j) {
		if(rank.contains(j)) 
			rank.add(rank.indexOf(j), j);
		else
			rank.add(j);	
	}

	public List<Jogador> getLista() {
		return rank;
	}
	@Override
	public void mostrarResultados() {
		Collections.sort(rank);
		Collections.reverse(rank);
		System.out.println("Posição | Nome | Vitórias | Derrotas |");
		for (int i = 0; i < rank.size(); i++) {
			System.out.printf("%8d|%6s|%10d|%10d|\n", i + 1, (rank.get(i).getNome()), rank.get(i).getVitorias(),
					rank.get(i).getDerrotas());
		}

	}

}
