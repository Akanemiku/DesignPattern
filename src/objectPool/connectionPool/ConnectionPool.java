package objectPool.connectionPool;

import java.util.ArrayList;
import java.util.List;

/*
 * 连接池为单例模式
 * 创建的时候自动生成n个连接对象存入未使用list中
 * 获得某一连接对象时将对象从未使用list中删除并存入已使用list中
 * */
public class ConnectionPool {
    private static ConnectionPool conpool = null;

    private List<DBConnection> availables = new ArrayList<>();
    private List<DBConnection> unavailables = new ArrayList<>();

    private ConnectionPool() {
        //实例化5个DBConnection
        for (int i = 0; i < 5; i++) {
            availables.add(new DBConnection());
        }
        unavailables.clear();
    }

    public static ConnectionPool getConnectionPool() {
        if (conpool == null) {
            conpool = new ConnectionPool();
        }
        return conpool;
    }

    public DBConnection getDBConnection() {
        DBConnection dbc = null;
        if (availables.size() > 0) {
            dbc = availables.get(0);
            availables.remove(dbc);
            unavailables.add(dbc);
        }
        return dbc;
    }

    public void close() {
    }
}
