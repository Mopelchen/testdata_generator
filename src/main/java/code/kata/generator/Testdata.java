package code.kata.generator;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

public class Testdata {

    public <T> T generate(final Class<T> clazz)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        T testdata = clazz.getConstructor().newInstance();

        Method[] methods = clazz.getMethods();

        for(Method method : methods) {

            if(!method.getName().startsWith("set")) {
                continue;
            }

            Class<?> parameterType = method.getParameterTypes()[0];

            if(parameterType.equals(Integer.class) || parameterType.equals(int.class)) {
                method.invoke(testdata, Integer.MAX_VALUE);
            }
        }

        return testdata;
    }
}
