package proxy.log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogInvocationHandler implements InvocationHandler {

    private Object object;

    public LogInvocationHandler(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用了invoke");
        System.out.println(proxy.getClass().getName());
        System.out.println(method.getName());
        System.out.println(args[0].getClass().getName());
        System.out.println("----执行前----");
        method.invoke(object,args);
        System.out.println("----执行后----");
        return null;
    }
}
