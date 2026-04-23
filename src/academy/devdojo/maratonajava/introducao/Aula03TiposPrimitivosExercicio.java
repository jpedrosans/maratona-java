package academy.devdojo.maratonajava.introducao;

/*
Crie variáveis para os campos descritivos abaixo entre <> e imprima a seguinte mensagem

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "João Pedro";
        String endereco = "Av Joao das galileias";
        double salario = 5431.12;
        String dataRecebimentoSalario = "20/12/2021";
        String relatorio = "Eu " + nome + " morando no endereço " + endereco + " confirmo que recebi o salário de "
                + salario + ", na data " + dataRecebimentoSalario;

        System.out.println(relatorio);

        System.out.println("Eu " + nome + " morando no endereço " + endereco + " confirmo que recebi o salário de "
                + salario + ", na data " + dataRecebimentoSalario);
    }
}
