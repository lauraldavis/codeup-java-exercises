public class DishTest {
    public static void main(String[] args) {

//        // Longhand, to create first instance of Dish
//        Dish dish2 = new Dish();
//        dish1.setCostInCents(475);
//        dish1.setNameOfDish("Mr. Orange");
//        dish1.setWouldRecommend(true);
        // Shorthand, using constructors to create instance of Dish
        Dish dish1 = new Dish(475, "Mr. Orange", true);
        dish1.printSummary();
        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);


//        // Longhand, to create next instance of Dish
//        Dish dish2 = new Dish();
//        dish2.setCostInCents(495);
//        dish2.setNameOfDish("Guacamole + Chips");
//        dish2.setWouldRecommend(true);
        Dish dish2 = new Dish(495, "Guacamole + Chips", true);
        dish2.printSummary();
        DishTools.shoutDishName(dish2);
        DishTools.analyzeDishCost(dish2);

        Dish dish3 = new Dish(100, "Cheeseburger", true);
        dish3.printSummary();
        DishTools.flipRecommendation(dish3);
        dish3.printSummary();
    }
}
