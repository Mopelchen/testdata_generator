package code.kata.generator;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Stream;

public class TestdataGenerator {

    public <T> T generate(final Class<T> clazz)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {

        T testdata = clazz.getConstructor().newInstance();

        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            if (!method.getName().startsWith("set")) {
                continue;
            }

            Class<?> parameterType = method.getParameterTypes()[0];

            if (parameterType.equals(Integer.class) || parameterType.equals(int.class)) {
                method.invoke(testdata, Integer.MAX_VALUE);
            } else if (parameterType.equals(Long.class) || parameterType.equals(long.class)) {
                method.invoke(testdata, Long.MAX_VALUE);
            } else if (parameterType.equals(String.class)) {
                String fieldName = StringUtils.uncapitalize(method.getName().substring(3));
                method.invoke(testdata, fieldName);
            } else if (parameterType.isEnum()) {
                method.invoke(testdata, parameterType.getEnumConstants()[0]);
            } else if (parameterType.equals(List.class)) {
                String addMethodName = "add" + method.getName().substring(3) + "Item";
                Method addMethod = Stream.of(clazz.getMethods())
                        .filter(m -> addMethodName.equals(m.getName()))
                        .findFirst()
                        .orElse(null);

                Class<?> itemType = addMethod.getParameterTypes()[0];
                addMethod.invoke(testdata, Integer.MAX_VALUE);
            }
        }

        return testdata;
    }
}
