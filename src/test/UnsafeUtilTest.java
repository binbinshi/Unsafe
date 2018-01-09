package test;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by @author shibinbin on 2018/1/9.
 */

public class UnsafeUtilTest {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        Unsafe unsafe = (Unsafe) field.get(null);
        System.out.println(unsafe);
    }
}
