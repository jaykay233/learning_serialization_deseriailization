import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class StudentClass = Class.forName("com.test.reflection.Student");
        Field[] declaredFieldList = StudentClass.getDeclaredFields();
        for(Field declareField : declaredFieldList){
            System.out.println("declared Field: " + declareField);
        }

        Field[] fieldList = StudentClass.getFields();
        for(Field field : fieldList){
            System.out.println("field: " + field);
        }

        Constructor[] declaredConstructorList = StudentClass.getDeclaredConstructors();
        for(Constructor declaredConstructor : declaredConstructorList){
            System.out.println("declared Constructor: " + declaredConstructor);
        }

        Constructor[] constructorList = StudentClass.getConstructors();
        for(Constructor constructor: constructorList){
            System.out.println("constructor: " + constructor);
        }

        Method[] declaredMethodList = StudentClass.getDeclaredMethods();
        for(Method declareMethod: declaredMethodList){
            System.out.println("declared Method: " + declareMethod);
        }

        Method[] methodList = StudentClass.getMethods();
        for(Method method : methodList){
            System.out.println("method: " + method);
        }

        //practice
        StudentClass = Class.forName("com.test.reflection.Student");
        Constructor studentConstructor = StudentClass.getDeclaredConstructor(String.class);
        studentConstructor.setAccessible(true);
        Object student = studentConstructor.newInstance("NameA");
        Field studentAgeField = StudentClass.getDeclaredField("studentAge");
        studentAgeField.set(student,10);
        Method studentShowMethod = StudentClass.getDeclaredMethod("show",String.class);
        studentShowMethod.setAccessible(true);
        Object result = studentShowMethod.invoke(student,"message");
        System.out.println("result: " + result);
    }
}
