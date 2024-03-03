package Java_Native_Memory;

@SuppressWarnings("All") // For look purposes.
public class NativeMemoryTrackingExample {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable() {
                private byte[] data;
                @Override
                public void run() {
                    while (true) {
                        data = new byte[1024 * 1024];
                    }
                }
            }, "thread-" + i).start();
        }
    }
}
