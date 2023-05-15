class InvoiceDetail<N extends Number> {
    private String invoiceName;
    private N amount;
    private N discount;

    public InvoiceDetail(String invoiceName, N amount, N discount) {
        this.invoiceName = invoiceName;
        this.amount = amount;
        this.discount = discount;
    }

    // getters
    public String getInvoiceName() {
        return invoiceName;
    }

    public N getAmount() {
        return amount;
    }

    public N getDiscount() {
        return discount;
    }

    // setters
    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public void setAmount(N amount) {
        this.amount = amount;
    }

    public void setDiscount(N discount) {
        this.discount = discount;
    }
}
public class Main {
    public static void main(String[] args) {
        // create an instance of InvoiceDetail with type parameter Double
        InvoiceDetail<Double> invoice = new InvoiceDetail<>("Invoice 001", 1000.0, 100.0);

        // call the getters to retrieve the invoice details
        System.out.println("Invoice name: " + invoice.getInvoiceName());
        System.out.println("Amount: " + invoice.getAmount());
        System.out.println("Discount: " + invoice.getDiscount());

        // call the setters to update the invoice details
        invoice.setAmount(900.0);
        invoice.setDiscount(90.0);

        // call the getters again to verify the updated invoice details
        System.out.println("Updated amount: " + invoice.getAmount());
        System.out.println("Updated discount: " + invoice.getDiscount());
    }
}
