package SE421.Lab3inclass;

public class Addition implements Operation {
    private double num1, num2;
    private Operation o1;

    public Addition() {

    }

    public Addition(Operation o1, double num1) {
        this.setFirstNumber(num1);
        this.o1 = o1;
    }

    public Addition(double num1, double num2) {
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
        if (o1 == null) {
            return num1 + num2;            
        } 
        return o1.compute() + num1;
    }
}
