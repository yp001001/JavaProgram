package Text;

import javax.xml.namespace.QName;
import java.lang.reflect.Field;

public class Text30 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
//        Class clazz = Person.class;
//        Person obj = (Person)clazz.newInstance();   //获取实例
//     //   Field[] declaredFields = clazz.getDeclaredFields();//获取类中的属性
//        Field declaredField = clazz.getDeclaredField("name");  //获取类中指定的属性
//        Field age = clazz.getDeclaredField("age");    //获取类中指定的属性
//        declaredField.setAccessible(true);  //保证类中指定的属性是可访问的
//        age.setAccessible(true);   //保证类中指定的属性是可访问的
//        age.set(obj,19);
//        declaredField.set(obj,"小李");   //设置属性
//        System.out.println(declaredField.get(obj)+":"+age.get(obj));



        Class clazz = Person.class;  //获取运行时类---->可以干嘛呢？--->可以获取类的指定属性呐
        Object obj = clazz.newInstance();  //获取实例，区分修改的类的属性是哪个
        Field declaredField = clazz.getDeclaredField("name");   //获取类的指定为name的属性
        Field age = clazz.getDeclaredField("age");
        declaredField.setAccessible(true);  //需要让此类的属性的权限能够被获取
        age.setAccessible(true);//同理
        age.set(obj,200);  //让获取到指定属性的这个东西（1，2）修改这个1类的指定属性为2；
        declaredField.set(obj,"小孙");
        System.out.println(age.get(obj)+":"+declaredField.get(obj));
    }
}



