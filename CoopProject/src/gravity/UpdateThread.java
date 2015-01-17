package gravity;

import java.util.ArrayList;

public class UpdateThread extends ArrayList<MoveableMass> {
	private static final long serialVersionUID = 1584782928231004369L;
	
	public UpdateThread() {
		super();
	}
	public UpdateThread(MoveableMass[] object) {
		this();
		this.addObjects(object);
	}
	public void addObjects(MoveableMass[] object) {
		for(MoveableMass o : object) {
			this.add(o);
		}
	}
}