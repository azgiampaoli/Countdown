import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Countdown {
    public static void main(String[] args) {

        final ScheduledExecutorService countdown = Executors.newScheduledThreadPool(1);

        final Runnable runnable = new Runnable() {
          int time = 15;



            public void run() {
                System.out.println(time);
                time--;

                if (time < 0) {
                    System.out.println("Pi pi pi!Pi pi pi!Pi pi pi!");
                    countdown.shutdown();

                }
            }
        };
        countdown.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
    }


}
