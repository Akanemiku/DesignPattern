package interpreter.bool;

public abstract class Expression {
    public abstract boolean interpret(Context ctx);
    /**
     * 将表达式转换成字符串
     */
    public abstract String toString();
}
