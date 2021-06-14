package ChikenEgg;

import java.util.Random;

class ChikenEgg extends Thread {

    public ChikenEgg(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                // Приостанавливаем поток
                sleep(getTimeSleep());
                System.out.println(getName());
            } catch (InterruptedException e) {
            }
        }
    }

    final Random random = new Random();

    int getTimeSleep() {

        return random.nextInt(300);
    }
}

