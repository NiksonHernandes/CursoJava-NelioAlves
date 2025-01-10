package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdfMoment = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private Client client;
    List<OrderItem> orderItemList = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item) {
        orderItemList.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItemList.remove(item);
    }

    public Double total() {
        Double sum = 0.0;
        for (OrderItem o : orderItemList) {
            sum += o.subTotal();
        }

        return sum;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sc = new StringBuilder();
        sc.append("Order moment: ");
        sc.append(sdfMoment.format(moment)).append("\n");
        sc.append("Order status: ");
        sc.append(status);
        sc.append("\nClient: ");
        sc.append(client.getName() + "(" + sdf.format(client.getBirthDate()) + ") - " + client.getEmail());
        sc.append("\nORDER ITEMS:\n");
        for (OrderItem o : orderItemList) {
            sc.append(o.getProduct().getName() + ", $" + o.getProduct().getPrice() + ", Quantity: "
                    + o.getQuantity() + ", Subtotal: $" + o.subTotal() + "\n");
        }
        sc.append("\nTotal price: " + total());

        return sc.toString();
    }
}
