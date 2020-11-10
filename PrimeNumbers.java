import java.util.ArrayList;
/*
This alrorithm takes in a range of numbers and outputs the prime numbers using the Sieve of eratosthenes algorithm
*/
public class PrimeNumbers {
    public static ArrayList<Integer> getList(int max) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int n = max;
        int index = 2;
        for (int i = 0; i < n; i++) {
            numbers.add(index);
            index++;
        }
        return numbers;
    }
    public static ArrayList<Integer> getPrimes(ArrayList<Integer> numbers) {
        ArrayList<Integer> primes = new ArrayList<>();

        while(numbers != null) {
            if (numbers.size() == 0) { break; }
            int prime = numbers.get(0);
            for (int i = 0; i < numbers.size(); i++){
                if (numbers.get(i) % prime == 0) {
                    numbers.remove(i);
                }
            }
            primes.add(prime);
        }
        return primes;
    }
    public static void main(String[] args) {
        int maxValue = 1000;
        System.out.println(getPrimes(getList(maxValue)));
    }
}
