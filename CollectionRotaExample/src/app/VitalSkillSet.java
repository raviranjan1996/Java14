package app;

import java.util.HashSet;
import java.util.Set;
import static app.Skills.*;

public class VitalSkillSet extends HashSet<Skills> {

	private static final long serialVersionUID = 1L;

	private Set<Skills> skill = Set.of(PROGRAMMING, RECEPTION, MANAGEMENT);

	public boolean isComplete() {

		for (Skills vitalSkill : skill) {
			if (!(contains(vitalSkill))) {
				return false;
			}
		}

		return true;

	}

}
