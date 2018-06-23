package jogo;

import java.util.Arrays;
import java.util.Scanner;
import java.security.*;


public class Jogo implements Resultados{
		boolean achou = true;
		boolean erro;
		Jogador[] player;
		Roleta row;
		String[] corpo = {"Cabeça", "Tronco", "Braço esquerdo", "Braço direito", "Perna Esquerda", "Perna Direita"};
		int acerto = 0, cont = 0;
		Scanner teclado = new Scanner(System.in);
		Boneco boneco = new Boneco();
		Jogador jogador = new Jogador();
		
		public void iniciarJogo(Jogador player) {
			this.player = new Jogador[2];
		}
		
		public void terminarJogo(Jogador player) {
			
		}
	

	@Override
	public void mostrarResultados() {
		
	}
	
	public void Jogar(String animais) {
			
			

			char[] traco = new char[animais.length()];;
			
				for( int i = 0; i < animais.length(); i++) {
					traco[i] = '_';
					System.out.print(traco[i]+" ");		
				}
				while(achou) {
					erro = true;
					/*System.out.println("\nDigite uma letra: ");
					char palavras = teclado.next().charAt(0);*/
					jogador.escolherLetra();
					
					
					
					for( int i = 0; i < animais.length(); i++) {
						
						if (jogador.getLetra() == traco[i]) {
							System.out.print(traco[i]+" ");
							continue;
						}
						if( jogador.getLetra()  == animais.charAt(i)) {
							traco[i] = jogador.getLetra() ;
							acerto++;
							erro = false;
							
						}
						
						
						
						System.out.print(traco[i]+ " ");	
					}
					if (erro == true) {
						jogador.Errar(erro);
						++cont;
						switch(cont) {
						case 1:
							boneco.setCabeca("cabeca");
							boneco.setTronco("");
							boneco.setB_drt("");
							boneco.setB_esq("");
							boneco.setP_drt("");
							boneco.setP_esq("");
							break;
						case 2:
							boneco.setTronco(" , tronco");
							boneco.setB_drt("");
							boneco.setB_esq("");
							boneco.setP_drt("");
							boneco.setP_esq("");
							break;
						case 3:
							boneco.setB_drt(" , braço direito");
							boneco.setB_esq("");
							boneco.setP_drt("");
							boneco.setP_esq("");
							break;
						case 4:
							boneco.setB_esq(" , braco esquerda");
							boneco.setP_drt("");
							boneco.setP_esq("");
							break;
						case 5:
							boneco.setP_drt(" , perna direita");	
							boneco.setP_esq("");
							break;
						case 6:
							boneco.setP_esq(" , perna esquerda");
							break;
						}
						
							System.out.println("\n\n"+boneco.toString());				
						
						

					}
					
					if (cont == 6) {
						System.out.println("\n\nVocê perdeu!");
						achou = false;
						
						
						
					}

					if(acerto == animais.length()) {
						System.out.println("\n\nVocê acertou!");
						achou = false;
						//jogador.Acertar(achou);
						
						
					}
					
				}
				
				System.out.println("\n\nVocê fez " + jogador.getPontos() + " pontos!\n\n");
				
				
				
	}
	
	
	
	public int Pontos() {
		return jogador.getPontos();
	}
}
