package workingWithStreams;

public class Cs16better implements Runnable {

    @Override
    public void run () {
        for (int i =0;i<=3;i++) {
            try {
                Thread.sleep(1000);

            }catch(InterruptedException e){
                System.out.println("H'uston we have a problem");
            }
            System.out.println("CS 1.6 is much better than all other versions!!!!");
        }
    }
}