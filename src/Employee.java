public class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    CompensationModel compensationModel;

    public Employee(String firstName, String lastName, String socialSecurityNumber, CompensationModel compensationModel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.compensationModel = compensationModel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public CompensationModel getCompensationModel() {
        return compensationModel;
    }

    public void changeCompensationModel(double grossSales,double commissionRate,double baseSalary) {
        if(compensationModel instanceof CommissionCompensationModel)
            this.compensationModel=new BasePlusCommissionCompensationModel(grossSales,commissionRate,baseSalary);

        else if (compensationModel instanceof BasePlusCommissionCompensationModel)
            this.compensationModel=new CommissionCompensationModel(grossSales,commissionRate);
    }//end of setCompensationModel

    public double earnings(){
        return compensationModel.earnings();
    }//end of earnings

    @Override
    public String toString() {
        return "Name: "+getFirstName()
                +"\nSurname: "+getLastName()
                +"\nSocial security Number: "+getSocialSecurityNumber()
                +"\nCompensation model: "+getCompensationModel();
    }
}//end of class
