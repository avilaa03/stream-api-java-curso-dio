package desafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaTotalDosDigitos = numeros.stream()
                .map(numero -> Integer.toString(numero))
                .flatMapToInt(String::chars)
                .map(Character::getNumericValue)
                .sum();

        System.out.println(somaTotalDosDigitos);
    }
}
