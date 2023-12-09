/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConstrctorInjection;

import java.util.Set;

/**
 *
 * @author harshalsMac
 */
public class Customer {
    
    private int custId;
    private String custName;
    private Set<String> itemPurchased;

   

    public Customer() {
    }

    public Customer(int custId, String custName, Set<String> itemPurchased) {
        this.custId = custId;
        this.custName = custName;
        this.itemPurchased = itemPurchased;
    }
     @Override
    public String toString() {
        return "Customer{" + "custId=" + custId + ", custName=" + custName + ", itemPurchased=" + itemPurchased + '}';
    }
    
    
    
    
}
