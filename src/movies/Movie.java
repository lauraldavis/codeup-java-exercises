package movies;

public class Movie {
    private String name;
    private String category;

    //    Constructor
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }
    //  Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    // Getters
    public String getName() {
        return this.name;
    }
    public String getCategory() {
        return this.category;
    }


}
