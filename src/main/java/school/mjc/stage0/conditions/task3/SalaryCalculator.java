package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public static void calculateSalary(int salary) {
        if (salary > 0){
            if (salary <= 10000){
                System.out.println(salary - salary * 0.15);
            }
            if (salary > 10000 && salary <= 20000){
                System.out.println(salary - salary * 0.18);
            }
            if (salary > 20000){
                System.out.println(salary - salary * 0.2);
            }
        } else {
            System.out.println("wrong input!");
        }
    }

    public static void main(String[] args){
        calculateSalary(20000);
    }
}
