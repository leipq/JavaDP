package kingdee.base.ssc.day04;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCaseTracker {
    public static void trackUseCases(List<Integer> useCase,Class<?> cl){

        for (Method m: cl.getDeclaredMethods()){
            UseCase uc = m.getAnnotation(UseCase.class);
            if(uc!=null){
                System.out.println("fount use case:" + uc.id() +"  description:"+uc.description());
            }

        }
        for (int i :useCase){
            System.out.println("warning:missing use case :" + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCase = new ArrayList<>();
        Collections.addAll(useCase,1);
        trackUseCases(useCase,PasswordUtils.class);
    }
}



