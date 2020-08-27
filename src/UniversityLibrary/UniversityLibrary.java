package UniversityLibrary;
import classes.*;
import enums.BookTypes;
import enums.MagazineType;
import enums.MediaType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniversityLibrary {

    public static void main(String[] args) throws IOException {
        
        //Clear Screen
        for(int i=0; i<50; i++)
            System.out.println(" ");
        
        List<Composition> BU = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String menu="";
        
        while(!menu.equalsIgnoreCase("8")){
            System.out.print("---------------");
            System.out.println("-----\nLibrary\n");
            System.out.println("1 - List items;");
            System.out.println("2 - Borrow item;");
            System.out.println("3 - Return item;");
            System.out.println("4 - Search item;");
            System.out.println("5 - Catalog Card;");
            System.out.println("6 - Consult stock;");
            System.out.println("7 - Populate library;");
            System.out.println("8 - Exit.");
            System.out.print("Choose between the options above: ");
            menu = scan.next();
            
            switch (menu) {
                //List items
                case "1": {
                    if(BU.isEmpty()){
                        System.out.println("There's nothing to list.\nThe library is empty.");
                        break;
                    }
                    itemsList(BU);
                    break;
                }
                //Borrow item
                case "2": {
                    borrowItem(BU);
                    break;
                }
                //Return item
                case "3": {
                    returnItemsMenu(BU);
                    break;
                }
                //Search item
                case "4": {
                    searchItems(BU);
                    break;
                }
                //Catalog card
                case "5": {
                    catalogCard(BU);
                    break;
                }
                //Consult stock
                case "6": {
                    for(int i=0; i<BU.size(); i++)
                        BU.get(i).consultStock();
                    break;
                }
                //Populate library
                case "7": {
                    populateLibrary(BU);
                    break;
                }
                //Exit
                case "8": {
                    break;
                }
                //Invalid option
                default: {
                    System.out.println("Invalid option." + 
                            "\nPlease choose between the available options.");
                    break;
                }
            }
        }
    }
    
    //Items list
    private static void itemsList (List<Composition> BU){
        
        String menu="";
        Scanner scan = new Scanner(System.in);
        
        while (!menu.equalsIgnoreCase("9")){
            System.out.println("-----\nList items\n");
            System.out.println("1 - List all items;");
            System.out.println("2 - List books;");
            System.out.println("3 - List final papers;");
            System.out.println("4 - List magazines;");
            System.out.println("5 - List maps;");
            System.out.println("6 - List medias;");
            System.out.println("7 - List posters;");
            System.out.println("8 - List reports;");
            System.out.println("9 - Main menu.");
            System.out.print("Choose between the options above: ");
            menu = scan.next();
            System.out.println("-----");
            
            switch (menu){
                //List all items
                case "1":{
                    System.out.println("All itens: ");
                    for(int i=0; i<BU.size(); i++)                                      
                        BU.get(i).listComposition();
                    break;
                }
                //List books
                case "2":{
                    System.out.println("Books: ");
                    for(int i=0; i<BU.size(); i++)
                        if(BU.get(i) instanceof Book)
                            BU.get(i).listComposition();
                    break;
                }
                //List final papers
                case "3":{
                    System.out.println("Final papers: ");
                    break;
                }
                //List magazines
                case "4":{
                    System.out.println("Magazines: ");
                    break;
                }
                //List maps
                case "5":{
                    System.out.println("Maps: ");
                    break;
                }
                //List medias
                case "6":{
                    System.out.println("Medias: ");
                    break;
                }
                //List posters
                case "7":{
                    System.out.println("Posters: ");
                    break;
                }
                //List reports
                case "8":{
                    System.out.println("Reports: ");
                    break;
                }
                //Main menu
                case "9":{
                    break;
                }
                //Invalid option
                default: {
                    System.out.println("Invalid option." + 
                            "\nPlease choose between the available options.");
                    break;
                }
            }
        }
    }
    
    //Borrow item
    private static void borrowItem (List<Composition> BU){
        Scanner scan = new Scanner(System.in);
        String item;
        
        System.out.println("Type the code of the item you want to borrow: ");
        item = scan.next();
        
        for(int i=0; i<BU.size(); i++)
            if(item.equals(Integer.toString(BU.get(i).getId()))){
                BU.get(i).borrow();
                return;
            }
        System.out.println("Invalid option!\nPlease verify the code and try again.");
    }

    //Return item
    private static void returnItemsMenu (List<Composition> BU){
        Scanner scan = new Scanner(System.in);
        String item;
        
        System.out.println("Type the code of the item you want to return: ");
        item = scan.next();
        
            for(int i=0; i<BU.size(); i++)
                if(item.equals(Integer.toString(BU.get(i).getId()))){
                    BU.get(i).returnItem();
                    return;
                }
            System.out.println("Invalid option!\nPlease verify the code and try again.");
    }
    
    //Search
    private static void searchItems(List<Composition> BU){
        
      Scanner scan = new Scanner(System.in);
      List<Integer> ids = new ArrayList<>();
      String item;
      String print;
        
      
      System.out.println("-----");
      System.out.println("Type what you need to find: ");
      item = scan.next();

        
        for(int i=0; i<BU.size(); i++){
//            Debug
//            System.out.println("\n----------\nBook: " + BU.get(i).getTitle());
//            System.out.println("Id: " + Integer.toString(BU.get(i).getId()) + " = " + item + " ? " + item.equals(Integer.toString(BU.get(i).getId())));
//            System.out.println("Year: " + Integer.toString(BU.get(i).getYear()) + " = " + item + " ? " + item.equals(Integer.toString(BU.get(i).getYear())));
//            System.out.println("Title: " + BU.get(i).getTitle() + " = " + item + " ? " + containsIgnoreCase(BU.get(i).getTitle(), item));
//            System.out.println("City: " + BU.get(i).getCity() + " = " + item + " ? " + containsIgnoreCase(BU.get(i).getCity(), item));
//            System.out.println("Publisher: " + BU.get(i).getPublisher() + " = " + item + " ? " + containsIgnoreCase(BU.get(i).getPublisher(), item));
//            System.out.println("Subject: " + BU.get(i).getSubject() + " = " + item + " ? " + containsIgnoreCase(BU.get(i).getSubject(), item));
//            System.out.println("Authors: " + BU.get(i).getAuthors() + " = " + item + " ? " + searchLists(BU.get(i).getAuthors(), item));
//            System.out.println("Keywords: " + BU.get(i).getKeyWords() + " = " + item + " ? " + searchLists(BU.get(i).getKeyWords(), item));
            
            if(
            item.equals(Integer.toString(BU.get(i).getId())) 
            || item.equals(Integer.toString(BU.get(i).getYear())) 
            || containsIgnoreCase(BU.get(i).getTitle(), item)
            || containsIgnoreCase(BU.get(i).getCity(), item)
            || containsIgnoreCase(BU.get(i).getPublisher(), item)
            || containsIgnoreCase(BU.get(i).getSubject(), item)
            || searchLists(BU.get(i).getAuthors(), item)
            || searchLists(BU.get(i).getKeyWords(), item)
            ){
                BU.get(i).listComposition();
                //Take the position of the item and save it to print that item later
                ids.add(i);
            }
        }
        
        if(ids.isEmpty()){
            System.out.println("Nothing was found!\nPlease try again.");
            return;
        }
        
        System.out.println("-----" );
        System.out.println("Do you want to print the catalog cards of the items that you found? 'Y' for yes: " );
            print = scan.next();
            if(print.equals("Y") || print.equals("y"))
                for(int i=0; i<ids.size(); i++){
                    BU.get(ids.get(i)).showCatalogCard();
                }
                    
            
    }
    //Searching aux
    public static boolean containsIgnoreCase(String str, String subString){
        return str.toLowerCase().contains(subString.toLowerCase());
    }
    public static boolean searchLists(List<String> list, String item){
        for (int j=0; j<list.size(); j++)
            if(containsIgnoreCase(list.get(j), item))
                return true;
        return false;
    }
    
    //Catalog card
    private static void catalogCard (List<Composition> BU){
        Scanner scan = new Scanner(System.in);
        String item;
        
        System.out.println("Type the code of the item that you want the catalog card: ");
        item = scan.next();
        
            for(int i=0; i<BU.size(); i++)
                if(item.equals(Integer.toString(BU.get(i).getId()))){
                    BU.get(i).showCatalogCard();
                    return;
                }
            System.out.println("Invalid option!\nPlease verify the code and try again.");
    }
    
    //Populate library
    private static void populateLibrary (List<Composition> BU){
        createBooks(BU);
        createFinalPapers(BU);
        createMagazines(BU);
        createMaps(BU);
        createMedias(BU);
        createPosters(BU);
        createReports(BU);
    }
    
    private static void createBooks(List<Composition> BU){
        
        List<String> authors = new ArrayList<>();
        authors.add("J. R. R. Tolkien");
        List<String> authors2 = new ArrayList<>();
        authors.add("Stephen Hawking");
        
        List<String> keyWords = new ArrayList<>();
        keyWords.add("Fantasy");
        keyWords.add("Medieval");
        keyWords.add("English");
        keyWords.add("Rings");
        keyWords.add("Epic");
        keyWords.add("Novel");
        keyWords.add("Middle-earth");
        List<String> keyWords2 = new ArrayList<>();
        keyWords2.add("Popular");
        keyWords2.add("Science");
        keyWords2.add("Cosmology");
        
        Book book1 = new Book(1, 1, "The Hobbit", "Fantasy", authors, keyWords, "George Allen & Unwin", 1937, "Bournemouth", 40, 39, "823.912", 310, 198, BookTypes.FANTASY, "The Lord of the Rings");
        Book book2 = new Book(2, 1, "The Lord of the Rings - Fellowship of the Ring", "Fantasy", authors, keyWords, "George Allen & Unwin", 1954, "Bournemouth", 30, 2, "823.912", 423, 198, BookTypes.FANTASY, "The Lord of the Rings");
        Book book3 = new Book(3, 2, "The Lord of the Rings - The Two Towers", "Fantasy", authors, keyWords, "George Allen & Unwin", 1954, "Bournemouth", 28, 12, "823.912", 352, 198, BookTypes.FANTASY, "The Lord of the Rings");
        Book book4 = new Book(4, 2, "The Lord of the Rings - The Return of the King", "Fantasy", authors, keyWords, "George Allen & Unwin", 1955, "Bournemouth", 18, 17, "823.91", 416, 198, BookTypes.FANTASY, "The Lord of the Rings");
        Book book5 = new Book(5, 2, "A Brief History of Time", "Cosmology", authors2, keyWords2, "Bantam Books", 1955, "Bournemouth", 15, 14, "523.1 21", 212, 348, BookTypes.SCIENCE, "Science");
        
        BU.add(book1);
        BU.add(book2);
        BU.add(book3);
        BU.add(book4);
        BU.add(book5);
       
    }
    
    private static void createFinalPapers(List<Composition> BU){
        
        List<String> authors = new ArrayList<>();
        authors.add("Luiza Lima Silva De Carli");
        List<String> keyWords = new ArrayList<>();
        keyWords.add("Design");
        keyWords.add("TCC");
        keyWords.add("Portugueses");
        FinalPaper finalpaper1 = new FinalPaper(6, 1, "Clothing kit for assistance in shelters after disasters", "Design", authors, keyWords, "Luiza Lima Silva De Carli", 2014, "São Paulo", 1, 1, "111.111", 110, 624, "Design", "FAU-USP", "Prof.a Dr.a Lara Leite Barbosa");
        
        List<String> authors2 = new ArrayList<>();
        authors.add("Cintia Sayuri Sawada");
        List<String> keyWords2 = new ArrayList<>();
        keyWords.add("Architecture and Urbanism");
        keyWords.add("TCC");
        keyWords.add("Portugueses");
        FinalPaper finalpaper2 = new FinalPaper(7, 1, "Temporary facilities for horse racing in Cartmel (England)", "Architecture and Urbanism", authors2, keyWords2, "Cintia Sayuri Sawada", 2013, "São Paulo", 1, 1, "111.111", 110, 624, "Architecture and Urbanism", "FAU-USP", "Prof.a Dr.a Lara Leite Barbosa");
        
        List<String> authors3 = new ArrayList<>();
        authors.add("Igor Perboni");
        List<String> keyWords3 = new ArrayList<>();
        keyWords.add("Architecture and Urbanism");
        keyWords.add("TCC");
        keyWords.add("Portugueses");
        FinalPaper finalpaper3 = new FinalPaper(8, 1, "Multifunctional furniture for hostels in Sao Paulo", "Architecture and Urbanism", authors3, keyWords3, "Igor Perboni", 2014, "São Paulo", 1, 1, "111.111", 110, 624, "Architecture and Urbanism", "FAU-USP", "Prof.a Dr.a Lara Leite Barbosa");
        
        BU.add(finalpaper1);
        BU.add(finalpaper2);
        BU.add(finalpaper3);
    }
    
    private static void createMagazines(List<Composition> BU){
        List<String> authors = new ArrayList<>();
        authors.add("Yoshihito SUZUKI");
        List<String> keyWords = new ArrayList<>();
        keyWords.add("Bioscience");
        keyWords.add("Biotechnology");
        keyWords.add("Biochemistry");
        Magazine magazine = new Magazine(9, 1, "Bioscience, Biotechnology, and Biochemistry", "Bioscience", authors, keyWords, "Oxford Academy", 2020, "Oxford", 15, 10, "111.111", 50, 624, MagazineType.MAGAZINE);
        
        BU.add(magazine);
    }
    
    private static void createMaps(List<Composition> BU){
        List<String> authors = new ArrayList<>();
        authors.add("Kim Rutledge");
        authors.add("Hilary Costa");
        authors.add("Erin Sprout");
        authors.add("Santani Teng");
        authors.add("Melissa McDaniel");
        authors.add("Diane Boudreau");
        authors.add("Tara Ramroop");
        authors.add("Jeff Hunt");
        authors.add("Hilary Hall");
        List<String> keyWords = new ArrayList<>();
        keyWords.add("Types of Maps");
        keyWords.add("Maps");
        keyWords.add("History of Mapmaking");
        List<String> illustrators = new ArrayList<>();
        illustrators.add("Mary Crooks");
        illustrators.add("National Geographic Society");
        illustrators.add("Tim Gunther");
        Map map1 = new Map(10, 1, "Physical Map V1", "Bioscience", authors, keyWords, "Oxford Academy", 2020, "Oxford", 15, 10, "111.111", 1, 1500, illustrators);
        Map map2 = new Map(11, 3, "Physical Map V3", "Bioscience", authors, keyWords, "Oxford Academy", 2020, "Oxford", 17, 9, "111.111", 1, 1687, illustrators);
        
        BU.add(map1);
        BU.add(map2);
    }
    
    private static void createMedias(List<Composition> BU){
        List<String> authors1 = new ArrayList<>();
        authors1.add("Judy Freudberg");
        authors1.add("Tony Geiss");
        List<String> keyWords1 = new ArrayList<>();
        keyWords1.add("Dinosaurs");
        keyWords1.add("Movie");
        Media media1 = new Media(12, 9, "The Land Before Time", "Dino", authors1, keyWords1, "Universal Pictures", 1988, "Hollywood", 32, 2, "111.111", MediaType.VHS);
        List<String> authors2 = new ArrayList<>();
        authors2.add("Jørn Lande");
        List<String> keyWords2 = new ArrayList<>();
        keyWords2.add("Music");
        keyWords2.add("Rock");
        keyWords2.add("Heavy Metal");
        Media media2 = new Media(13, 6, "Starfire ", "Music", authors2, keyWords2, "Frontiers Records", 1988, "	Telemark", 2, 2, "111.111", MediaType.CD);
        
        BU.add(media1);
        BU.add(media2);
    }
    
    private static void createPosters(List<Composition> BU){
        List<String> authors = new ArrayList<>();
        authors.add("Judy Freudberg");
        List<String> keyWords = new ArrayList<>();
        keyWords.add("Iquality");
        keyWords.add("Liberty");
        Poster poster = new Poster(14, 7, "Iquality", "Iquality", authors, keyWords, "myself", 2020, "Divinópolis", 1, 1, "111.111");
        
        BU.add(poster);
    }
    
    private static void createReports(List<Composition> BU){
        List<String> authors1 = new ArrayList<>();
        authors1.add("Gruilherme");
        List<String> keyWords1 = new ArrayList<>();
        keyWords1.add("Program");
        keyWords1.add("Java");
        Report reports1 = new Report(15, 3, "About Java", "Java", authors1, keyWords1, "UEMG", 2020, "Divinópolis", 1, 1, "111.111", 32, 624);
        List<String> authors2 = new ArrayList<>();
        authors2.add("Rafael");
        List<String> keyWords2 = new ArrayList<>();
        keyWords2.add("Program");
        keyWords2.add("C");
        Report reports2 = new Report(16, 6, "About C", "C", authors2, keyWords2, "UEMG", 2020, "Divinópolis", 1, 1, "111.111", 33, 624);
        
        BU.add(reports1);
        BU.add(reports2);
    }
    
}
