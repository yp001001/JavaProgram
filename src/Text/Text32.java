package Text;

import java.lang.reflect.Constructor;
/*  利用反射调取构造器  */
public class Text32 {
    public static void main(String[] args) throws Exception {
        Class clazz = Person.class;
        Object obj1 = clazz.newInstance();
        Constructor declaredConstructor = clazz.getDeclaredConstructor(int.class);//---->参数为构造器的形参，防止含有多个构造器不知道调用哪个
        declaredConstructor.setAccessible(true);
        Object obj2 = declaredConstructor.newInstance(99);//-------->obj2返回的是tostring方法
        System.out.println(obj2);
    }
}
