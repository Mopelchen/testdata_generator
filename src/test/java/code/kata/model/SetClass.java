package code.kata.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetClass {

    private Set<Integer> integerSet;

    public Set<Integer> getIntegerSet() {
        return integerSet;
    }

    public void setIntegerSet(Set<Integer> integerSet) {
        this.integerSet = integerSet;
    }

    public void addIntegerSetItem(Integer integerSetItem) {
        if(integerSet == null) {
            integerSet = new HashSet<>();
        }
        integerSet.add(integerSetItem);
    }
}
