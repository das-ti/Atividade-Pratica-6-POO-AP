package learn.poo.model;

public class Videolocadora {

    private String[] filmes;
    private double[] precosLocacao;
    private int[] vezesAlugado;

    private int qtdFilmes;
    private int qtdCopia;

    public Videolocadora(int qtdFilmes) {
        this.qtdFilmes = qtdFilmes;
        filmes = new String[qtdFilmes];
        vezesAlugado = new int[qtdFilmes];
        precosLocacao = new double[qtdFilmes];
    }

    public void setFilmes(int i, String filme, double preco, int locacoes) {
        this.filmes[i - 1] = filme;
        this.precosLocacao[i - 1] = preco;
        this.vezesAlugado[i - 1] = locacoes;
    }

    public void getFilmes() {
        for (int c = 0; c < this.qtdFilmes; c++) {
            System.out.println("Título do filme: " + this.filmes[c] + "\n Preço da locação: " + this.precosLocacao[c] + "\n Total de locações: " + this.vezesAlugado[c] + "\n");
        }
    }

    public String simularFaturamento() {
        double totalFaturado = 0;
        for (int c = 0; c < this.qtdFilmes; c++) {
            totalFaturado += this.precosLocacao[c];
        }
        return "Faturamento esperado se todos os filmes fossem alugados uma vez: R$" + totalFaturado + "\n";
    }

    public String listarMaisAlugados() {
        int menosAlugado = 99999, maisAlugado = 0;
        String filmeMais = "";
        String filmeMenos = "";
        for (int c = 0; c < this.qtdFilmes; c++) {
            if (this.vezesAlugado[c] > maisAlugado) {
                filmeMais = filmes[c];
                maisAlugado = this.vezesAlugado[c];
            }
            if (this.vezesAlugado[c] < menosAlugado) {
                filmeMenos = filmes[c];
                menosAlugado = this.vezesAlugado[c];
            }
        }
        return "Mais alugado: " + filmeMais + ", " + maisAlugado + " vezes.\n"
                + "Menos alugado: " + filmeMenos + ", " + menosAlugado + " vezes.\n";
    }

    public String locarFilme(int i) {
        String tituloFilme = "";
        for (int c = 0; c < this.qtdFilmes; c++) {
            if (i == this.qtdFilmes) {
                tituloFilme = filmes[c];
                this.vezesAlugado[c]++;
                this.qtdCopia -= qtdFilmes;
            }

        }
        return "Locação do filme " + tituloFilme + " foi realizada!";

    }

    public void devolverFilme() {
        System.out.println("Obrigado pela devolução!");
    }
}
