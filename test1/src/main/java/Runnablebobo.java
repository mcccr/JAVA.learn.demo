/**
 * Created by chenrong on 2016-07-14.
 */
public class Runnablebobo implements Runnable {
    public void run() {
        int count = 0;
        System.out.println(Thread.currentThread().getName() + "  starts  ");
        while (count < 20) {
            count ++;
            System.out.println(Thread.currentThread().getName() + "  is running  " + count);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "  finishes");

    }
}
