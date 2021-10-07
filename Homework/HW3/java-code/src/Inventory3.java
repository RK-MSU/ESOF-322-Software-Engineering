// Inventory3.java

/**
 * Inventory3 class
 * 
 * This inventory module extends the InventoryModule class.
 * 
 * The default sorting method is: Quick Sort
 */
public class Inventory3 extends InventoryModule {

    public Inventory3() {
     // call parent constructor
        super(new QuickSort()); // set default sorting method: QuickSort
    
    } // END of constructor

} // END of Inventory3 class
