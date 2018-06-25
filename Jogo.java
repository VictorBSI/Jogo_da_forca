package jogo;

import java.util.Arrays;
import java.util.Scanner;
import java.security.*;


public class Jogo implements Resultados{
		boolean achou = true;
		boolean erro;
		Jogador[] player;
		int acerto = 0, cont = 0;
		Scanner teclado = new Scanner(System.in);
		Boneco boneco = new Boneco();
		Jogador jogador = new Jogador();
		
		public Jogo(Jogador player, Boneco boneco) {
			this.jogador = player;
			this.boneco = boneco;
		}
		
		public int menu() {
			System.out.println("1 - para continuar");
			System.out.println("2 - para Jogar com outro player");
			System.out.println("3 - para sair e ver o rank");
			Scanner teclado = new Scanner(System.in);
			return teclado.nextInt();
		}
	/*	public void montarJogo(Roleta roleta) {
		
		}
		
		public void iniciarJogo(Jogador player) {
			this.player = new Jogador[2];
		}
		
		public void terminarJogo(Jogador player) {
			
		}*/
	

	@Override
	public void mostrarResultados() {
		
	}
	
	public void Jogar(Roleta roleta) {
		cont = 0;
		acerto = 0;	
		boolean achou = true;
		boolean erro;
		System.out.printf("player %s \n", jogador.getNome());
		roleta.rodarRoletaTemas();
		System.out.println("\nTema: " + roleta.getTemanome() + "\n");		
		String tema = roleta.rodarRoletaEscolhido(roleta.getTemas());
		char[] traco = new char[tema.length()];
		for (int i = 0; i < tema.length(); i++) {
			if (tema.charAt(i) == ' ') {
				traco[i] = ' ';
				acerto++;
			}else if(tema.charAt(i) == '-') {
				traco[i] = '-';
				acerto++;
			}else {
			traco[i] = '_'; 
			}
			System.out.print(traco[i] + " ");
		}
				while(achou) {
					erro = true;
					/*System.out.println("\nDigite uma letra: ");
					char palavras = teclado.next().charAt(0);*/
					jogador.escolherLetra();
					
	
					for( int i = 0; i < tema.length(); i++) {
						
						if (jogador.getLetra() == traco[i]) {	//Se a letra digitada for igual a uma que já foi digitada anteriormente, sai do loop e retorna true, penalizando o jogador
							System.out.print(traco[i]+" ");
							continue;
						}
						if( jogador.getLetra()  == tema.charAt(i)) {
							traco[i] = jogador.getLetra() ;
							acerto++;
							erro = false;
							
						}		
						System.out.print(traco[i]+ " ");	
					}
					if (erro == true) {
						//jogador.Errar(erro);
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
					
					if (cont == 6) {		//Se completar as 6 partes do corpo, achou recebe false e o loop para
						System.out.println("\n\nVocê perdeu!");
						achou = false;
						jogador.setDerrotas();
						System.out.println("\nA resposta era " + tema + "\n");
						
					}

					if(acerto == tema.length()) {  //Se o player acertar todas as letras da palavra sorteada, achou recebe false e o loop para
						System.out.println("\n\nVocê ganhou!\n");
						achou = false;
						jogador.setVitorias();
						//System.out.println("\nVocê fez " + jogador.getPontos() + " pontos!\n\n");
						//jogador.Acertar(false);
					}
					
				}
			
	}

	/*public int Pontos() {
		return jogador.getPontos();
	}*/
}
