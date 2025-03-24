package application.TOV_App;
//data model for the game objects
//encapsulates the details of each game in the main Game List window
public class Game {
    private String title;
    private String description;
    private String imageUrl;//to check if the image is right
    private String specifications;

    public Game(String title, String description, String imageUrl, String specifications) {
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.specifications = specifications;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getSpecifications() {
        return specifications;
    }
}
