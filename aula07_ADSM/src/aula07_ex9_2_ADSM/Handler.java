package aula07_ex9_2_ADSM;

public interface Handler 
{
	public void handleRequest(int request);
	public void setHandler(Handler handler);
	public void process(int numero);
	public String getHandlerName();
}
