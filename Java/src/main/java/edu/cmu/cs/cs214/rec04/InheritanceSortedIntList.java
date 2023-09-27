package edu.cmu.cs.cs214.rec04;

import java.util.ArrayList;
import java.util.List;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList{
    private int total;
    public InheritanceSortedIntList() {
        super(); 
        total = 0;
    }
    // Write your implementation below with API documentation
    @Override
    public boolean add(int value){
        super.add(value);
        total++;
        return true;
    }

    @Override
    public boolean addAll(IntegerList all){
        boolean success = false;
        for (int i = 0; i < all.size(); i++) {
            success |= this.add(all.get(i));
        }

        return success;
    }

    public int getTotalAdded(){
        return total;
    }
}