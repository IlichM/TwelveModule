package OutSynchronizedMessage;

public class Typer extends Thread {
    static Object slovo = new Object();
    String message;
    public Typer (String message) {
        this.message = message;
    }
    public void run() {
        synchronized(slovo) {
            for(int i = 0; i < message.length(); i++ ) {
                System.out.print(message.charAt(i));
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
}
