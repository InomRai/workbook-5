package com.pluralsight;
import java.util.*;

public class FixedList<T>{
    private final int maxSize;
    private final List<T> items;


    public FixedList(int maxSize, int maxSize1, List<T> items) {
        this.maxSize = maxSize1;
        this.items = items;

        if (maxSize <= 0) {
        }

    }

}
