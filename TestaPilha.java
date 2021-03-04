package estruturadados;

public class TestaPilha {
    
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
        stack.add(1);
        stack.add(4);
        stack.add(6);
        stack.add(7);
        System.out.println("O ultimo elemento e: "+stack.lastElement());
        stack.pop();
        stack.printStack();
        System.out.println("O ultimo elemento e: "+stack.lastElement());

    }
    
}
