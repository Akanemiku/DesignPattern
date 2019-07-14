package interpreter.bool;

public class Client {
    public static void main(String[] args){
        Context context = new Context();

        //定义变量
        Variable xVariable = new Variable("X");
        Variable yVariable = new Variable("Y");

        //定义常量
        Constant constant = new Constant(true);

        //设定x与y的值
        context.assign(xVariable, false);
        context.assign(yVariable, true);

        //新建表达式
        Expression expression = new Or(new And(constant, xVariable), new And(yVariable, new Not(xVariable)));

        System.out.println("X = " + xVariable.interpret(context));
        System.out.println("Y = " + yVariable.interpret(context));
        System.out.println(expression.toString() + " = " + expression.interpret(context));
    }
}
