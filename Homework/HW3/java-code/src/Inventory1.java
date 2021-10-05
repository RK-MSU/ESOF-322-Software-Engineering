// Inventory1.java

/**
 * Inventory1 class
 * 
 * This inventory module extends the Inventory class.
 * 
 * The default sorting method is: Bubble Sort
 */
public class Inventory1 extends Inventory {

    // constructor
    public Inventory1() {
        // call parent constructor
        super(new BubbleSort()); // set default sorting method: BubbleSort
        
    } // END of constructor

} // END of Inventory1 class
