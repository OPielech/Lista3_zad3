public class CommissionCompensationModel extends CompensationModel {
    private double grossSales;
    private double commissionRate;

    public CommissionCompensationModel(double grossSales, double commissionRate) {
        if (grossSales < 0)
            throw new IllegalArgumentException();
        else
            this.grossSales = grossSales;

        if (commissionRate < 0 || commissionRate > 1)
            throw new IllegalArgumentException();
        else
            this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return getGrossSales() * getCommissionRate();
    }//return earnings

    @Override
    public String toString() {
        return "Commission compensation model";
    }
}//end of class
