package main.util.comparator;

import java.util.Comparator;
import java.util.Map;

public class EntryComparator implements Comparator<Map.Entry<Integer, Integer>>{

        @Override
        public int compare(Map.Entry<Integer, Integer> p1, Map.Entry<Integer, Integer> p2) {
            return p1.getValue().compareTo(p2.getValue());
        }
}
