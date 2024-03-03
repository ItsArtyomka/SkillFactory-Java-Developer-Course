package Java_Native_Memory;

public class AnotherNMTExample {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            private byte[] data;
            @Override
            public void run() {
                while (true) {
                    data = new byte[1024 * 1024];
                }
            }
        }, "Thread").start();
    }
}
