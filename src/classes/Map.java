package classes;

import java.util.List;

public class Map extends PrintedComposition{

    private List<String> illustrators;
    
    public Map(int id, int version, String title, String subject, List<String> authors, List<String> keyWords, String publisher, int year, String city, int quantity, int stock, String cdu, int totalPages, float pageArea, List<String> illustrators) {
        super(id, version, title, subject, authors, keyWords, publisher, year, city, quantity, stock, cdu, totalPages, pageArea);
        
        this.illustrators = illustrators;
    }

    public List<String> getIllustrators() {
        return illustrators;
    }

    public void setIllustrators(List<String> illustrators) {
        this.illustrators = illustrators;
    }
    
    @Override
    public void listComposition(){
        System.out.print("Map: ");
        super.listComposition();
    }
    
}
