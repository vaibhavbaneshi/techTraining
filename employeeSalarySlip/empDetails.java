package employeeSalarySlip;

public class empDetails {
    private int id;
    private double salary;
    private String name;
    private String email;
    private final double hra;
    private final double ma;
    private final double da;
    private final double tds;
    private final double pf;
    private final double ta;
    private final String company;

    public empDetails() {
        this.company = "DIT";
        this.hra = 0.30;
        this.ta = 0.15;
        this.da = 0.40;
        this.ma = 0.10;
        this.pf = 0.05;
        this.tds = 0.10;
    }

    public empDetails(int id,String name,double salary,String email) {
        this();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
    }   

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return email;
    }

    public double getHra() {
        return this.salary * this.hra;
    }

    public double getMa() {
        return this.salary * this.ma;
    }

    public double getDa() {
        return this.salary * this.da;
    }

    public double getTds() {
        return this.salary * this.tds;
    }

    public double getPf() {
        return this.salary * this.pf;
    }

    public double getTa() {
        return this.salary * this.ta;
    }

    public String getCompany() {
        return company;
    }

    public double calcSalary() {
        double earning = this.salary + getTa() + getDa() + getMa() + getHra();  
        double deduction = getTds() + getPf();
        double payableSalary = earning - deduction;
        return payableSalary;
    }

    @Override
    public String toString() {
        commonUtils obj = new commonUtils("en","US");
        this.name = obj.getProperName(name);
        return "Date : " + obj.formatDate() +  
        "\nName : " + this.name + 
        "\nSalary : " + calcSalary() + 
        "\nEmail : " + this.email;
    }
}

