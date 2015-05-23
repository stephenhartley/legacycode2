package legacycode.instancedelegator.utils;

public class UtilityClass {

    public static int add(int x, int y) {
        return x + y;
    }

    public int addInstance(int x, int y) {
        return add(x, y);
    }

}
