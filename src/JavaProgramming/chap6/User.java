package chap6;
/*
the runner for this class is PhoneBillCalculatorOOP
 */
public class User {

    int id;
    double baseCost;
    int allottedMinutes;
    int usedMinutes;
    double costPerMinute = 0.25;
    double taxRate = 0.15;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public int getUsedMinutes() {
        return usedMinutes;
    }

    public void setUsedMinutes(int usedMinutes) {
        this.usedMinutes = usedMinutes;
    }

    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    public User(int id, double baseCost, int allottedMinutes, int usedMinutes) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.usedMinutes = usedMinutes;
    }

    public double calculateOverage(){
        int allottedMinutes = getAllottedMinutes();
        int usedMinutes = getUsedMinutes();
        double overage = (usedMinutes - allottedMinutes)*costPerMinute;
        if (overage<=0){
            return 0;
        }else return overage;

    }

    public double calculateTax(){
        double subtotal = getBaseCost() + calculateOverage();
        return subtotal*taxRate;
    }

    public void printBill(){
        System.out.println("User ID: " + id);
        System.out.println("Plan fee: $" + getBaseCost());
        double overage = calculateOverage();
        if (overage <= 0) {
            overage=0;
        }
        System.out.println("Overage Minutes fee: $" + overage);
        double subtotal = getBaseCost()+overage;
        System.out.println("Subtotal: $" + subtotal);
        double tax = calculateTax();
        System.out.println("Tax: $" + tax);
        double total = subtotal + tax;
        System.out.println("Total = $" + total);
    }




}
