package Text;

public class Text28 {
    public static void main(String[] args) throws Exception {
    /*    for(int i=0;i<100;i++){
            int x = (int) (Math.random()*3);
            switch ()
        }   */
        Person p = new Person();
        System.out.println(getInstance.getInstance1("java.lang.Object"));
        System.out.println(getInstance.getInstance2(p));  //class Text.Person
        System.out.println(getInstance.getInstance3(p));  //0::null
    }
}
class getInstance{

    public static Object getInstance1(String classPath) throws Exception {
        Class clazz = Class.forName(classPath);//实例化运行时类
       // return clazz;--------------->class java.lang.Object
        Object obj = clazz.newInstance();
        return obj;//java.lang.Object@b4c966a
    }
    public static Object getInstance2(Object obj){
        Class clazz = obj.getClass();   //实例化运行时类
        return clazz;
    }
    /*
    *     此方法相当于 Object obj = new Object();
    */
    public static Object getInstance3(Object obj) throws Exception{
        Class clazz = obj.getClass();
        Object o = clazz.newInstance();
        return o;
    }
}
class Person{
    String name;
    int age;

    public Person(){

    }
    public Person(int x){
        System.out.println(x);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return age+"::"+name;
    }

    private static void x(int m){ System.out.println("我是静态方法"+m);}
    public static int y(){
        System.out.println("我是静态方法2");
        return 1001;
    }

}