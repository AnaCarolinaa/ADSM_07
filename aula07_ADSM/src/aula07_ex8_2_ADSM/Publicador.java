package aula07_ex8_2_ADSM;

public class Publicador implements ConsomeNoticia {

	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
		System.out.println("Publicador: " + dia + "/" + mes + ": " + topico + "->" + textoNoticia);
	}

}
