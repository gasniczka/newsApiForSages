import java.io.Serializable;


public class NewsInfo implements Serializable {

    private String name;
    private String description;
    private String url;

    public NewsInfo(String name, String description, String url) {

        this.name = name;
        this.description = description;
        this.url = url;
    }


    public String getName() {
        return name;
    }

    public String getInfo() {
        return String.format("%s:%s:%s", name, description, url);
    }


}
