package classes;

import java.util.List;

public class Report extends PrintedComposition {

    public Report(int id, int version, String title, String subject, List<String> authors, List<String> keyWords, String publisher, int year, String city, int quantity, int stock, String cdu, int totalPages, float pageArea) {
        super(id, version, title, subject, authors, keyWords, publisher, year, city, quantity, stock, cdu, totalPages, pageArea);
    }
    
    @Override
    public void listComposition(){
        System.out.print("Report: ");
        super.listComposition();
    }
}
