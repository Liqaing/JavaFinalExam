import java.util.HashMap;
import java.util.Map;

public class Customer implements DiscountRate {
    public String customerName;
    public String customerType;

    public Customer(String customerName, String customerType) {
        this.customerName = customerName;
        this.customerType = customerType;
    }

    public Customer(String customerName) {
        this.customerName = customerName;
        this.customerType = "Normal";
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerType() {
        return customerType;
    }

    public double getServiceMemberDiscount(){
        HashMap<String, Double> discounts = new HashMap(Map.of(
                "Premium", 0.2,
                "Gold", 0.15,
                "Silver", 0.1,
                "Normal", 0.0

        ));
        return discounts.get(this.customerType);
    };

    public double getProductMemberDiscount(){
        HashMap<String, Double> discounts = new HashMap(Map.of(
                "Premium", 0.1,
                "Gold", 0.1,
                "Silver", 0.1,
                "Normal", 0.0

        ));
        return discounts.get(this.customerType);
    };
}
