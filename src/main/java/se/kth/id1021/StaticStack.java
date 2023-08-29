package se.kth.id1021;

public class StaticStack extends Stack {

    private final int[] staticStack = new int[10];
    private int staticStackPointer = 0;
    
    @Override
    public void push(int value) {
        if(staticStackPointer == 10) {
            throw new StackOverflowError("Full stack, cannot push");
        }
        staticStack[staticStackPointer] = value;
        staticStackPointer++;
    }
    
    @Override
    public int pop() {
        if(staticStack.length == 0) {
            return 0;
        }
        int popNumber = staticStack[staticStackPointer];
        staticStack[staticStackPointer] = 0;
        staticStackPointer--;
        return popNumber;
    }

}
