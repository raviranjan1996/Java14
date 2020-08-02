package application;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class SkillSet extends HashSet<String>{
	private static final long serialVersionUID = 1L;

	public boolean isComplete() {
		return (this.contains("programming") && this.contains("teaching")) || (this.contains("eating") &&this.contains("playing"));
	
	}
	
	
	
}
public class CollectionInheritence {

	public static void main(String[] args) {
			
			Map<Integer, SkillSet> map = new HashMap<>();
			
			SkillSet skillset1 = new SkillSet();
			SkillSet skillset2 = new SkillSet();
			
			skillset1.add("programming");
			skillset1.add("teaching");
			
			skillset2.add("eating");
			skillset2.add("playing");
			
			map.put(0, skillset1);
			map.put(1, skillset2);
			System.out.println(skillset1.isComplete());
			System.out.println(skillset2.isComplete());
			
			for(Map.Entry<Integer, SkillSet> element:map.entrySet()) {
			System.out.println(element.getKey() + ": " + element.getValue());
			}
			
			
			
	}

}
