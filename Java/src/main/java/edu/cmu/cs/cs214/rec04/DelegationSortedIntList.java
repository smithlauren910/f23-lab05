package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList{
    // Write your implementation below with API documentation
    private SortedIntList sortedIntList;
    private int total;

    public DelegationSortedIntList() {
        sortedIntList = new SortedIntList(); 
        total = 0;
    }

    @Override
    public boolean add(int value) {
        boolean added = sortedIntList.add(value);
        return added;
    }

    @Override
    public boolean addAll(IntegerList elements) {
        boolean added = sortedIntList.addAll(elements);
        return added;
    }

    @Override
    public boolean remove(int value) {
        boolean removed = sortedIntList.remove(value);
        return removed;
    }

    @Override
    public boolean removeAll(IntegerList list) {
        boolean removed = sortedIntList.removeAll(list);
        return removed;
    }

    @Override
    public int get(int i) {
        return sortedIntList.get(i);
    }

    public int getTotalAdded() {
        return total;
    }

    @Override
    public int size(){
        int size = sortedIntList.size();
        return size;
    }
}
