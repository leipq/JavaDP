package kingdee.base.ssc.day009.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * leaning
 * Class clazzA = A.class;
 * Class clazzB = B.class;
 * boolean isFather = clazzB.isAssignableFrom(clazzA));
 * if(isFather){
 *  System.out.println("A is extends B ");
 * }else{
 *  System.out.println("A is not extends B");
 * }
 *
 * 获取泛型的类型：
 * 新增一个方法，通过反射取泛型的类型
 *
 * */

public class GenericTest {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>(10);
        list.add("wangli");
        list.add("leipq");

        Method applyMethod = GenericTest.class.getMethod("applyParam",List.class);
        Type[] types = applyMethod.getGenericParameterTypes();
        prinParamType(types);

    }
    public static void prinParamType(Type[] types){
        for (Type type :types) {
            if (!ParameterizedType.class.isAssignableFrom(type.getClass())){
                System.out.println(" type is not match ParameterizedType");
                return;
            }
            ParameterizedType pType = (ParameterizedType) type;
            System.out.println(pType.getOwnerType());
            System.out.println(pType.getRawType());
            System.out.println(pType.getTypeName());
            Type[] newPType = pType.getActualTypeArguments();
            if(newPType.length > 0){
                prinParamType(newPType);
            }
        }
    }
    public static void applyParam(List<String> list){

    }
}
