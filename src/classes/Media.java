package classes;

import enums.MediaType;
import java.util.List;

public class Media extends Composition {

    private MediaType mediaType;
    
    public Media(int id, int version, String title, String subject, List<String> authors, List<String> keyWords, String publisher, int year, String city, int quantity, int stock, String cdu, MediaType mediaType) {
        super(id, version, title, subject, authors, keyWords, publisher, year, city, quantity, stock, cdu);
        
        this.mediaType = mediaType;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }
    
    @Override
    public void listComposition(){
        System.out.print("Media: ");
        super.listComposition();
    }
}
