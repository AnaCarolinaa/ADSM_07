package aula07_ex9_2_ADSM;

public class TestHandler 
{

	public static void main(String[] args) 
	{
		Handler handler1 = new Handler1("1");
		Handler handler2 = new Handler1("2");
		Handler handler3 = new Handler1("3");
		Handler handler4 = new Handler1("4");
		Handler handler5 = new Handler1("5");
		Handler handler6 = new Handler1("6");
		Handler handler7 = new Handler1("7");
		Handler handler8 = new Handler1("8");
		Handler handler9 = new Handler1("9");
		Handler handler10 = new Handler1("10");
		Handler handler11 = new Handler1("11");
		Handler handler12 = new Handler1("12");
		Handler handler13 = new Handler1("13");
		Handler handler14 = new Handler1("14");
		Handler handler15 = new Handler1("15");
		
		
		handler1.setHandler(handler2);
		handler2.setHandler(handler3);
		handler3.setHandler(handler4);
		handler4.setHandler(handler5);
		handler5.setHandler(handler6);
		handler6.setHandler(handler7);
		handler7.setHandler(handler8);
		handler8.setHandler(handler9);
		handler9.setHandler(handler10);
		handler10.setHandler(handler11);
		handler11.setHandler(handler12);
		handler12.setHandler(handler13);
		handler13.setHandler(handler14);
		handler14.setHandler(handler15);
		
		handler1.process(1);
		handler2.process(2);
		handler3.process(3);
		handler4.process(4);
		handler5.process(5);
		handler6.process(6);
		handler7.process(7);
		handler8.process(8);
		handler9.process(9);
		handler10.process(10);
		handler11.process(11);
		handler12.process(12);
		handler13.process(13);
		handler14.process(14);
		handler15.process(15);
		

	}

}
