package SE421.Lab3inclass;

public class Subtraction implements Operation {
    private double num1, num2;
    public Subtraction() {

    }

    public Subtraction(double num1, double num2) {
        this.setFirstNumber(num1); // help caller avoid calling set numbers
        this.setSecondNumber(num2);
    }

    public double getFirstNumber() {
        return num1;
    }

    public double getSecondNumber() {
        return num2;
    }
    
    public void setFirstNumber(double num1) {
        this.num1 = num1;
    }

    public void setSecondNumber(double num2) {
        this.num2 = num2;
    }
    public double compute() {
        return num1 - num2;
    }
}
