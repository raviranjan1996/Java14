package app;

import java.util.HashSet;
import java.util.Set;
import static app.Skills.*;
public class VitallSet extends HashSet<Skills>{
	private static final long serialVersionUID = 1L;
	
	Set<Skills> vitalSkills = Set.of(PROGRAMMING , GAMMING);
	
	public boolean isComplete() {
		for(Skills skill:vitalSkills) {
			if(!(this.contains(skill))) {
				return 	false;
			}
		}
		return true;
	}

}
