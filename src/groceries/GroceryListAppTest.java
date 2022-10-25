package groceries;

import util.Input;

import java.util.*;

public class GroceryListAppTest {

    // This generates Categories and creates a array of categories
    public static ArrayList<String> generateCategories(){
        ArrayList<String> categories = new ArrayList<>(List.of(
                "Dairy",
                "Meat",
                "Fish",
                "Fruit",
                "Vegetable",
                "Drink",
                "Snack",
                "Dessert",
                "Grain",
                "Canned foods",
                "Frozen foods"
        ));
        Collections.sort(categories); // This sorts the array
        return categories;
    }

    // This loops through the array
    public static void enterItem(Input input, ArrayList<String> categories, HashMap<String, ArrayList<GroceryListApp>> groceryList){
        System.out.println(" List of categories: ");
        for (int i = 0; i < categories.size(); i++){
            if (i == categories.size()-1){ // This put or on the last object in the array
                System.out.printf("or %s%n", categories.get(i));
            } else {
                System.out.printf("%s, ", categories.get(i));
            }
        } // end loop over categories list
        // If you put yes then it going to enter a category
        String category = input.getString("Enter a category:");
        String name = input.getString("Enter the name of the item:");
        String quantity = input.getString("Enter the quantity: ");

        System.out.printf("You entered: category: %s, item: %s, quantity: %s%n", category, name, quantity);
        boolean entryWasCorrect = input.yesNo(" Is this correct? yes/no");
        if (entryWasCorrect){
            GroceryListApp groceryItem = new GroceryListApp(name, quantity, category);
            if (!groceryList.containsKey(category)){
                groceryList.put(category, new ArrayList<GroceryListApp>());
                groceryList.get(category).add(groceryItem);
            } else {
                groceryList.get(category).add(groceryItem);
            }
        } else {
            enterItem(input,categories, groceryList);
        }

    } // End enterItem method

    // We created a method, so it can generate the grocery list
    public static void generateGroceryList(Input input, ArrayList<String> categories,        HashMap<String, ArrayList<GroceryListApp>> groceryList){


        // If user inputs yes to create a list then it prompts
        boolean userWantsToEnterNewItem = input.yesNo("Would you like to enter a new item? (yes/no "); // We created a new var with yes no method

        if (userWantsToEnterNewItem){
            enterItem(input, categories, groceryList);
            generateGroceryList(input, categories, groceryList);
        } else {
            System.out.println("Here is you list: ");
            Map<String, ArrayList<GroceryListApp>> groceryListWithCategoriesAlphabetized = new TreeMap<>(groceryList);
            groceryListWithCategoriesAlphabetized.forEach((category, arrayListOfItems) ->{
                arrayListOfItems.sort(Comparator.comparing(GroceryListApp::getName));
                System.out.printf("Category: %s%n", category);
                for (GroceryListApp groceryItem : arrayListOfItems){
                    System.out.printf("%s, %s%n", groceryItem.getName(), groceryItem.getQuantity());
                }
            });

        } // end if (userWantsToEnterNewItem){} else{}
    } // end generate grocery list method



    public static void main(String[] args) {
        Input input = new Input(); // We link the input class

        boolean userChoice = input.yesNo("Would you like to create a grocery list (yes/no)"); // We are using the yesNo method from the input class we refactor it a little
        ArrayList<String> categories = generateCategories(); // This calls the array list

        //Created a new hashmap
        HashMap<String, ArrayList<GroceryListApp>> groceryList = new HashMap<>();

        if (userChoice) {
            generateGroceryList(input, categories, groceryList); // We use the method to generate the list


        } // end if(userChoice)


    } // end of main
} // end of grocery list
