// ISortingMethod.java

/**
 * ISortingMethod (Interface)
 * 
 * This is the "behavior" interface for the sorting_method
 * 
 * Each of the unique sorting method type
 * must implement this interface, allowing the
 * Inventory Modules to sort a sorting behavior
 * as a composite value.
 * 
 * Each child class must provide:
 * - method "sort()"
 *
 */
public interface ISortingMethod {
    
    // all Sorting classes must implement their own sort function
    public void sort();
    
} // END of ISortingMethod class
