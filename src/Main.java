import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        //Problem 1
        System.out.println("================= Problem 1 ================================");
        System.out.println("Sum using for loop: " + sumForLoop(numbers));
        System.out.println("Sum using while loop: " + sumWhileLoop(numbers));
        System.out.println("Sum using recursion: " + sumRecursion(numbers, 0));
        System.out.println("===========================================================");


        System.out.println("================= Problem 2 ================================");

        List<String> list1 = Arrays.asList("a", "b", "c");
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        List<Object> result = mergeAlternately(list1, list2);
        System.out.println(result);





    }


    //============================ Problem 1 =========================================
    public static int sumForLoop(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static int sumWhileLoop(List<Integer> numbers) {
        int sum = 0, i = 0;
        while (i < numbers.size()) {
            sum += numbers.get(i);
            i++;
        }
        return sum;
    }

    public static int sumRecursion(List<Integer> numbers, int index) {
        if (index >= numbers.size()) {
            return 0;
        }
        return numbers.get(index) + sumRecursion(numbers, index + 1);
    }



    //====================================== Problem 2 =======================================


        public static List<Object> mergeAlternately(List<?> list1, List<?> list2) {
            List<Object> result = new ArrayList<>();

            int i = 0, j = 0;
            while (i < list1.size() || j < list2.size()) {
                if (i < list1.size()) result.add(list1.get(i++));
                if (j < list2.size()) result.add(list2.get(j++));
            }

            return result;
        }



    //====================================== Problem 3 =======================================


}
