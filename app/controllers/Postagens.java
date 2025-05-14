package controllers;

import java.util.List;

import models.Postagem;
import play.mvc.Controller;

public class Postagens extends Controller{

	public static void listar() {
		List<Postagem> listpost = Postagem.findAll();
		render();
	}
	
	public static void salvar(Postagem p) {
		p.save();
		listar();
	}
	 public void post() {
		 render();
	 }
}
