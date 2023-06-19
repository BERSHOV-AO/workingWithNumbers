import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> newList = evenNumber(positiveNumbers(intList));
        Collections.sort(newList);
        //System.out.println(newList); // можно распечатать так, но будут кавычки -> [2, 4, 8, 16, 32]

        //сделал вывод через foreach
        for (Integer value : newList) {
            System.out.print(value + " ");
        }
    }

    static List<Integer> positiveNumbers(List<Integer> intList) {
        List<Integer> positiveNumbersList = new ArrayList<>();
        for (Integer value : intList) {
            if (value > 0)
                positiveNumbersList.add(value);
        }
        return positiveNumbersList;
    }


    static List<Integer> evenNumber(List<Integer> intList) {
        List<Integer> evenNumberList = new ArrayList<>();
        for (Integer value : intList) {
            if (value % 2 == 0)
                evenNumberList.add(value);
        }
        return evenNumberList;
    }
}
