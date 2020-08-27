package classes;

import enums.MagazineType;
import java.util.List;

public class Magazine extends PrintedComposition{

    private MagazineType magazineType;
    
    public Magazine(int id, int version, String title, String subject, List<String> authors, List<String> keyWords, String publisher, int year, String city, int quantity, int stock, String cdu, int totalPages, float pageArea, MagazineType magazineType) {
        super(id, version, title, subject, authors, keyWords, publisher, year, city, quantity, stock, cdu, totalPages, pageArea);
        this.magazineType = magazineType;
    }

    public MagazineType getMagazineType() {
        return magazineType;
    }

    public void setMagazineType(MagazineType magazineType) {
        this.magazineType = magazineType;
    }
    
    @Override
    public void listComposition(){
        System.out.print("Magazine: ");
        super.listComposition();
    }
    
}
