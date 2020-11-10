import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
This algorithm takes a list of digits as an input and outputs them in decending order
*/

public class LargestNumber2 {
    private static ArrayList<String> swap(ArrayList<String> digits, int i, int j) {
        Collections.swap(digits, i, j);
        return digits;
    }
    private static boolean compare(String i, String j) {
        String iJ = i + j;
        String Ji = j + i;
        return (Integer.parseInt(iJ) > Integer.parseInt(Ji));
    }
    private static String largestNumber(ArrayList<String> digits) {
        String answer = "";
        while (digits.size() != 0) {
            int i = 0;
            for (int j = i + 1; j < digits.size(); j++) {
                if (!compare(digits.get(i), digits.get(j))){
                    swap(digits, i, j);
                }
            }
            answer += digits.get(0) + " ";
            digits.remove(0);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(i, scanner.next());
        }
        System.out.println(largestNumber(a));
    }
}
