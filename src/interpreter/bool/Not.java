package interpreter.bool;

public class Not extends Expression {
    private Expression exp;
    public Not(Expression exp) {
        this.exp = exp;
    }
    @Override
    public boolean interpret(Context ctx) {
        return !exp.interpret(ctx);
    }

    @Override
    public String toString() {
        return "(NOT " + exp.toString() + ")";
    }
}
