// Inventory2.java

/**
 * Inventory2 class
 * 
 * This inventory module extends the Inventory class.
 * 
 * The default sorting method is: Merge Sort
 */
public class Inventory2 extends Inventory {

    // constructor
    public Inventory2() {
        // call parent constructor
        super(new MergeSort()); // set default sorting method: MergeSort
    
    } // END of constructor

} // END of Inventory2 class
