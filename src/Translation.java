
public class Translation {
    private String tagalog;
    private String ilonggo;

    public Translation(String tagalog, String ilonggo) {
        this.tagalog = tagalog;
        this.ilonggo = ilonggo;
    }

    public String getTagalog() {
        return tagalog;
    }

    public String getIlonggo() {
        return ilonggo;
    }
    
    public String toString() {
        return "Tagalog: " + tagalog + ", Ilonggo: " + ilonggo;
    }
}
