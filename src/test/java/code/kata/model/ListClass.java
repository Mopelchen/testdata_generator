package code.kata.model;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

    private List<Integer> integerList;

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public void addIntegerListItem(Integer integerListItem) {
        if(integerList == null) {
            integerList = new ArrayList<>();
        }
        integerList.add(integerListItem);
    }
}
