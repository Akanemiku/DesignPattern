package interpreter.bool;

public class Or extends Expression {
    private Expression left, right;
    public Or(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public boolean interpret(Context ctx) {
        return left.interpret(ctx) || right.interpret(ctx);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " OR " + right.toString() + ")";
    }
}
