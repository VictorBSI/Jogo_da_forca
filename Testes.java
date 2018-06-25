package jogo;

import org.junit.Assert;
import org.junit.Test;

public class Testes {
	@Test
	public void testTema() {
		Roleta roleta = new Roleta();
		Assert.assertEquals(roleta.rodarRoletaTemas(), roleta.getTemas());	
	}
	@Test
	public void testTemaAnimais(){
		Temas tema = new Temas();
		Assert.assertEquals("cachorro", tema.getAnimais()[0]);
		Assert.assertEquals("elefante", tema.getAnimais()[6]);
		Assert.assertEquals("beija-flor", tema.getAnimais()[28]);
	}
	@Test
	public void testTemaObjetos(){
		Temas tema = new Temas();
		Assert.assertEquals("cama", tema.getObjetos()[0]);
		Assert.assertEquals("computador", tema.getObjetos()[8]);
		Assert.assertEquals("bicicleta", tema.getObjetos()[16]);
	}
	@Test
	public void testTemaFilmes() {
		Temas tema = new Temas();
		Assert.assertEquals("titanic", tema.getFilmes()[0]);
		Assert.assertEquals("o senhor dos anéis", tema.getFilmes()[6]);
		Assert.assertEquals("homem-aranha", tema.getFilmes()[10]);
	}
	@Test
	public void testTemaProfissoes(){
		Temas tema = new Temas();
		Assert.assertEquals("lenhador", tema.getProfissoes()[0]);
		Assert.assertEquals("juíz", tema.getProfissoes()[6]);
		Assert.assertEquals("telefonista", tema.getProfissoes()[17]);
	}
	@Test
	public void testTemaFrutas() {
		Temas tema = new Temas();
		Assert.assertEquals("maçã", tema.getFrutas()[0]);
		Assert.assertEquals("mamão", tema.getFrutas()[5]);
		Assert.assertEquals("açaí", tema.getFrutas()[10]);
	}
	@Test
	public void testTemaCidades() {
		Temas tema = new Temas();
		Assert.assertEquals("belém", tema.getCidades()[0]);
		Assert.assertEquals("brasília", tema.getCidades()[7]);
		Assert.assertEquals("palmas", tema.getCidades()[12]);
	}
	@Test
	public void testTemaTimes() {
		Temas tema = new Temas();
		Assert.assertEquals("paysandu", tema.getTimes()[0]);
		Assert.assertEquals("juventude", tema.getTimes()[5]);
		Assert.assertEquals("real madrid", tema.getTimes()[14]);
	}
	@Test 
	public void testNome() {
		Jogador jogador = new Jogador();
		jogador.cadastroNome();
		Assert.assertEquals("Hugo", jogador.getNome());
	}
	@Test
	public void testNomeMaiorQue5Caracteres() {
		Jogador jogador = new Jogador();
		try {
			jogador.cadastroNome();
		}catch(IllegalArgumentException e) {
			Assert.assertEquals("Nome maior que o permitido para o rank", e.getMessage());
		}	
	}


}
