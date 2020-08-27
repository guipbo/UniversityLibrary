package classes;

import java.util.List;

public class FinalPaper extends PrintedComposition {

    String course;
    String university;
    String counselor;
    
    public FinalPaper(int id, int version, String title, String subject, List<String> authors, List<String> keyWords, String publisher, int year, String city, int quantity, int stock, String cdu, int totalPages, float pageArea, String course, String university, String counselor) {
        super(id, version, title, subject, authors, keyWords, publisher, year, city, quantity, stock, cdu, totalPages, pageArea);
        
        this.course = course;
        this.university = university;
        this.counselor = counselor;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCounselor() {
        return counselor;
    }

    public void setCounselor(String counselor) {
        this.counselor = counselor;
    }
    
    @Override
    public void listComposition(){
        System.out.print("Final Paper: ");
        super.listComposition();
    }
}
