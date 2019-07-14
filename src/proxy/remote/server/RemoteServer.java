package proxy.remote.server;

import proxy.remote.Call;
import proxy.remote.server.ObjectPool;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

public class RemoteServer {
    public static void main(String[] args) {
        try {
            ServerSocket sst = new ServerSocket(8000);
            while (true) {
                Socket socket = sst.accept();
                System.out.println("来自：" + socket.getInetAddress());
                InputStream is = socket.getInputStream();
                ObjectInputStream ois = new ObjectInputStream(
                        new BufferedInputStream(is));
                Call call = (Call) ois.readObject();
                System.out.println(call.toString());

                //使用call对象进行对象池中的相应对象的相关方法的调用
                ObjectPool objectPool = ObjectPool.getInstance();
                Object obj = objectPool.getObject(
                        call.getClassName());
                Method method = obj.getClass().getMethod(
                        call.getMethodName(),
                        call.getParamTypes());
                Object result = method.invoke(obj, call.getParams());
                call.setResult(result);
                OutputStream os = socket.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(os));
                oos.writeObject(call);
                oos.close();
                ois.close();
                socket.close();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
