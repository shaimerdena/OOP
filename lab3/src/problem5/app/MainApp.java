package problem5.app;


import problem5.model.Chocolate; 
import problem5.model.Time;
import problem5.util.Sort;

public class MainApp {
    public static void main(String[] args) {
        Chocolate[] chocolates = {
            new Chocolate("Twix", 50.5),
            new Chocolate("Snickers", 10.0),
            new Chocolate("Bounty", 100.0)
        };
        
        System.out.println("Before sorting (Chocolates):");
        printArray(chocolates);
        Sort.bubbleSort(chocolates);
        System.out.println("After sorting:");
        printArray(chocolates);

        Time[] times = {
            new Time(4, 30, 0),
            new Time(8, 10, 3),
            new Time(13, 33, 5)
        };
        
        System.out.println("Before sorting (Times):");
        printArray(times);
        Sort.bubbleSort(times);
        System.out.println("After sorting:");
        printArray(times);
    }

    static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }
}
