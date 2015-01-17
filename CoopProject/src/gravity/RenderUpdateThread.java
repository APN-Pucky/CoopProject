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
		long firstTime = System.nanoTime();
		int i = 0;
		while(running)
		{
			delta = lasttime;
			lasttime = System.nanoTime()/1_000_000_000D;
			delta = lasttime-delta;
			for(Updateable u : Global.updates)
			{
				u.update(delta);//Unabhängig von der Rendergeschwindigkeit bewegen/updaten
			}
			if(++i>=1_000_000) {
				System.out.println(i + " mal - " + (System.nanoTime() - firstTime )/ i + " durchschnitt");
				i=0; firstTime = System.nanoTime();
			}
		}
	}
}