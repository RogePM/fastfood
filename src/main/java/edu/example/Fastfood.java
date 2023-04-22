package edu.example;

import java.util.Random;

public class Fastfood {
    //create fast food attributes
    String name;
    String type;
    String location;
    String price;
    String rating;

    
    //create fast food constructor with attributes 
    public Fastfood ( String name, String type, String location, String price,  String rating){
        this.name = name;
        this.type = type;
        this.location = location;
        this.price = price;
        this.rating = rating;
    }
    // contructor with ramdom set values
    public Fastfood() {
     Random rand = new Random();
    String[] names = {"McDonalds", "Burger King", "Wendys", "Taco Bell", "KFC"};
    String [] types = {"Burgers", "Chicken", "Tacos", "Fries", "Salads"};
    String [] locations = {"Downtown", "North", "South", "East", "West"};
    String [] prices = {"$","$$","$$$","$$$$","$$$$$"};
    String[] ratings = {"5 stars", "4 stars", "3 stars", "2 stars", "1 star"};
    
    this.name = names[rand.nextInt(names.length)];
    this.type = types[rand.nextInt(types.length)];
    this.location = locations[rand.nextInt(locations.length)];
    this.price = prices[rand.nextInt(prices.length)];
    this.rating = ratings[rand.nextInt(ratings.length)];
    }
    //create a toString method to print out the attributes
    public String toString() {
        return "Name: " + name + "\n" 
        + "Type: " + type + "\n" 
        + "Location: " + location + "\n" 
        + "Price: " + price + "\n" 
        + "Rating: " + rating + "\n";
    }
    //create a custom method to rank the resturant based on the rating attribute
     public String rank() {
        if (rating == "5 stars") {
             return "This is the best resturant";
       } else if (rating == "4 stars") {
            return "This is a good resturant";
        } else if (rating == "3 stars") {
             return "This is an okay resturant";
         } else if (rating == "2 stars") {
            return "This is a bad resturant";
        } else {
          return "This is the worst resturant";
        }
     }
     //create a custom method to rank the resturant based on the price attribute
     // this method is not used in the main method
        public String rankPrice() {
            if (price == "$$$$$") {
                return "This is the most expensive resturant";
        } else if (price == "$$$$") {
                return "This is an expensive resturant";
            } else if (price == "$$$") {
                return "This is an average priced resturant";
            } else if (price == "$$") {
                return "This is a cheap resturant";
            } else {
            return "This is the cheapest resturant";
            }
        }

      

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }


    

}
