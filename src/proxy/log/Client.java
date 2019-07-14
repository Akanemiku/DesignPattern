package proxy.log;

import proxy.Course;
import proxy.ICourseService;
import proxy.CourseService;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args){

        try {
            Course course = new Course("设计模式");
            ICourseService service = new CourseService(course);

            //通过构造函数传入object
            LogInvocationHandler handler = new LogInvocationHandler(service);

            ICourseService serviceProxy = (ICourseService) Proxy.newProxyInstance(
                    ICourseService.class.getClassLoader(),
                    new Class[] {ICourseService.class},
                    handler
            );
            serviceProxy.selectCourse(course);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
