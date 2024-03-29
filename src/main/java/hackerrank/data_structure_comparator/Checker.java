package hackerrank.data_structure_comparator;

import java.util.Comparator;

public class Checker {


    public Comparator comparator() {
        return Comparator.comparingInt((Player t) -> t.score).reversed().thenComparing((Player r) -> r.name);
    }
}
