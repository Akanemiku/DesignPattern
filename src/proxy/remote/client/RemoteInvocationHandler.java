package proxy.remote.client;

import proxy.remote.Call;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.Socket;

public class RemoteInvocationHandler implements InvocationHandler {
    private Class clazz;

    public RemoteInvocationHandler(Class clazz) {
        this.clazz = clazz;
    }

    @Override
    public Object invoke(Object proxy,
                         Method method,
                         Object[] args)
            throws Throwable {
        //希望在这个方法里实现：将--远程对象调用的所有信息--通过网络传输到远程对象池，
        //然后由远程对象池找到相应的对象及方法，通过反射技术来调用
        //String className,String methodName, Class[] paramTypes,Object[] params
        Call call = new Call(clazz.getName(),
                method.getName(),
                method.getParameterTypes(),
                args);
        //链接到服务器，建立通讯的通道
        Socket socket = new Socket("10.16.138.234", 8000);
        //建立数据通道--输出流--并发送远程对象方法调用信息对象call
        OutputStream os = socket.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(call);
        //接收服务端对象方法调用后的返回结果。
        InputStream is = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        call = (Call) ois.readObject();
        oos.close();
        ois.close();
        socket.close();
        return call.getResult();
    }

}
