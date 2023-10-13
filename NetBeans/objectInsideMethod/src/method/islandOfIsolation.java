/*
class islandOfIsolation {
    private islandOfIsolation connectedIsland; // Reference to another object of the same type

    public void setConnectedIsland(islandOfIsolation island) {
        connectedIsland = island;
    }

    public static void main(String[] args) {
        islandOfIsolation island1 = new islandOfIsolation();
        islandOfIsolation island2 = new islandOfIsolation();

        // Creating a circular reference, forming an island of isolation
        island1.setConnectedIsland(island2);
        island2.setConnectedIsland(island1);

        // Both island1 and island2 are now isolated
        island1 = null;
        island2 = null;

        // Attempt to trigger garbage collection (may not guarantee immediate collection)
        System.gc();
    }
}
 */
package method;


class islandOfIsolation {
   islandOfIsolation i ; // Reference 
   
   protected void finalize(){
       System.out.println("Object is destroyed ");
   }
    
    public static void main(String[] args) {
        islandOfIsolation t1 = new islandOfIsolation();
        islandOfIsolation t2 = new islandOfIsolation();

        t1.i=t2;
        t2.i=t1;
        
        t1=null;
        t2=null;
       
        System.gc();
    }
}
