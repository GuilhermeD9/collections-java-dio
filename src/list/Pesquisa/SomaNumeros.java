package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }

    public int calcularSoma() {
        int aux = 0;
        for (int n = 0; n < numerosList.size(); n++) {
            aux = aux + numerosList.get(n);
        }
        return aux;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        for (Integer n : numerosList) {
            if (n > maiorNumero) {
                maiorNumero = n;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = 0;
        for (Integer n : numerosList) {
            if (menorNumero == 0) {
                menorNumero = n;
            } else if (n < menorNumero) {
                menorNumero = n;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(numerosList);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
