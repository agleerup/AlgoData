package se.kth.id1021;

public class DynamicStack extends Stack {

    private int[] dynamicStack = new int[8];
    private int dynamicStackPointer = 0;

    @Override
    public void push(int value) {
        if(dynamicStackPointer == 8) {
            increaseDynamicStack();
        }
        dynamicStack[dynamicStackPointer] = value;
        dynamicStackPointer++;
    }

    private void increaseDynamicStack() {
        int[] newDynamicStack = new int[17];
        for(int i = 0; i < dynamicStackPointer; i++) {
            newDynamicStack[i] = dynamicStack[i];
        }
        dynamicStack = newDynamicStack;
    }

    @Override
    public int pop() {
        if(dynamicStack.length == 0) {
            return 0;
        }
        int popNumber = dynamicStack[dynamicStackPointer];
        dynamicStack[dynamicStackPointer] = 0;
        dynamicStackPointer--;
        return popNumber;
    }
}
