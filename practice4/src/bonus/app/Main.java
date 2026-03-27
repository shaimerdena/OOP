package bonus.app;

import bonus.services.SortingService;

public class Main {

	public static void main(String[] args) {
		int[] array = {1, 2, 1, 4, 6, 6, 6};
		SortingService sorting = new SortingService();
		sorting.sort(array);
		
		for(int i : array) {
			System.out.print(i + " ");
		}
	}
}
