package edu.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Shows ramdom fast food resturant with attributes incase you cannot decide
        Fastfood rest= new Fastfood();
        System.out.println(rest);

        //Shows custom method rank based on rating attribute
        System.out.println("Rating: "+rest.rank());
        //Shows custom method rank based on price attribute
        System.out.println("Price "+ rest.rankPrice());

    // an array for fast food items
        ArrayList<FastFoodItem> FastFoodList = new ArrayList<>();
        FastFoodList.add(new FastFoodItem("McDonalds", "Burger", 5.99, "A"));
        FastFoodList.add(new FastFoodItem("Burger King", "Burger", 4.99, "B"));
        FastFoodList.add(new FastFoodItem("Wendys", "Burger", 3.99, "C"));
        FastFoodList.add(new FastFoodItem("Taco Bell", "Mexican", 2.99, "D"));
        FastFoodList.add(new FastFoodItem("Chipotle", "Mexican", 1.99, "E"));


       //print out all fast food items to decide what to eat instead of resturants 
        for (FastFoodItem item : FastFoodList) {
            System.out.println("\n"+item);
        }
        //create loop to print out all fast food resturants with a rating of A
        for (FastFoodItem item : FastFoodList) {
            if (item.getRating() == "A") {
                System.out.println("\nOnly good item is "+item);
            }
        }
        //create loop to instanciate a new fast food item with a rating of A
        for (FastFoodItem item : FastFoodList) {
            if (item.getPrice() == 5.99) {
                FastFoodItem newItem = new FastFoodItem("McDonalds", "mcChicken", 1.99, "B");
                System.out.println("\nCouldn't afford Burger"+newItem);
            }
        }
    }
}

