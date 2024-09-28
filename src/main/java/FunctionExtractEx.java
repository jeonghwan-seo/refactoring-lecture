
public class FunctionExtractEx {

    public void printInvoice(Invoice invoice) {
        double totalAmount = 0;

        // Print header
        System.out.println("***** Invoice *****");
        System.out.println("날짜: " + invoice.getDate());
        System.out.println("고객: " + invoice.getCustomer().getName());

        // Print line items
        for (Item item : invoice.getItems()) {
            double amount = item.getPrice() * item.getQuantity();
            System.out.println(item.getName() + ": " + amount);
            totalAmount += amount;
        }

        // Print footer
        System.out.println("총액: " + totalAmount);
    }

}
