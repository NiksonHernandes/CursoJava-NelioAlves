package entities;

public class OutsourcedEmployes extends Employee{
    private Double additionalChange;

    public OutsourcedEmployes() {}

    public OutsourcedEmployes(String name, Integer hours, Double valuePerHour, Double additionalChange) {
        super(name, hours, valuePerHour);
        this.additionalChange = additionalChange;
    }

    @Override
    public final Double payment() {
        Double paymentEmployee = super.payment();
        return paymentEmployee + (additionalChange * 1.1);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Double getAdditionalChange() {
        return additionalChange;
    }

    public void setAdditionalChange(Double additionalChange) {
        this.additionalChange = additionalChange;
    }
}
