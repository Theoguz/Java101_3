public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;


    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        }
        return 0;
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        if ((2021 - this.hireYear) == 10) {
            return this.salary * 0.05;
        } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            return this.salary * 0.10;

        } else if (2021 - this.hireYear > 19) {
            return this.salary * 0.15;
        }
        return 0;
    }

    public String toString() {
        double totalSalary = this.salary + this.bonus() - this.tax() + this.raiseSalary();
        return "Adı : " + this.name + "\n" +
                "Maaşı : " + this.salary + "\n" +
                "Çalışma Saati : " + this.workHours + "\n" +
                "Başlangıç Yılı : " + this.hireYear + "\n" +
                "Vergi : " + this.tax() + "\n" +
                "Bonus : " + this.bonus() + "\n" +
                "Maaş Artışı : " + this.raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + totalSalary + "\n" +
                "Toplam Maaş : " + (this.salary + this.raiseSalary())    ;
    }
}
