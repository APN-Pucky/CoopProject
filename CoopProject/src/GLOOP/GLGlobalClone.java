package GLOOP;
/**
 * Small Hack to access GLGlobal's private vars.
 * @author APN-Pucky
 *
 */
public class GLGlobalClone 
{
	public static Object getWeltSyncUpdate()
	{
		return GLGlobal.WELT.syncUpdate;
	}
	
	public static Object getWeltSyncRenderlauf()
	{
		return GLGlobal.WELT.syncRenderlauf;
	}
}
