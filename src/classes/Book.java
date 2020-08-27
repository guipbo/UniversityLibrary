package classes;

import enums.BookTypes;
import java.util.List;

public class Book extends PrintedComposition{
    
    private BookTypes bookType;
    private String series;
    
    public Book (int id, int version, String title, String subject, List<String> authors, List<String> keyWords, String publisher, int year, String city, int quantity, int stock, String cdu, int totalPages, float pageArea, BookTypes bookType, String series) {
        super(id, version, title, subject, authors, keyWords, publisher, year, city, quantity, stock, cdu, totalPages, pageArea);

        this.bookType = bookType;
        this.series = series;
    }

    public BookTypes getBookType() {
        return bookType;
    }

    public void setBookType(BookTypes bookType) {
        this.bookType = bookType;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
    
    @Override
    public void listComposition(){
        System.out.print("Book: ");
        super.listComposition();
    }
   
}
