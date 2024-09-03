package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> contador;

    public ContagemPalavras() {
        this.contador = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem) {
        contador.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contador.isEmpty()) {
            contador.remove(palavra);
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : contador.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavrasMaisFrequentes () {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

    //Main
    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavras("Java", 2);
        contagemLinguagens.adicionarPalavras("Python", 8);
        contagemLinguagens.adicionarPalavras("JavaScript", 1);
        contagemLinguagens.adicionarPalavras("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequentes();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
