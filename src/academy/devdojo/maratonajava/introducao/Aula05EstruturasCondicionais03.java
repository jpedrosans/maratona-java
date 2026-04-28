package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario >= 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar R$ 500";
        String mensagemNaoDoar = "Ainda não posso doar";
        String resultado = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;
        String resultado2 = salario >= 5000 ? "Eu vou doar R$ 500" : "Ainda não posso doar";
        System.out.println(resultado);
        System.out.println(resultado2);
    }
}
