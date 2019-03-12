package workingWithStreams;

import java.sql.SQLOutput;

public class CsSourceBetter implements Runnable {

    @Override
    public void run () {
        for (int i =0;i<=3;i++) {
            try {
                Thread.sleep(1000);

            }catch(InterruptedException e){
                System.out.println("H'uston we have a problem");

            }
            System.out.println("CS source is much better than all other versions!!!!");
        }
    }
}
