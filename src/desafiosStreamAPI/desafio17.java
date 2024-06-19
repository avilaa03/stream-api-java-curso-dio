package desafiosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream()
                .filter(n -> isPrime(n))
                .toList();


        System.out.println(numerosPrimos);

    }

    static boolean isPrime(int n) {
        return IntStream.range(2, n).noneMatch(i -> n % i == 0);
    }
}
