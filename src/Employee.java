public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public CompensationModel getCompensationModel() {
        return compensationModel;
    }

    public void changeCompensationModel(double grossSales,double commissionRate,double baseSalary) {
        if (compensationModel.toString().equalsIgnoreCase("Commission compensation model"))
            this.compensationModel=new BasePlusCommissionCompensationModel(grossSales,commissionRate,baseSalary);

        else if (compensationModel.toString().equalsIgnoreCase("Base plus commission compensation model"))
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
