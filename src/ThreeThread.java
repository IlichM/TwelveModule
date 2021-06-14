import java.util.*;

public class ThreeThread {
    public static void main(String[] args) throws InterruptedException {

        // 1 поток
        Thread maxFromList = new Thread() {
            public void run() {
                List<Integer> numbers = new ArrayList<>();
                for (int i = 1; i <= 10000000; i++) {
                    numbers.add(i);
                }
                int max = Collections.max(numbers);
                System.out.println("Max found: " + max);
            }
        };

        // 2 часть
        Thread sortList = new Thread() {
            public void run() {
                List<Integer> unsorted = new ArrayList<>();
                for (int i = 10000000; i >= 1; i--) {
                    unsorted.add(i);
                }
                Collections.sort(unsorted);
                System.out.println("List is sorted now");
            }
        };

        // 3 часть
        Thread clearList = new Thread() {
            public void run() {
                List<Integer> list = new ArrayList<>();
                for (int i = 1; i <= 10000000; i++) {
                    list.add(i);
                }
                while (list.size() != 0) {
                    list.remove(list.size() - 1);
                }
                System.out.println("List cleared");
            }
        };

        long start = System.currentTimeMillis();
        maxFromList.start();
        sortList.start();
        clearList.start();

        maxFromList.join();
        sortList.join();
        clearList.join();

        long end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start) + " ms");
    }

}

