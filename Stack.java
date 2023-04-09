public class Stack {
    private final int maxSize;
    private final Object[] stackArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new Object[maxSize];
        this.top = -1;
    }

    public void push(Object item) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full!");
            return;
        }
        top++;
        stackArray[top] = item;
    }

    public Object pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return null;
        }
        Object item = stackArray[top];
        top--;
        return item;
    }

    public Object peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return null;
        }
        return stackArray[top];
    }

    public boolean empty() {
        return top == -1;
    }

    public int search(Object item) {
        for (int i = top; i >= 0; i--) {
            if (stackArray[i].equals(item)) {
                return top - i + 1;
            }
        }
        return -1;
    }
}

class ExampleStack {
    public static void main(String[] args) {
        Stack st = new Stack(10);

        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next : " + st.peek());
        st.push("raya");
        System.out.println(st.pop());
        st.push("!");

        int count = st.search("Aku");
        while (count != -1 && count > 1) {
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.empty());
    }
}
