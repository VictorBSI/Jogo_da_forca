package jogo;

public class Temas {
	private String[][] temas = {{"cachorro", "gato", "jacaré", "gaivota", "pato", "morcego", "elefante", "girafa", "macaco", "baleia", "rato", "lobo", "tigre", "panda", "urso", "tubarão", "lagarto", "sapo", "cobra", "vaca", "boi", "touro", "escorpião", "aranha", "barata", "gavião", "zebra", "ornitorrinco"}, {"cama", "mesa", "ventilador", "geladeira", "fogão", "chave", "televisão", "rádio", "computador", "armário", "telefone", "celular", "cadeira", "pia", "escada", "carro", "bicicleta", "termômetro", "mouse"}, {"titanic", "matrix", "avatar"}, {"lenhador", "professor", "médico", "administrador", "carpinteiro", "advogado", "juíz", "promotor", "engenheiro", "enfermeiro", "pintor", "cantor", "ator", "atriz", "modelo", "diretor", "motorista", "telefonista", "ginasta", "gerente", "nadador"}, {"maçã", "abacaxi", "melão", "melancia", "pêra", "mamão", "abacate", "laranja", "tangerina", "banana", "açaí", "pupunha", "ameixa"}, {"belém", "maceió", "manaus", "recife", "londres", "paris", "lisboa", "brasília", "fortaleza", "cuiabá", "florianópolis", "madrid", "palmas", "curitiba"}, {"paysandu", "remo", "tuna", "corinthians", "palmeiras", "juventude", "bahia", "fortaleza", "flamengo", "barcelona", "grêmio", "internacional", "cruzeiro"}};
	private String[] animais, objetos, filmes, profissoes, frutas, cidades, times;
	
	//objetos, frutas, filmes;
	
	public String[] getAnimais() {
		return this.animais = this.temas[0];
		
	}
	
	public String[] getObjetos() {
		return this.objetos = this.temas[1];
	}
	
	public String[] getFilmes() {
		return this.filmes = this.temas[2];
	}
	
	public String[] getProfissoes() {
		return this.profissoes = this.temas[3];
	}
	
	public String[] getFrutas() {
		return this.frutas = this.temas[4];
	}
	
	public String[] getCidades() {
		return this.cidades = this.temas[5];
	}
	
	public String[] getTimes() {
		return this.times = this.temas[6];
	}
	
	public String[][] getTema() {
		return this.temas;
	}
	


}
