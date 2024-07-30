public class Singleton {
    private static volatile Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        Singleton result = instance;
        if (result != null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result != null) {
                    instance = result = new Singleton();
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Singleton myInstance = Singleton.getInstance();
        Singleton myInstance2 = Singleton.getInstance();

        assert myInstance == myInstance2 : "Different instances";
    }
}

