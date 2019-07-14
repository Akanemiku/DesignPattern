package interpreter.bool;

public class Variable extends Expression {
    private String name;
    public Variable(String name) {
        this.name = name;
    }
    @Override
    public boolean interpret(Context ctx) {
        return ctx.lookup(this);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
