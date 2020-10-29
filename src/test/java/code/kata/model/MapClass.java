package code.kata.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapClass {

    private Map<String, Integer> mapField;

    public Map<String, Integer> getMapField() {
        return mapField;
    }

    public void setMapField(Map<String, Integer> mapField) {
        this.mapField = mapField;
    }

    public void putMapFieldPair(String key, Integer value){
        if(mapField == null) {
            mapField = new HashMap<>();
        }

        mapField.put(key, value);
    }
}
