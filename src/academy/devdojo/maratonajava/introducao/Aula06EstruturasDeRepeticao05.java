package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int i = (int) 30000; i >= 1; i--) {
            double valorParcela = valorCarro / i;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela: " + i + " R$ " + valorParcela);
        }
    }
}
