package gabiaCodingTest;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.regex.Pattern;

public class test {
    public static void process(String input1, String input2) {
        String[] inputList1 = Pattern.compile(" ").split(input1);
        int size = Integer.parseInt(inputList1[0]);
        int targetSum = Integer.parseInt(inputList1[1]);
        int[] sortedList = Pattern.compile(" ").splitAsStream(input2)
                .mapToInt(Integer::parseInt).sorted().toArray();
        int binaryMax = (int)Math.pow(2d, (double)size);
        for (int i = 1; i < binaryMax; i++) {
            if (computeSum.apply(i, sortedList) >= targetSum) {
                showResult.accept(i, sortedList);
                //break;
            }
        }
    }

    private static BiFunction<Integer, int[], Integer> computeSum = (caseNum, values) -> {
        int pos = 0, sum = 0;
        while (caseNum > 0) {
            sum += caseNum % 2 == 1 ? values[pos]:0;
            pos++;
            caseNum = caseNum/2;
        }
        return sum;
    };

    private static BiConsumer<Integer, int[]> showResult = (caseNum, values) -> {
        int pos = 0;
        while (caseNum > 0) {
            System.out.print(caseNum % 2 == 1 ? values[pos]+" ":"");
            pos++;
            caseNum = caseNum/2;
        }
        System.out.println();
    };

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input1 = sc.nextLine();
            String input2 = sc.nextLine();
            test.process(input1, input2);
        }
    }
}
