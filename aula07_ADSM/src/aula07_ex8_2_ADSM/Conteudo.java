package aula07_ex8_2_ADSM;

public class Conteudo {
	String textoNoticia;
	int dia;
	int mes;
	String topico;
	
	public Conteudo(String textoNoticia, int dia, int mes, String topico) {
		this.textoNoticia = textoNoticia;
		this.dia = dia;
		this.mes = mes;
		this.topico = topico;
	}

	@Override
	public String toString() {
		return "Conteudo da Noticia: " + dia + "/" + mes + ": " + topico + "->" + textoNoticia;
	}
	
	
}
