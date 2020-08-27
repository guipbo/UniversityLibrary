package enums;

public enum BookTypes {
    
    ACTION("Action and adventure"),
    ART("Art/architecture"),
    AUTOBIOGRAPHY("Autobiography"),
    ANTHOLOGY("Anthology"),
    BIOGRAPHY("Biography"),
    BUSINESS("Business/economics"),
    HOBBIES("Crafts/hobbies"),
    CLASSIC("Classic"),
    COOKBOOK("Cookbook"),
    COMICBOOK("Comic book"),
    DICTIONARY("Dictionary"),
    CRIME("Crime"),
    ENCYCLOPEDIA("Encyclopedia"),
    DRAMA("Drama"),
    GUIDE("Guide"),
    FAIRYTALE("Fairytale"),
    HEALTH("Health/fitness"),
    FANTASY("Fantasy"),
    HISTORY("History"),
    GRAPHIC_NOVEL("Graphic novel"),
    HUMOR("Humor"),
    HORROR("Horror"),
    JOURNAL("Journal"),
    MYSTERY("Mystery"),
    MATH("Math"),
    PICTURE("Picture book"),
    PHILOSOPHY("Philosophy"),
    POETRY("Poetry"),
    ROMANCE("Romance"),
    SATIRE("Satire"),
    SCIENCE_FICTION("Science fiction"),
    TEXTBOOK("Textbook"),
    TRUE_CRIME("True crime"),
    REVIEW("Review"),
    SCIENCE("Science"),
    SUSPENSE("Suspense"),
    SELF_HELP("Self help"),
    THRILLER("Thriller"),
    SPORTS("Sports and leisure"),
    WESTERN("Western"),
    TRAVEL("Travel");
    
    private final String description;
    
    private BookTypes (String description){
        this.description = description;
    }
    
    public String getDescription () {
        return description;
    }
}
