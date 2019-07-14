package proxy.remote.server;

import java.lang.reflect.*;

public class LogInvocationHandler
        implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //for(Object obj:args) {		}
        System.out.println("用户名：" + "" + ",对象名：" + proxy.getClass().getName() +
                ",方法名：" + method.getName()
        );
        //method.invoke(obj, args);
        return null;
    }

}
