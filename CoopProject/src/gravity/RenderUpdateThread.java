package gravity;

import GLOOP.Sys;


public class RenderUpdateThread extends Thread
{
	boolean running = true;
	double delta;
	double lasttime;
	
	public RenderUpdateThread()
	{
		
	}
	
	public void run()
	{
		lasttime = System.nanoTime()/1_000_000_000D;
		while(running)
		{
			delta = lasttime;
			lasttime = System.nanoTime()/1_000_000_000D;
			delta = lasttime-delta;
			for(Updateable u : Global.updates)
			{
				u.update(delta);//Unabhängig von der Rendergeschwindigkeit bewegen/updaten
			}
			Sys.warte(10);
		}
	}
}