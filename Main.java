package Code.JDK.Home_work.HW_5;

/**
 * Есть пять философов (потоки), которые могут либо обедать либо размышлять.
 * Каждый философ должен пообедать три раза. Каждый прием пищи длиться 500 миллисекунд
 * После каждого приема пищи философ должен размышлять
 * Не должно возникнуть общей блокировки
 * Философы не должны есть больше одного раза подряд
 */

public class Main {
    protected static final Object monitor = new Object();

    public static void main(String[] args) {

        Thread philosopher1 = new Thread(new Philosopher(3));
        Thread philosopher2 = new Thread(new Philosopher(3));
        Thread philosopher3 = new Thread(new Philosopher(3));
        Thread philosopher4 = new Thread(new Philosopher(3));
        Thread philosopher5 = new Thread(new Philosopher(3));

        philosopher1.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
        philosopher5.start();
    }
}