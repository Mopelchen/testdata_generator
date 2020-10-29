package code.kata.model;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

    private List<Integer> integerList;
    private List<String> stringList;
    private List<EnumField> enumFieldList;

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

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void addStringListItem(String stringListItem) {
        if(stringList == null) {
            stringList = new ArrayList<>();
        }
        stringList.add(stringListItem);
    }

    public List<EnumField> getEnumFieldList() {
        return enumFieldList;
    }

    public void setEnumFieldList(List<EnumField> enumFieldList) {
        this.enumFieldList = enumFieldList;
    }

    public void addSEnumFieldListItem(EnumField EnumFieldListItem) {
        if(enumFieldList == null) {
            enumFieldList = new ArrayList<>();
        }
        enumFieldList.add(EnumFieldListItem);
    }
}
