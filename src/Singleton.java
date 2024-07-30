public class Singleton {
    private static volatile Singleton instance;
    private Singleton(){}
    public Singleton getInstance(){
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
}
