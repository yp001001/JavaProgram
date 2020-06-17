package Text;

import java.lang.annotation.Annotation;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.Method;

public class Text29 {
    public static void main(String[] args) {
         Class clazz = Persons.class;
        Method[] m = clazz.getDeclaredMethods();//获取运行时类的所有内部方法(非结构方法)
//        for(Method n : m){
//            System.out.println(n);  //获取所有内部类
//        }
        for(int i=0;i<m.length;i++){
            Annotation[] annotations = m[i].getAnnotations();   //获取内部类的注解
            String name = m[i].getName();   //获取内部类名称
            Class[] exceptionTypes = m[i].getExceptionTypes();//获取异常类别
            for(Annotation o : annotations){
                System.out.println("注解："+o);
            }
            for(Class x : exceptionTypes){
                System.out.println(x);
            }
            int modifiers = m[i].getModifiers();   //获取权限修饰符
            Class<?> returnType = m[i].getReturnType();  //获取返回值类型
            System.out.println(returnType);
            System.out.println(modifiers);
            System.out.println("类名："+name);
        }

    }
}

class Persons{

    public Persons(String name,int id) throws RuntimeException, WrongMethodTypeException {

    }
    public Persons() throws  Exception{

    }

    private Persons(int age){}

    @Text29s("dd")
    public String toString() {
        return super.toString();
    }
    public void x() throws RuntimeException, WrongMethodTypeException{
        System.out.println("111111");
    }
    private int y() throws  Exception{
        System.out.println("22222222");
        return 1;
    }
}