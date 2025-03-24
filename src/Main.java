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


    }

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
}
