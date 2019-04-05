package startseite;

public class Tile {
    private String heading;
    private String caption;
    
    public Tile (String heading, String caption) {
        this.heading=heading;
        this.caption=caption;
    }

    public String getHeading() {
        return heading;
    }

    public String getCaption() {
        return caption;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }   

}
