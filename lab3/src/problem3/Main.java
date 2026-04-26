package problem3;

public class Main {
    public static void main(String[] args) {

        MyCollection<String> collection = new MyArrayCollection<>();

        collection.add("A");
        collection.add("B");

        System.out.println(collection.contains("A"));
        System.out.println(collection.size()); 

        collection.remove("A");
        System.out.println(collection.size());
    }
}
