class Item {

    int itemCode;
    String itemName;
    double price;

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per item: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {

        Item item = new Item();

        item.itemCode = 101;
        item.itemName = "Notebook";
        item.price = 50;

        item.displayDetails();

        int quantity = 5;
        double totalCost = item.calculateTotalCost(quantity);

        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
}