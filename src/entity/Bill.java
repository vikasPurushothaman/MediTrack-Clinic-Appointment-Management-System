package entity;

import constants.Constants;
import strategy.Payable;

public class Bill implements Payable {
    private double baseAmount;
    public  Bill(
            double baseAmount
    ) {
        this.baseAmount = baseAmount;
    }

    @Override
    public double calculateBill() {
        double tax = baseAmount * Constants.TAX_RATE;
        return baseAmount + tax;
    }


}
