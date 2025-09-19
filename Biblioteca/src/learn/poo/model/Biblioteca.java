package learn.poo.model;

public class Biblioteca {

    private String[] livros;
    private int[] diasAtraso;
    private double[] multaPorDia;

    private int ctLivros;

    public Biblioteca(int ctLivros) {
        this.ctLivros = ctLivros;
        livros = new String[ctLivros];
        diasAtraso = new int[ctLivros];
        multaPorDia = new double[ctLivros];
    }

    public void setLivros(int i, String livro, int atraso, double multa) {
        this.livros[i - 1] = livro;
        this.diasAtraso[i - 1] = atraso;
        this.multaPorDia[i - 1] = multa;
    }

    public void getLivros() {
        for (int c = 0; c < this.ctLivros; c++) {
            System.out.println("\n Título do livro: " + this.livros[c] + "\n Dias de atraso: " + this.diasAtraso[c] + "\n Multa por dia: " + multaPorDia[c]);
        }
    }

    public String calcularMulta() {
        double totalMulta = 0;
        int comAtraso = 0;
        for (int c = 0; c < this.ctLivros; c++) {
            totalMulta += this.multaPorDia[c] * this.diasAtraso[c];
            comAtraso = this.diasAtraso[c];

        }
        return "\n Total da multa acumulada de todos os livros atrasados: R$" + totalMulta + "\n";

    }

    public String calcularMedia() {
        double somaAtraso = 0;
        double mediaAtraso;
        int count = 0;
        for (int c = 0; c < this.ctLivros; c++) {
            somaAtraso += this.diasAtraso[c];
            count++;
        }
        mediaAtraso = somaAtraso / count;
        return "Média de '" + mediaAtraso + "' dias de atraso para devoluções de livros.";
    }

    public String emprestarLivro(int i, int ctLivros) {
        if (this.diasAtraso[i - 1] >= ctLivros) {
            this.diasAtraso[i - 1] -= ctLivros;
            for (int c = 0; c < this.ctLivros; c++) {
                if (i == this.ctLivros) {
                    this.diasAtraso[c]++;
                }
            }
            return "\n Empréstimo do livro foi realizado! \n";
        } else {
            return "Empréstimo não permitido!";
        }
    }

    public void devolverLivro() {
        double totalMulta = 0;
        String devolvido = "";
        for (int c = 0; c < this.ctLivros; c++) {
            totalMulta = this.multaPorDia[c] * this.diasAtraso[c];
            devolvido = this.livros[c];
        }
        // return this.diasAtraso"\n Total da multa acumulada de todos os livros atrasados: R$" + totalMulta + "\n";
        System.out.println("----Devolução----\n Livro: " + devolvido + "\n Multa atualizada: " + totalMulta);
    }

}
