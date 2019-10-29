public class BasePlusCommissionCompensationModel extends CompensationModel {
    private double grossSales;
    private double commissionRate;
    private double baseSalary;

    public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary) {
        if(grossSales<0)
            throw new IllegalArgumentException();
        else
            this.grossSales = grossSales;

        if (commissionRate<0||commissionRate>1)
            throw new IllegalArgumentException();
        else
            this.commissionRate = commissionRate;

        if(baseSalary<0)
            throw new IllegalArgumentException();
        else
            this.baseSalary = baseSalary;
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

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary()+getGrossSales()*getCommissionRate();
    }//end of earnings

    @Override
    public String toString() {
        return "Base plus commission compensation model";
    }
}//end of class
