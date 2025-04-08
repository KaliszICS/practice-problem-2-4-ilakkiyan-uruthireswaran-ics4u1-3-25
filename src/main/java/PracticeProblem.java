public class PracticeProblem {

	public static void selectionSortName(String[] names, int[] ages) {
		int smallestIndex;
		for (int i = 0; i < names.length - 1; i++) {
			smallestIndex = i;
			for (int j = i + 1; j < names.length; j++) {
				if (names[j].compareToIgnoreCase(names[smallestIndex]) < 0) {
					smallestIndex = j;
				}

			}
			String tempName = names[smallestIndex];
			names[smallestIndex] = names[i];
			names[i] = tempName;
			int tempAges = ages[smallestIndex];
			ages[smallestIndex] = ages[i];
			ages[i] = tempAges; 
		}
	}

	public static void selectionSortAge(String[] names, int[] ages) {
		int smallIndex;
		for (int i = 0; i < ages.length; i++) {
			smallIndex = i;
			for (int j = i + 1; j < ages.length; j++) {
				if (ages[j] < ages[smallIndex]) {
					smallIndex = j;
				}
			}
			String tempName = names[smallIndex];
			names[smallIndex] = names[i];
			names[i] = tempName;
			int tempAge = ages[smallIndex];
			ages[smallIndex] = ages[i];
			ages[i] = tempAge;
		}
	}

	public static void main(String args[]) {
		String[] names = {"John", "Alice", "Sam", "Jack", "Wade"};
		int[] ages = {25, 29, 30, 21, 27};
		selectionSortName(names, ages);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ": " + ages[i]);
		}

		System.out.println(" ");

		selectionSortAge(names, ages);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ": " + ages[i]);
		}
		}
	
}
