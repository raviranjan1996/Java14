package collection;

import heirarchy.Mammal;

public class Util {

	public static void copy(Array<? extends Mammal> source, Array<? super Mammal> dest) {

		for (int i = 0; i < source.size(); i++) {
			Mammal mam = source.get(i);
			dest.add(mam);
		}

	}

}
