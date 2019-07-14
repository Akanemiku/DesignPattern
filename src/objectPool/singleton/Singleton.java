package objectPool.singleton;

public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {
    }

    //为了让外部直接调用方法来返回对象
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
