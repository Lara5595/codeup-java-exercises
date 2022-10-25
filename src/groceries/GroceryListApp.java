package groceries;

import util.Input;

import java.util.Scanner;

public class GroceryListApp {

        private String name;
        private String quantity;
        private String category;

        // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getQuantity() {
        return quantity;
    }

    // Setter
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    // Getter
    public String getCategory() {
        return category;
    }

    // Setter
    public void setCategory(String category) {
        this.category = category;
    }




    // Constructor

    public GroceryListApp(){}

    public GroceryListApp(String name, String quantity, String category) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }


} // GroceryList
