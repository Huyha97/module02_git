package bai16.thuchanh02;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWritefile readAndWritefile = new ReadAndWritefile();
        List<Integer> numbers = readAndWritefile.readFile("C:\\Users\\This MC\\Desktop\\gitmodule02\\bai16\\thuchanh02\\numbers");
        int maxValue = findMax(numbers);
        readAndWritefile.writeFile("C:\\Users\\This MC\\Desktop\\gitmodule02\\bai16\\thuchanh02\\results",maxValue);

    }
}
