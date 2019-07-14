package interpreter.arithmetic;

public class PlusOperation implements Expression {

    private Expression left,right;

    public PlusOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Context context) {
        return left.interpreter(context)+right.interpreter(context);
    }
}