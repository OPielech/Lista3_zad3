public class Test {

    public static void main(String[] args) {
        Employee e1 = new Employee("Jan", "Kowalski"
                , "1234", new CommissionCompensationModel(10000, 0.5));

        Employee e2 = new Employee("Adam", "Nowak", "4321"
                , new BasePlusCommissionCompensationModel(10000, 0.5, 1000));

        System.out.println(e1.toString());
        System.out.println("Earnings: " + e1.earnings());

        System.out.println();
        System.out.println(e2.toString());
        System.out.println("Earnings: " + e2.earnings());

        e1.setToBasePlusCommissionCompensationModel(10000,0.5,1000);
        e2.setToCommissionCompensationModel(10000,0.5);

        System.out.println();
        System.out.println(e1.toString());
        System.out.println("Earnings: " + e1.earnings());

        System.out.println();
        System.out.println(e2.toString());
        System.out.println("Earnings: " + e2.earnings());
    }//end of main
}//end of class
