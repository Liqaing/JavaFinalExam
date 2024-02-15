public class Sale {
    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getTotalExpense() {
        double discountService = customer.getServiceMemberDiscount();
        double service = serviceExpense;

        if (discountService > 0.0){

            service = discountService * service;
            service = serviceExpense - service;
        }

        double productDiscount = customer.getProductMemberDiscount();
        double product = productExpense;
        if (productDiscount > 0.0) {
            product = productDiscount * product;

            product = productExpense - product;
        }

        return service + product;
    }

    public void displayInfo() {
        System.out.println("Service expense: " + serviceExpense);
        System.out.println("Discout: " + customer.getServiceMemberDiscount() * 100);
        System.out.println("Product expense: " + productExpense);
        System.out.println("Discout: " + customer.getProductMemberDiscount() * 100);
        System.out.println("Total: " + getTotalExpense());

    }
}
