package interpreter.arithmetic;

public class MinusOperation implements Expression{
    private Expression left,right;

    public MinusOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Context context) {
        return left.interpreter(context)-right.interpreter(context);
    }
}