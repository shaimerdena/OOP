package problem3;

public interface MyCollection<T> {
	int size();
	
	void add(T element);
	void remove(T element);

    boolean contains(T element);
	
	boolean IsEmpty();
	void clear();
}