package Java101.Classes.SalaryCalculator;

import java.util.Date;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hiredYear;

    public Employee(String name, double salary, int workHours, int hiredYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hiredYear = hiredYear;
    }

    public double calculateTax(){
        if (salary > 17000) {
            return salary * 0.03;
        } else{
            return 0.0;
        }
    }

    public double calculateBonus(){
        int limit = 40;
        double extraPay = 30.0;

        if (workHours > limit ) {
            return extraPay * (workHours - limit);
        }

        return 0.0;
    }

    public double raiseSalary(){
        int now = 2024;
        if (now - hiredYear < 10) {
            return salary * 0.05;
        } else if((now - hiredYear) >= 10 && (now - hiredYear) <= 20){
            return salary * 0.1;
        } else{
            return salary * 0.15;
        }
    }

    @Override
    public String toString() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
        System.out.println("Employee Work Hours : " + workHours);
        System.out.println("Employee Hired Year : " + hiredYear);
        System.out.println("Tax paid by the employee : " + calculateTax());
        System.out.println("Bonus to be given to the employee : " + calculateTax());
        System.out.println("Salary increase for the employee : " + raiseSalary());
        System.out.println("Total Salary : " + (salary - calculateTax() + calculateBonus() + raiseSalary()));
        return super.toString();
    }
}
