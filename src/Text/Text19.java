package Text;

public class Text19 {
    public static void main(String args[]){
        Object o = new Object();
        Thread 窗口一 = new Thread( new PrintRunnable(1,o));
        Thread 窗口二 = new Thread(new PrintRunnable(2,o));
        Thread 窗口三 = new Thread(new PrintRunnable(3,o));
        窗口一.setName("线程一");
        窗口二.setName("线程二");
        窗口三.setName("线程三");
        窗口一.start();
        窗口二.start();
        窗口三.start();
        }
    }

class PrintRunnable implements Runnable {
    private int number;
    private static int input = 0;
    private Object obj;
    public PrintRunnable(int number,Object obj){
        this.number = number;
        this.obj = obj;
    }

    @Override
    public void run() {
        while(input<75){
         //   System.out.println("22222");
        synchronized(obj){
                if((input/5%3)+1 == number){
                  //  System.out.println("3333333333333");
                    for(int i=0;i<5;i++){
                        input++;
                        System.out.println(Thread.currentThread().getName()+":"+input);
                    }
                    obj.notifyAll();
                }else{
                    try {
                  //      System.out.println("1111111111");
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}