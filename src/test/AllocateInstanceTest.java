import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by @author shibinbin on 2018/1/9.
 */

public class AllocateInstanceTest {

    public static void main(String[]args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Field field = Unsafe.class.getDeclaredField("theUnsafe");

        field.setAccessible(true);
        Unsafe unsafe = (Unsafe) field.get(null);

        User user = (User) unsafe.allocateInstance(User.class);
        System.out.println(user);

        User userNormal = new User();
        System.out.println(userNormal);
    }

}

class  User{
    private String name = "";
    private int age = 0;

    public User(){
        this.name = "test";
        this.age = 30;
    }
    public String toString(){
        return name + " : " + age;
    }
}