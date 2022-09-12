public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int tempSalary;

    Employee(String name, int salary, int workHours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.tempSalary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    void tax() {
        if (salary > 1000) {
            double excise = salary * 0.03;
            tempSalary -= excise;
            System.out.println("Vergi: " + excise);
        }
    }

    void bonus() {
        if (workHours > 40) {
            int novel = workHours - 40;
            int bonus = novel * 30;
            tempSalary += bonus;
            System.out.println("Bonus: " + bonus);
        }
    }

    void raiseSalary() {
        if (2021 - hireYear < 10) {
            double salaryIncrease = salary * 0.05;
            System.out.println("Maaş artışı: " + salaryIncrease);
            salary += salaryIncrease;
        } else if ((2021 - hireYear >= 10) && (2021 - hireYear < 20)) {
            double salaryIncrease = salary * 0.1;
            salary += salaryIncrease;
            System.out.println("Maaş artışı: " + salaryIncrease);
        } else if (2021 - hireYear >= 20) {
            double salaryIncrease = salary * 0.15;
            salary += salaryIncrease;
            System.out.println("Maaş artışı: " + salaryIncrease);
        }
    }

    void tuString() {
        System.out.println("Adı: "+name +"\n"+"Maaşı: "+salary+"\n"+"Çalışma saati: "+workHours+"\n"+"Başlangıç yılı: "+hireYear);
        tax();
        bonus();
        raiseSalary();
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: "+(tempSalary));
        System.out.println("Toplam maaş: "+salary);
    }
}
