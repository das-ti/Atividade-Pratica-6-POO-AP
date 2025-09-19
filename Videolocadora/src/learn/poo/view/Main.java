package learn.poo.view;
import learn.poo.model.Videolocadora;

public class Main {
    public static void main(String[] args) {
        Videolocadora locadora = new Videolocadora(5);
        locadora.setFilmes(1, "A Hora do Rush", 5.00, 65);
        locadora.setFilmes(2, "Guerra dos Mundos", 7.00, 42);
        locadora.setFilmes(3, "Iron Man", 10.00, 125);
        locadora.setFilmes(4, "Deby & Loyd", 8.00, 99);
        locadora.setFilmes(5, "King Kong", 5.00, 40);

        locadora.getFilmes();
        System.out.println();
        System.out.println(locadora.simularFaturamento());

        System.out.println(locadora.listarMaisAlugados());

        // Parametro do filme desejado ()
        System.out.println(locadora.locarFilme(5));
        locadora.devolverFilme();
    }
}
