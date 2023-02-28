package javaTut;

import java.util.Iterator;
import java.util.LinkedList;

public class Ecommerce {
    LinkedList<Customer> customers;
    LinkedList<Item> allItems;
    public Ecommerce(){
        customers = new LinkedList<>();
        allItems = new LinkedList<>();
    }
    public boolean register(String name, String customerDetails){
        if(name != null && customerDetails !=  null){
            customers.add(new Customer(name, customerDetails));
            return true;
        }
        return false;
    }
    public boolean addItemToCart(Item item,Customer customer){
        if (item != null && customer != null){
            customer.cart.add(item);
            return true;
        }
        return false;
    }
    public boolean addItemToWishList(Item item,Customer customer){
        if (item != null && customer != null){
            customer.wishList.add(item);
            return true;
        }
        return false;
    }
    public double checkout(Customer customer){
        if(customer != null){
            Iterator<Item> it =  customer.cart.iterator();
            double sum=0.0;
            while (it.hasNext()) {
                Item i = it.next();
                sum += i.itemPrice;
            }
            return sum;
        }
        return -1;
    }
    public static void main(String[] args) {
        Ecommerce obj =  new Ecommerce();
        obj. register("aman", "8233598921");
        obj. register("aman singh", "9660781800");
        // System.out.println("in main");
        // Customer c = new Customer("aman", "jagdh");
        System.out.println(obj.customers);
    }

}
class Customer{
    String name;
    String customerDetails;
    LinkedList<Item> wishList ;
    LinkedList<Item> cart ;
    public Customer(String name, String customerDetails) {
        this.name = name;
        this.customerDetails = customerDetails;
        this.wishList = new LinkedList<>();
        this.cart = new LinkedList<>();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name;
    }
    

}
class Item{
    String itemName;
    double itemPrice;
    String sellerDetails;
    public Item(String itemName, double itemPrice, String sellerDetails) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.sellerDetails = sellerDetails;
    }
    
}