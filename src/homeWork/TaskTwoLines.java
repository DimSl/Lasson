package homeWork;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class TaskTwoLines {
    public static void main(String[] args) {

// 1.
        /*String word1 = "Wolf";
        String word2 = "Elephant";
        String word3 = word1.replace("lf", "hant");

        System.out.println(word3);*/

// 2.
        /*String sentence = "Я обожаю путешествовать";
        String[] max = sentence.split("\\s");
        System.out.println(Arrays.toString(max));
        Arrays.sort(max, Comparator.comparing(String::length, Comparator.reverseOrder()) );
        sentence = max[0].length() > max.length ? max[0] : sentence;
        System.out.println(sentence)*/
        ;

// 3.
        /*String st1 = "Halva V";
        String st2 = "Malta";
        String st3 = "Halva";

        String[] str1Arr = st1.split("\\s");
        //String[] str2Arr = st2.split("\\s");
        String[] str3Arr = st3.split("\\s");

        System.out.println(Arrays.toString(str1Arr));
        //System.out.println(Arrays.toString(str2Arr));
        System.out.println(Arrays.toString(str3Arr));

        int n = 0;
        for (int i = 0; i < str1Arr.length; i++) {
            if (str1Arr[i].toLowerCase().contains(st2.toLowerCase())) ;
            {
                n++;
            }
        }
        System.out.println(n);*/

    }
}
