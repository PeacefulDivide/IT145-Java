public class ItemToPurchase {
   //Private fields - itemName, itemPrice, and itemQuanity
   private String itemName;
   private int itemPrice;
   private int itemQuantity;
   
   /*Default Constructor
    itemName - Initialized to "none"
    itemPrice - Initialized to 0
    itemQuantity - Initialized ito 0
   */
   public ItemToPurchase() {
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
   }
   
   //public member methods (mutators & accessors)
   
   public String getName() {
      return itemName;
   }
   
   public void setName(String itemName) {
      this.itemName = itemName;
   }
   
   public int getPrice() {
      return itemPrice;
   }
   
   public void setPrice(int price) {
      this.itemPrice = price;
   }
   
   public int getQuantity() {
      return itemQuantity;
   }
   
   public void setQuantity(int quantity) {
      this.itemQuantity = quantity;
   }
   
   
   
   
   //setName() & getName() 
   //setPrice() & getPrice() 
   //setQuantity() & getQuantity() 
   
   //print item to purchase
   
   public void printItemPurchase() {
      System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  
                         " = $" + (itemPrice * itemQuantity));
   }
}
