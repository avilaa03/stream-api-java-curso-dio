package desafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numeroNegativo = numeros.stream()
                .anyMatch(numero -> numero < 0);

        System.out.println(numeroNegativo);
    }
}
