// Client.java

import java.util.Scanner;

/**
 * Client class
 * 
 * - Main driver class for Homework 3
 *   - (i.e. has public static void main(String[] args))
 *   
 */
public class Client {

    // main method
    public static void main(String[] args) {

        // initialize local Inventory variable
        InventoryModule inventory = null;
        // initialize scanner, to read in user input from console
        Scanner console = new Scanner(System.in);
        // variable to store user input
        String user_selection = null;
        int user_int_selection = 0;

        /*
         * The following variables are used to by the application. Either for output to
         * the console or to maintain the running state
         */

        InventoryModule[] inventory_arr = new InventoryModule[3];
        int inv_index = 0;
        // string "constant", used for output to the user
        String dv = "----------------------------------------";
        // continue running application loop with true
        Boolean running = true;

        // output to user (via console)
        System.out.printf("%s\n%s\n%s\n", dv, "ESOF-322: Homework 3", dv);

        do {
            
            // Step 1: Select an Inventory Module
            // ------------------------------------------------------
            // - prompt the user to select an Inventory module.
            // - create the selected Inventory module and assign it
            // to the local variable 'inventory'.
            //

            // output to user
            System.out.printf("\n%s\n%s\n", "Step 1: Select an Inventory Module", dv);
            System.out.printf("%d - %s\n%d - %s\n%d - %s\n", 1, "Inventory1", 2, "Inventory2", 3, "Inventory3");

            // get user input from console (Scanner)
            System.out.print("('c' to exit) > ");
            user_selection = console.nextLine();

            // checked if user wants to exit
            if (user_selection.charAt(0) == 'c') { // user wants to exit
                running = false; // set running state to false
                continue;
            }

            try {
                user_int_selection = Integer.parseInt(user_selection);
            } catch (Exception e) {
                System.out.printf("%s: %s\n", "User Input Error", e.getMessage());
                continue;
            }

            inv_index = user_int_selection - 1;

            if (inventory_arr[inv_index] == null) {

                System.out.printf("\n%s\n%s\n", "New Inventory Module Created", dv);
                switch (user_int_selection) {
                    case 1:
                        inventory = new Inventory1();
                        break;
                    case 2:
                        inventory = new Inventory2();
                        break;
                    case 3:
                        inventory = new Inventory3();
                        break;
                    default:
                        System.out.println("\nInvalid input: " + user_selection);
                        continue;
                }
                inventory_arr[inv_index] = inventory;
            } else {
                inventory = inventory_arr[inv_index];
            }

            // Step 2: Perform default sorting method
            // ------------------------------------------------------
            //
            System.out.printf("\n%s\n%s\n", "Step 2: Perform (default) Sorting Method", dv);
            inventory.preformSort();

            // Step 3: Request User Selection
            // ------------------------------------------------------
            // Get a new sorting method from the user to dynamically
            // change the inventory's sorting behavior
            //
            
            System.out.printf("\n%s\n%s\n", "Step 3: Request User Selection (Sorting Method)", dv);
            System.out.printf("%d - %s\n%d - %s\n%d - %s\n", 1, "BubbleSort", 2, "MergeSort", 3, "QuickSort");

            // get user input from console (Scanner)
            System.out.print("('c' to exit) > ");
            user_selection = console.nextLine();

            // checked if user wants to exit
            if (user_selection.charAt(0) == 'c') { // user wants to exit
                running = false; // set running state to false
                continue;
            }

            // Step 4: Dynamically Change Sorting Method
            // ------------------------------------------------------
            // Set the inventory's sorting method dynamically
            //
            
            System.out.printf("\n%s\n%s", "Step 4: Dynamically Change Sorting Method", dv);
            ISortingMethod new_sorting_method;
            switch (user_selection) {
                case "1": // Bubble Sort
                    new_sorting_method = new BubbleSort();
                    break;
                case "2": // Merge Sort
                    new_sorting_method = new MergeSort();
                    break;
                case "3": // Quick Sort
                    new_sorting_method = new QuickSort();
                    break;
                default: // Invalid selection from user input
                    System.out.println("\nInvalid input: " + user_selection);
                    continue;
            }
            
            inventory.setSortMethod(new_sorting_method); // Change dynamically to BubbleSort

            // Step 5: Perform Sort
            // ------------------------------------------------------
            // Invoke the inventories sorting method behavior
            //
            
            System.out.printf("\n%s\n%s\n", "Step 5: Perform Sorting Method", dv);
            inventory.preformSort();

        } while (running); // END of application's loop
        
        console.close(); // Close the console (Scanner)
        
    } // END of Client::main method

} // END of Client class

