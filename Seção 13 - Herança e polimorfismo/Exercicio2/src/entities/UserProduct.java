package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserProduct extends Product{

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    public UserProduct() {}

    public UserProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return getName() + " (Used) " + String.format("%.2f", getPrice()) + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
