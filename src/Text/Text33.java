package Text;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/*  动态代理模式   */
public class Text33 {
    public static void main(String[] args) {

        Pick pick = new Pick();
        A object =(A) Picks.getObject(pick);
        object.Dringk("可乐");
        object.Eat("汉堡包");
    }
}
interface A{
    void Dringk(String str);
    void Eat(String str);
}
/*   被代理类    */
class Pick implements A{

    @Override
    public void Dringk(String str) {
        System.out.println("我喜欢喝"+":"+str);
    }

    @Override
    public void Eat(String str) {
        System.out.println("我喜欢吃："+str);
    }
}
/*   动态代理类    */
/*
  想要实现动态代理的几个条件
  1，如何根据被加载到内存的类，创建一个动态的被代理类的对象
  2，如何调用被代理类的需要代理的同名方法
 */
class  Picks{
         /*  得到被代理类的实例化对象  */
        public static Object getObject(Object obj){
            MyInvocationHandler myInvocationHandler = new MyInvocationHandler(obj);
            //参数1得到类的加载器，参数2得到类继承的接口，参数3，调用此类，默认会调用MyInvocationHandler的invoke方法
           return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),myInvocationHandler);
        }
}
class MyInvocationHandler implements InvocationHandler{

    private Object obj;
    public MyInvocationHandler(Object obj){
        this.obj = obj;
    }
    @Override
    /*
    参数1： 得到被代理类的实例
    参数2： 表示类的方法
    参数3：表示类的方法的参数
    */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(obj, args);
        return invoke;
    }
}