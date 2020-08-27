package classes;

import java.util.List;

public class PrintedComposition extends Composition {
    
    private int totalPages;
    private float pageArea;
    
    public PrintedComposition (int id, int version, String title, String subject, List<String> authors, List<String> keyWords, String publisher, int year, String city, int quantity, int stock, String cdu, int totalPages, float pageArea){
        super(id, version, title, subject, authors, keyWords, publisher, year, city, quantity, stock, cdu);
        
        this.totalPages = totalPages;
        this.pageArea = pageArea;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public float getPageArea() {
        return pageArea;
    }

    public void setPageArea(float pageArea) {
        this.pageArea = pageArea;
    }
    
    @Override
    public void showCatalogCard(){
        System.out.println("----------------------------------------------------------------------------------------------------\n");
        
        for(int i=0; i<this.getAuthors().size(); i++)
            System.out.print(" " + this.getAuthors().get(i) + ".");
        System.out.println("\n");
        System.out.println(" " + this.getTitle() + " - " + "#" + this.getVersion() + " - " + this.getCity() + ": " + this.getPublisher() + ", " + this.getYear() + ".");
        System.out.println(" " + this.totalPages + " pages: " + pageArea + " cm²");
        System.out.print("\n " + this.getSubject() + ". ");
        for(int i=0; i<this.getKeyWords().size(); i++)
            System.out.print(this.getKeyWords().get(i) + ". ");
        
        System.out.println("\n\n----------------------------------------------------------------------------------------------------");
    }
    
    
}
