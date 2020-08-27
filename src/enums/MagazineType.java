package enums;

public enum MagazineType {
    
    MAGAZINE("Magazine"),
    JOURNAL("Journal");
    
    private final String description;
    
    private MagazineType (String description){
        this.description = description;
    }
    
    public String getDescription () {
        return description;
    }
}
