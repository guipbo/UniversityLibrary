package classes;

import java.util.List;

public class Composition {

    private int id;
    private int version;
    private String title;
    private String subject;
    private List<String> authors;
    private List<String> keyWords;
    private String publisher;
    private int year;
    private String city;
    private int quantity;
    private int stock;
    private String cdu;
    
    public Composition (int id, int version, String title, String subject, List<String> authors, List<String> keyWords, String publisher, int year, String city, int quantity, int stock, String cdu){
        this.id = id;
        this.version = version;
        this.title = title;
        this.subject = subject;
        this.authors = authors;
        this.keyWords = keyWords;
        this.publisher = publisher;
        this.year = year;
        this.city = city;
        this.quantity = quantity;
        this.stock = stock;
        this.cdu = cdu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public List<String> getAuthors(){
        return authors;
    }
    
    public void setAuthor(List<String> authors){
        this.authors = authors;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<String> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(List<String> keyWords) {
        this.keyWords = keyWords;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCdu() {
        return cdu;
    }

    public void setCdu(String cdu) {
        this.cdu = cdu;
    }
    
    public void borrow(){
        if(this.stock > 0){
            this.stock -= 1;
            System.out.println("You have successfully borrowed the item: " + this.id + " - " + this.title + ".\nYou have 7 days to return it or extend the due date.\nThank you! Enjoy it.");
            return;
        }
        System.out.println("You don't have stock for this action.");
    }
    
    public void returnItem(){
        if(this.stock < this.quantity ){
            this.stock += 1;
            System.out.println("You have successfully returned the item: " + this.id + " - " + this.title + ".\nThank you!");
            return;
        }
        System.out.println("The stock is full.");
    }
    
    public void listComposition(){
        System.out.println(this.id + " - "+ this.title);
    }

    public void consultStock(){
        System.out.println("Item: " + this.id + " - " + this.title + ": " + this.stock + "/" + this.quantity);
    }
    
    public void showCatalogCard(){
        System.out.println("----------------------------------------------------------------------------------------------------\n");
        
        for(int i=0; i<this.authors.size(); i++)
            System.out.print(" " + this.authors.get(i) + ".");
        System.out.println("\n");
        System.out.println(" " + this.title + " - " + "#" + this.version + " - " + this.city + ": " + this.publisher + ", " + this.year + ".");
        System.out.print("\n " + this.subject + ". ");
        for(int i=0; i<this.keyWords.size(); i++)
            System.out.print(this.keyWords.get(i) + ". ");
        
        System.out.println("----------------------------------------------------------------------------------------------------\n");
    }
    
}
