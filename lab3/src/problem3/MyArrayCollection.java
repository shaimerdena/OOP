package problem3;

import java.util.ArrayList;

class MyArrayCollection<T> implements MyCollection<T> {

    private ArrayList<T> list = new ArrayList<>();
    
    public int size() {
        return list.size();
    }
    
    public void add(T element) {
        list.add(element);
    }

    public void remove(T element) {
        list.remove(element);
    }

    public boolean contains(T element) {
        return list.contains(element);
    }
    
    @Override
    public boolean IsEmpty() {
        return list.isEmpty();
    }

    public void clear() {
        list.clear();
    }
}
