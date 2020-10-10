package com.company;

public class Ex3_13Test {
    public static void main(String[]args){
    Ex3_13 employee1 = new Ex3_13("chibundu","Omoji", 45000.00);
    Ex3_13 employee2 = new Ex3_13("chioma","Obasi", 75000.00);

        System.out.println();
        System.out.println("Salaries of Employees in Rising Company Limited");
        System.out.println();
        System.out.println();
        System.out.printf("Full name is: %s %s  %nmonthly salary is: %.2f  %nyearly salary: %.2f  %nyearly salary after raise is: %.2f%n%n",
                employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary(), (employee1.getMonthlySalary()*12),
                (employee1.getMonthlySalary()*12)*4500);

        System.out.printf("Full name is: %s %s  %nmonthly salary is: %.2f  %nyearly salary: %.2f  %nyearly salary after raise is: %.2f",
                employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary(), (employee2.getMonthlySalary()*12),
                (employee2.getMonthlySalary()*12)*7500);
    }
}
