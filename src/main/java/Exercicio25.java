import javax.swing.JOptionPane;

public class Exercicio25 {

    public static void main(String[] args) {

        //Declaração de variáveis

        int qtde = 20;
        int[] vetor = new int[qtde];

        // Entrada de dados
        for (int i = 0; i < qtde; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: " + i));
        }

        // Cálculo da soma
        int soma = 0;
        for (int i = 0; i < qtde; i++) {
            soma += vetor[i];
        }

        // Cálculo da média
        double media = (double) soma / qtde;

        // Exibição dos resultados
        JOptionPane.showMessageDialog(null, "A soma é: " + soma + "\nA média é: " + media);
    }
}

