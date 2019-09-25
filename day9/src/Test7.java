public class Test7 {
    public static void main(String[] args) {
        Manager m = new Manager( "张小强", 9000);
        Coder c = new Coder( "李小亮", 5000);
        Company company = new Company(1000000);
        company.paySalary(m);
        company.paySalary(c);
    }
}

abstract class Emp {
    private String name;
    private double salary;

    public Emp() {
    }

    public Emp(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Emp {
    public Manager() {
    }

    public Manager(String name, double salary) {
        super(name, salary);
    }
}

class Coder extends Emp {
    public Coder() {
    }

    public Coder(String name, double salary) {
        super(name, salary);
    }
}

interface Money {
    public abstract void paySalary(Emp emp);
}

class Company implements Money {
    private double totalMoney;

    public Company() {
    }

    public Company(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public void paySalary(Emp emp) {
        totalMoney -= emp.getSalary();
        System.out.println("给" + emp.getName() + "发工资 " + emp.getSalary() + " 元,公司剩余: " + totalMoney + " 元");
    }
}