package interpreter.arithmetic;
public class Client {
    public static void main(String[] args){
        Context context = new Context();
        TerminalExpression a = new TerminalExpression("a");
        TerminalExpression b = new TerminalExpression("b");

        context.add(a, 2);
        context.add(b, 1);

        int express = new MinusOperation(a,b).interpreter(context);

        System.out.println("a = "+a.interpreter(context));
        System.out.println("b = "+b.interpreter(context));
        System.out.println(express);
    }
}
