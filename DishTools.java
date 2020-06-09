public class DishTools {
    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    // Methods
    public static void shoutDishName(Dish dish) {
        System.out.println(dish.getNameOfDish().toUpperCase());
    }
    public static void analyzeDishCost(Dish dish) {
        if (dish.getCostInCents() > DishTools.AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println("More expensive than average");
        } else {
            System.out.println("Less expensive than average");
        }
    }
    public static Dish flipRecommendation(Dish dish) {
        dish.setWouldRecommend( !dish.getWouldRecommend() );
        return dish;
    }

}
