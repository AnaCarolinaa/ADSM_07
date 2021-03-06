package aula07_ex8_1_ADSM.subject;

import java.util.ArrayList;

import aula07_ex8_1_ADSM.observer.ConsomeNoticia;

public class FonteNoticias implements Assunto {
	private ArrayList<ConsomeNoticia> observadores;
	private Noticia noticia;
	
	public FonteNoticias() {
		this.observadores = new ArrayList<>();
	}
	
	@Override
	public void registraObservador(ConsomeNoticia observer) {
		observadores.add(observer);
	}

	@Override
	public void removeObservador(ConsomeNoticia observer) {
		observadores.remove(observer);
	}

	@Override
	public void notificaTodos() {
		for(ConsomeNoticia observer:observadores) {
			observer.consomeNoticia(noticia.getTexto(), noticia.getDia(), 
					noticia.getMes(), noticia.getTopico());
		}
	}

	public ArrayList<ConsomeNoticia> getObservadores() {
		return observadores;
	}

	public void setObservadores(ArrayList<ConsomeNoticia> observadores) {
		this.observadores = observadores;
	}

	public Noticia getNoticia() {
		return noticia;
	}

	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
		this.notificaTodos();
	}

}
