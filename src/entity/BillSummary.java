package entity;

public final class BillSummary {
    private final double totalAmount;
    private final double tax;
    private final double finalAmount;

    public BillSummary(
            double totalAmount, double tax, double finalAmount
    )
    {
        this.totalAmount = totalAmount;
        this.tax = tax;
        this.finalAmount = finalAmount;
    }

    public double getFinalAmount() {
        return finalAmount;
    }

}
