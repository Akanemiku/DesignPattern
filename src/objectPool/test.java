package objectPool;

import objectPool.connectionPool.ConnectionPool;
import objectPool.connectionPool.DBConnection;
import objectPool.singleton.Singleton;
import org.junit.Test;

public class test {
    @Test
    //单例模式
    public void singletonTest() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.toString() + "\n" + singleton2.toString());
    }

    @Test
    //连接池
    public void connectionPoolTest() {
        //创建连接池
        ConnectionPool connectionPool = ConnectionPool.getConnectionPool();
        //获得某一数据库连接对象
        DBConnection dbConnection = connectionPool.getDBConnection();
        //该对象执行操作
        dbConnection.execute();
        //关闭连接池
        connectionPool.close();
    }
}
