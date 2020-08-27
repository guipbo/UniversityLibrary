package enums;

public enum MediaType {

    FITA("Fita"),
    DVD("DVD"),
    CD("CD"),
    VHS("VHS");
    
    private final String description;
    
    private MediaType (String description){
        this.description = description;
    }
    
    public String getDescription () {
        return description;
    }
}
