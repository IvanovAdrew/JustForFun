package workingWithStreams;

public class Main {
    static boolean b = false;
    static CsSourceBetter firstThread = new CsSourceBetter();
    static Cs16better secondThread = new Cs16better();

    public static void main(String args[]) {

        Thread RfirstThread = new Thread(firstThread);
        Thread RsecondThread = new Thread(secondThread);
        RfirstThread.start();
        RsecondThread.start();
        for (int i = 0; i <= 3; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("CS:GO the best");
            } catch (InterruptedException e) {
                System.out.println("H'uston we have a problem");
            }
        }
        while (b=true) {
            if ((RfirstThread.isAlive()) && (!RsecondThread.isAlive())) {
                try {
                    RfirstThread.join();
                } catch (InterruptedException e) {
                    System.out.println("H'uston we have a problem");
                }
                System.out.println("CS SOURSE BETTER");
                break;
            } else if ((!RfirstThread.isAlive()) && (RsecondThread.isAlive())) {
                try {
                    RsecondThread.join();
                } catch (InterruptedException e) {
                    System.out.println("H'uston we have a problem");
                }
                System.out.println("CS 1.6 BETTER!!!");
                break;
            } else if ((!RfirstThread.isAlive()) && (!RsecondThread.isAlive())) {

                System.out.println("CS:GO THE BEST");
                break;
            }
        }
    }
}
