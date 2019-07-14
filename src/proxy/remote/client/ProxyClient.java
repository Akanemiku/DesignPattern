package proxy.remote.client;

import proxy.Course;
import proxy.CourseService;
import proxy.ICourseService;

import java.lang.reflect.Proxy;

public class ProxyClient {

    public static void main(String[] args) {
        try {
            Class clazz = ICourseService.class;
            RemoteInvocationHandler handler =
                    new RemoteInvocationHandler(CourseService.class);
            System.out.println(CourseService.class.getName());
            //为object生成代理类
            ICourseService icsProxy =
                    (ICourseService) Proxy.newProxyInstance(
                            clazz.getClassLoader(),
                            new Class[]{clazz},
                            handler);
            icsProxy.auditCourse(new Course("设计模式"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
