package interpreter.arithmetic;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<Expression, Integer> map = new HashMap<>();

    //定义变量
    public void add(Expression s, Integer value) {
        map.put(s, value);
    }

    //将变量转换成数字
    public int lookup(Expression s) {
        return map.get(s);
    }
}
