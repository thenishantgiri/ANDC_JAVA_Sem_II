package HomeAssignment06;

public class test {

    public static void main(String[] args) {
        test obj = new test();
        obj = null;
        System.gc();
    }

    public void finalize() {
        System.out.println("Garbage Collected");
    }
}
