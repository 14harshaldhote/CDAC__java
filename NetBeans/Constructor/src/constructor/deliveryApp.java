package constructor;
import java.util.Scanner;

class Customer {
    private String name;
    private String pickupAddress;
    private String deliveryAddress;
    private String phoneNumber;

    public Customer(String name, String pickupAddress, String deliveryAddress, String phoneNumber) {
        this.name = name;
        this.pickupAddress = pickupAddress;
        this.deliveryAddress = deliveryAddress;
        this.phoneNumber = phoneNumber;
    }
    public Customer(){
    }

    public String getName() {
        return name;
    }

    public String getPickupAddress() {
        return pickupAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

class TiffinOrder {
    private Customer customer;
    private String item;
    private boolean isDelivered;

    public TiffinOrder(Customer customer, String item) {
        this.customer = customer;
        this.item = item;
        this.isDelivered = false;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getItem() {
        return item;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void markDelivered() {
        isDelivered = true;
    }
}

class DeliveryBoy {
    public void deliverTiffin(TiffinOrder tiffinOrder) {
        tiffinOrder.markDelivered();
        System.out.println("Tiffin order picked up from " + tiffinOrder.getCustomer().getPickupAddress() +
                " and delivered to " + tiffinOrder.getCustomer().getDeliveryAddress());
    }
}

public class deliveryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeliveryBoy deliveryBoy = new DeliveryBoy();

        while (true) {
            System.out.println("\nTiffin Delivery App Menu:");
            System.out.println("1. Place Tiffin Order");
            System.out.println("2. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String userName = scanner.nextLine();

                    System.out.print("Enter pickup address: ");
                    String pickupAddress = scanner.nextLine();

                    System.out.print("Enter delivery address: ");
                    String deliveryAddress = scanner.nextLine();

                    System.out.print("Enter your phone number: ");
                    String userPhoneNumber = scanner.nextLine();

                    System.out.print("Enter tiffin item: ");
                    String tiffinItem = scanner.nextLine();

                    Customer customer = new Customer(userName, pickupAddress, deliveryAddress, userPhoneNumber);
                    TiffinOrder tiffinOrder = new TiffinOrder(customer, tiffinItem);

                    deliveryBoy.deliverTiffin(tiffinOrder);
                    break;
                case 2:
                    System.out.println("Exiting the Tiffin Delivery App.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
