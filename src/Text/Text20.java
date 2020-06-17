package Text;

public class Text20 {
    public static void main(String[] args){
        Money money = new Money();
        GetOne getOne = new GetOne(money);
        GetTwo getTwo = new GetTwo(money);
        Thread thread1 = new Thread(getOne);
        Thread thread2 = new Thread(getTwo);
        thread1.setName("柜台");
        thread2.setName("ATM机");
        thread1.start();
        thread2.start();

    }
}
class Money{
    public static double money = 10000;

    public synchronized void GetTwo() {
        if(Money.money >= 1000){
            money -=1000;
            System.out.println(Thread.currentThread().getName()+":剩余余额为："+money);
        }

    }

    public synchronized void GetOne() {
       if(Money.money >= 2000){
           money -=2000;
           System.out.println(Thread.currentThread().getName()+":剩余余额为："+money);
       }
    }
}
class GetOne implements Runnable{
    private Money money;
    public GetOne(Money money){
        this.money = money;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money.GetOne();
        }
    }
}
class GetTwo implements Runnable{
    private Money money;
    public GetTwo(Money money){
        this.money = money;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money.GetTwo();
        }
    }
}