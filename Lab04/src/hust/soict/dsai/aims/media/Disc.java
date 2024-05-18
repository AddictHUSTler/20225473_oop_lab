package hust.soict.dsai.aims.media;

public class Disc extends Media{
    private int length;
    private String director;
    private int id;

    public Disc(int id, String title,String category,float cost,int length,String director){
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
    }

    public String getDirector(){
        return this.director;
    }
    public int getLength(){
        return this.length;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setLength(int length) {
        this.length = length;
    }
    @Override
    public String toString() {
        return "Disc - "+this.getTitle()+" - "+this.getCategory()+" - "+this.director+" - "+this.getCost()+"$";
    }
}
