package aula07_ex8_1_ADSM;

public abstract class Noticiario //envia noticias para assinantes
{
	//quando surgir uma nova noticia chamar o metodo abaixo
	public abstract void notificaNoticia(String textoNoticia, int dia, int mes, String topico);

}
