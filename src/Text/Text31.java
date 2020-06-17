package Text;

import java.lang.reflect.Method;

/*   利用反射获取运行时类的方法或者静态方法   */
public class Text31 {
    public static void main(String[] args) throws Exception {
        Class clazz = Person.class;
        Object obj = clazz.newInstance();
        Method declaredMethod = clazz.getDeclaredMethod("x",int.class);//参数1为方法名，参数2为方法形参------>防止参数名重复
        declaredMethod.setAccessible(true);
        Object invoke = declaredMethod.invoke(obj,99);  //invoke方法运行指定方法，无返回值objs为null
        System.out.println(invoke);
    }
}

