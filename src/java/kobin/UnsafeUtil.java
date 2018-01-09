package java.kobin;

import sun.misc.Unsafe;
import sun.reflect.CallerSensitive;
import sun.reflect.Reflection;


/**
 * Created by @author shibinbin on 2018/1/9.
 */

public class UnsafeUtil {

    @CallerSensitive
    public static Unsafe getUnsafe(){
        Class cc = Reflection.getCallerClass();
        if (cc.getClassLoader() != null){
            throw new SecurityException("Unsafe");
        }
        return Unsafe.getUnsafe();
    }


}
