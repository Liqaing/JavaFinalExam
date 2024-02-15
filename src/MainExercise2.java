public class MainExercise2 {
    public static void main(String[] args) {

        Customer c1 = new Customer("Sovisal");
        Customer c2 = new Customer("Sokchea");
        Customer c3 = new Customer("Sokpov");
        Customer c4 = new Customer("Vitou");

        c2.setCustomerType("Premium");
        c3.setCustomerType("Gold");
        c4.setCustomerType("Silver");

        Sale sale_c1 = new Sale(c1,"2024-02-11");
        Sale sale_c2 = new Sale(c2,"2024-02-12");
        Sale sale_c3 = new Sale(c3,"2024-02-13");
        Sale sale_c4 = new Sale(c4,"2024-02-14");

        sale_c1.setProductExpense(100);
        sale_c1.setServiceExpense(100);
        sale_c1.displayInfo();

        sale_c2.setProductExpense(100);
        sale_c2.setServiceExpense(100);
        sale_c2.displayInfo();

        sale_c3.setProductExpense(100);
        sale_c3.setServiceExpense(100);
        sale_c3.displayInfo();

        sale_c4.setProductExpense(100);
        sale_c4.setServiceExpense(100);
        sale_c4.displayInfo();
    }
}
