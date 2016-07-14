/**
 * Created by chenrong on 2016-07-14.
 */
public class Threadbobo extends Thread {
    public void run() {
        int count = 0;
        System.out.println(getName() + "  starts  ");
        while (count < 10) {
            count++;
            System.out.println(getName() + "  is running  " + (count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(getName() + "  finishes  ");
    }

    public static void main(String[] args) {
        Thread bobo1 = new Threadbobo();
        bobo1.setName("John");
        bobo1.start();

        Thread bobo2 = new Thread(new Runnablebobo());
        bobo2.setName("Jackson");
        bobo2.start();
    }
}
