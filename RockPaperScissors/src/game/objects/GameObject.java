package game.objects;

public class GameObject {

	private int id;
	private String name;
	
	int[][] comparission = {
			//           rock    paper   scissor
			
			/* rock */     {0     , -1       , 1},
			/* paper*/     {1     , 0       , -1},
			/* scissor*/   {-1     , 1       , 0},
			
	};
	public int compareTo(GameObject other) {
		return comparission[this.id][other.id];
	}
	protected void setId(int id) {
		this.id = id;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
