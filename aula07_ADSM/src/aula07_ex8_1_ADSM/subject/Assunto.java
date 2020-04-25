package aula07_ex8_1_ADSM.subject;

import aula07_ex8_1_ADSM.observer.ConsomeNoticia;

public interface Assunto {
	void registraObservador(ConsomeNoticia observer);
	void removeObservador(ConsomeNoticia observer);
	void notificaTodos();
}
