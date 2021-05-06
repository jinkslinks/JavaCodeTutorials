import java.util.*;

public class TestSort {
    public static void main(String[] args) {
        //array with fruits
        String[] s = {"Oranges", "Apples", "Pears", "Bananas"};
        ArrayList<String> words = new ArrayList<String>();
        //adding fruits to words arraylist
        Collections.addAll(words, s);

        // this sorts the values by alphabetical order
        Collections.sort(words, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        System.out.println(words);
        //This then sorts the array by size of values
        Collections.sort(words, (s1, s2) -> s1.length() - s2.length());
        System.out.println(words);

    }
}
