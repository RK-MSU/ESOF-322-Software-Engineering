// Inventory.java

/**
 * Inventory class (Abstract)
 * 
 * The individual Inventory Modules (Inventory1, Inventory2, and Inventory3)
 * extend this class to inherit common functionality.
 * 
 * Child classes define the "default" sorting method, or behavior,
 * in their constructors, which are passed to the parent constructor
 * via super(ISortingMethod)
 * 
 * The property 'sorting_method' or type ISortingMethod allows for
 * composition of a unique sorting method, and allows us to change
 * the behavior at runtime.
 *
 */
abstract public class Inventory {

    // The interface used by each unique sorting method type.
    public ISortingMethod sorting_method;
    
    
    // constructor
    public Inventory(ISortingMethod sort_method) {
        // set the default sorting method
        sorting_method = sort_method;
        // output statement to user
        System.out.println("Inventory Module: " + 
                this.toString().split("@")[0] +
                " \nDefault sorting method: " +
                sorting_method.toString().split("@")[0]);
    
    } // END of constructor
    
    
    /*
     * Sort()
     * 
     * Invokes the sorting method behavior
     * 
     */
    public void sort() {
        // output statement to user
        System.out.println("--> "+this.toString().split("@")[0] + "::sort()\nThe sorting method is: " + sorting_method.toString().split("@")[0]);
        sorting_method.sort();
    
    } // END of sort()

    
    /*
     * setSortMethod()
     * 
     * changes the default sorting method (dynamically) to the new one chosen by the user
     * 
     */
    public void setSortMethod(ISortingMethod new_sort_method) {
        // dynamically set the sorting method (behavior)
        sorting_method = new_sort_method;
        // cleanly prints out the new default sorting method to the user
        System.out.println("\n--> "+this.toString().split("@")[0]+"::setSortMethod(ISortingMethod method)\nDynamically set sorting method to: " + sorting_method.toString().split("@")[0]);
    
    } // END of setSortMethod()

} // END of Inventory class
