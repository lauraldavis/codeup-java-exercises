public class Dish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

//    Constructor
    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    // Methods
    public void printSummary() {
        System.out.printf("%nCost: $%.2f%n", (float) this.costInCents/100);
        System.out.printf("Name: %s%n", this.nameOfDish);
        System.out.printf("Recommended: %b%n%n", this.wouldRecommend);
    }

//    Setters
    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }
    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }
    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

//    Getters
    public int getCostInCents() {
        return this.costInCents;
    }
    public String getNameOfDish() {
        return this.nameOfDish;
    }
    public boolean getWouldRecommend() {
        return this.wouldRecommend;
    }

}
