package sef.module3.activity;

public class ArrayStack {

    private Object stack[];
    int count;

    public ArrayStack(int maximum) {
        if (maximum < 1) {
            maximum = 1;
        }
        stack = new Object[maximum];
        count = 0;
    }

    public Object peek() {

        if (getCount() == 0)
            return null;

        int c = getCount() - 1;
        return stack[c];
    }

    public boolean push(Object element) {

        if (count >= getMaximum())
            return false;

        stack[count] = element;
        count++;
        return true;
    }

    public Object pop() {

        if (getCount() == 0)
            return null;

        Object temp = null;
        count--;
        temp = stack[count];

        return temp;
    }

    public int findElement(Object element) {
        int c = getCount() - 1;
        for (int i = 0; i <= c; i++) {
            if (element.equals(stack[i]))
                return (i-c)*-1;
        }
        return -1;
    }

    public int getCount() {
        return count;
    }

    public int getMaximum() {
        return stack.length;
    }
}
	

