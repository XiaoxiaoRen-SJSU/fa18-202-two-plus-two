public class GameModeSingleton {

    private static final GameModeSingleton instance;


    private GameModeSingleton() {}

    static {
        try {
            instance = new GameModeSingleton();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public static GameModeSingleton getInstance() {
        return instance;
    }

    public IStrategy strategy;

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy s) {
        strategy = s;
    }
}