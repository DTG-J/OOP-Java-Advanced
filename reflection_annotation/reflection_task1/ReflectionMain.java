package reflection_anotation.reflection_task1;

import java.lang.reflect.InvocationTargetException;

public class ReflectionMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Reflection> clazz = Reflection.class;
        System.out.println(clazz);

        Class<? super Reflection> superclass = clazz.getSuperclass();
        System.out.println(superclass);

        for (Class<?> i : clazz.getInterfaces()) {
            System.out.println(i);
            
        }

        Reflection newInstance = clazz.getDeclaredConstructor().newInstance();
        System.out.println(newInstance);


    }

}
