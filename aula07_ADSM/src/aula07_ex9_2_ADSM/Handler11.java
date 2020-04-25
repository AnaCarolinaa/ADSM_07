package aula07_ex9_2_ADSM;

public class Handler11 implements Handler 
{
	private Handler handler;
	private String handlerName;
	private long ultimo;
	
	public Handler11(String handlerName)
	{
		this.handlerName = handlerName;
	}
	
	@Override
	public void handleRequest(int request) 
	{
		
	}

	@Override
	public void process(int numero) 
	{
		long tempo = System.currentTimeMillis();
		if ((tempo - this.ultimo) < 200 ) {
			System.out.println("Tempo: "+tempo);
			System.out.println(handlerName + "esta ocupado...\nEnviando para Handler " + handler.getHandlerName());
			handler.process(numero);
		} 
		else 
		{
			this.ultimo = tempo;
			System.out.println("Processado por "+handlerName);
		}
	}

	@Override
	public void setHandler(Handler handler) 
	{
		this.handler = handler;
	}
	
	@Override
	public String getHandlerName() 
	{
		return handlerName;
	}
}