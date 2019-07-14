package proxy.remote.server;

import java.io.InputStream;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ObjectPool {
    private static ObjectPool objectPool = new ObjectPool();

    public static ObjectPool getInstance() {
        return objectPool;
    }

    private ObjectPool() {

    }

    private static Map<String, Object> objects = new HashMap<>();
    private static LogInvocationHandler loghandler = new LogInvocationHandler();

    public Object getObject(String classname) {
        Object objectProxy = null;
        Class clazz;
        if (objects.get(classname) == null) {
            try {//改到配置文件中--使用键值对--Properties
                //需要使用properties类去读取文件配置
                System.out.println(classname);
                clazz = Class.forName(classname);
                objectProxy = Proxy.newProxyInstance(
                        this.getClass().getClassLoader(),
//							new Class[] {proxyinterface},
                        clazz.getInterfaces(),
                        loghandler
                );
                //放入对象池
                objects.put(classname, objectProxy);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return objects.get(classname);
    }

}
