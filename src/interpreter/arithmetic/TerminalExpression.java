package interpreter.arithmetic;

public class TerminalExpression implements Expression {
    private String variable;

    public TerminalExpression(String variable) {
        this.variable = variable;
    }

    @Override
    public int interpreter(Context context) {
        return context.lookup(this);
    }
}
