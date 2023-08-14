package E5_22;

public class Paycheck {
    private String employeeName;
    private double hourlyWage;
    private double hoursWorked;

    public Paycheck(String name, double wage, double hours){
        employeeName = name;
        hoursWorked = hours;
        hourlyWage = wage;
    }

    public void printPaycheck(){
        double regularlyPay;
        double overTimePay = 0.0;

        if(hoursWorked <= 40){
            regularlyPay = hoursWorked * hourlyWage;
        }
        else{
            regularlyPay = 40 * hourlyWage;
            overTimePay = (hoursWorked - 40) * hourlyWage * 1.5;
        }

        double totalPay = regularlyPay + overTimePay;

        System.out.println("Paycheck for "+ employeeName);
        System.out.println("Regular hours : "+ hoursWorked + " hours");
        if(hoursWorked > 40){
            System.out.println("Overtime hours : " + (hoursWorked - 40)+ " hours");
        }
        System.out.println("Regular pay : " + regularlyPay);
        System.out.println("Overtime pay : " + overTimePay);
        System.out.println("Total pay : " + totalPay);
    }
}
