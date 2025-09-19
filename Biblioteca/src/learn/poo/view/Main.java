package learn.poo.view;
import learn.poo.model.Biblioteca;

public class Main {
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca(4);
        
        biblioteca.setLivros(1,"1808", 3, 2.50);
        biblioteca.setLivros(2,"1892", 1, 2.50);
        biblioteca.setLivros(3,"O Conde Monte Cristo", 2, 5.50);
        biblioteca.setLivros(4,"Crônicas de Narnia", 8, 5.00);

        biblioteca.getLivros();

        System.out.println(biblioteca.calcularMulta());
        System.out.println(biblioteca.calcularMedia());
        
        System.out.println(biblioteca.emprestarLivro(2,1));
        biblioteca.devolverLivro();   
    }
}