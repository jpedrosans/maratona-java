package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero02 / numero01;
        System.out.println(resultado);
        System.out.println(numero01 + numero02);

        System.out.println();
        // %
        int resto = 20 % 2;
        int resto2 = 21 % 2;
        System.out.println(resto);
        System.out.println(resto2);

        System.out.println();
        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        System.out.println();
        // && (AND)      || (OR)     ! (NOT)
        int idade = 35;
        float salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        System.out.println();
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 500;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isDentroDaLeiMenorQueTrinta);

        System.out.println();
        // = += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000;       // 2800
        bonus -= 1000;       // 1800
        bonus *= 2;          // 3600
        bonus /= 2;          // 1800
        bonus %= 2;          // 0
        System.out.println(bonus);

        System.out.println();
        int contador = 0;
        contador++;         // 1
        contador--;         // 0
        System.out.println(contador);
        int contador2 = 0;
        System.out.println(++contador2);
        System.out.println(contador2);
    }
}
