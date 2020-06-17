package Text;

public class Text21 {
    public static void main(String[] args){

    }
}
abstract class  Animal extends Thread{
    private int t;
    private static int s = 2000;
    private int v;
    public Animal(int t,int v){
        setT(t);
        setV(v);
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    @Override
    public void run() {
        super.run();
    }
    public abstract void Runnable();
}
class Rabbit extends Animal{

    public Rabbit(int t, int v) {
        super(t, v);
    }
    public void RunOne(){
        
    }

    @Override
    public void Runnable() {

    }
}