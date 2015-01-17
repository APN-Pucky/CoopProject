package gravity;

import GLOOP.Sys;


public class RenderUpdateThread extends Thread
{
	boolean running = true;
	double delta;
	double lasttime;
	
	public RenderUpdateThread()
	{
		super();	
	}
	
	public void run()
	{
		lasttime = System.nanoTime()/1_000_000_000D;
		
		long firstTime = System.nanoTime();//alles debug
		int i = 0;
		double maxTime = 0;
		double minTime = 1;//ne sekunde wird das wohl nicht dauern ;)
		
		while(running)
		{
			delta = lasttime;
			lasttime = System.nanoTime()/1_000_000_000D;
			delta = lasttime-delta;
			for(Updateable u : Global.updates)
			{
				u.update(delta);//Unabhängig von der Rendergeschwindigkeit bewegen/updaten
			}

			if(delta > maxTime) {
				maxTime = delta;
			}
			if(delta < minTime) {
				minTime = delta;
			}
			if(++i>=1_000_000) {
				System.out.println("Durchschnitt Nanos: "+(System.nanoTime() - firstTime )/ i + " - MaX: "+ maxTime + " - MiN: " + minTime);
				i=0; firstTime = System.nanoTime();
				maxTime = 0;
				minTime = 1;
			}
			
		}
	}
}