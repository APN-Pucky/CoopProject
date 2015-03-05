package gravity;

import java.util.ArrayList;

import GLOOP.GLKamera;

public class Global 
{
	public static ArrayList<Updateable> updates = new ArrayList<Updateable>();
	public static ArrayList<MoveableMass> mma = new ArrayList<MoveableMass>();
	public static ArrayList<Field> electricField = new ArrayList<Field>();
	public static ArrayList<Field> magneticField = new ArrayList<Field>();
	public static GLKamera gk;
}