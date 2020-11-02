package be.intecbrussel.java_basics.equals;

import java.util.Objects;

public class Data {

    private int value;

    public Data(int value){
        this.value  = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return value == data.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
