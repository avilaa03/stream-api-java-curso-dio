package desafiosStreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosDivisiveisJuntos = new ArrayList<>();

        List<Integer> numerosDivisiveis3 = numeros.stream()
                .filter(n -> n % 3 == 0)
                .toList();

        List<Integer> numerosDivisiveis5 = numeros.stream()
                .filter(n -> n % 5 == 0)
                .toList();

        numerosDivisiveisJuntos.addAll(numerosDivisiveis3);
        numerosDivisiveisJuntos.addAll(numerosDivisiveis5);


        int somaNumerosDivisiveis = numerosDivisiveisJuntos.stream()
                .reduce(0, Integer::sum);

        System.out.println(somaNumerosDivisiveis);
    }
}
