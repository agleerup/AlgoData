package se.kth.id1021;

public class Main {

    public static void main(String[] args) {

        Item[] expression = {
                Item.Value(10),
                Item.Value(2),
                Item.Value(5),
                Item.Mul(),
                Item.Add(),
        };

        Calculator calculator = new Calculator(expression);

        int result = calculator.run();

        System.out.println("Calculator: result = " + result);
    }

}