package classes;

import java.util.List;

public class Poster extends Composition {

    public Poster(int id, int version, String title, String subject, List<String> authors, List<String> keyWords, String publisher, int year, String city, int quantity, int stock, String cdu) {
        super(id, version, title, subject, authors, keyWords, publisher, year, city, quantity, stock, cdu);
    }
    
    @Override
    public void listComposition(){
        System.out.print("Poster: ");
        super.listComposition();
    }
}
