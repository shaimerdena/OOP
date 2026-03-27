package bonus.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bonus.model.Sorter;

public class SortingService implements Sorter, Comparator<Integer> {
	private static int[] frequencies = new int[11];
	
	@Override
	public int compare(Integer o1, Integer o2) {
		int freq1 = frequencies[o1];
		int freq2 = frequencies[o2];
		
		if(freq1 != freq2) {
			return Integer.compare(freq2, freq1);
		}
		
		return Integer.compare(o2, o1);
	}
	
	
	@Override
	public void sort(int[] array) {
		if(array == null || array.length == 0) return;
		
		for(int i : array) {
			frequencies[i]++;
		}
		
		List<Integer> numbers = new ArrayList<>();
		for(int i=0; i<frequencies.length; i++) {
			if(frequencies[i] > 0) {
				numbers.add(i);
			}
		}
		
		Collections.sort(numbers, this);
		
		int index = 0;
        for (int num : numbers) {
            int count = frequencies[num];
            for (int j = 0; j < count; j++) {
                array[index++] = num;
            }
        }
	}	
}
