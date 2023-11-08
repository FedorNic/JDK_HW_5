package Code.JDK.Home_work.HW_5;

class Philosopher implements Runnable {
    private int mealCount;

    public Philosopher(int mealCount) {
        this.mealCount = mealCount;
    }

    @Override
    public void run() {
        while (mealCount > 0) {
            synchronized (Main.monitor) {
                eats();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            thinks();
            mealCount--;
        }
    }

    private void eats() {
        System.out.println(Thread.currentThread().getName() + " философ ест");
    }

    private void thinks() {
        System.out.println(Thread.currentThread().getName() + " философ думает");
    }
}