import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Set;

/*
用反射机制读取src文件夹下的student.properties文件中的内容，并转换成student对象
properties文件如下：
className=com.Student
name=mayun
age=60
 */
public class Test5 {
    public static void main(String[] args) {
        Stu2 stu = (Stu2) createObject();
        System.out.println(stu);
    }

    public static Object createObject() {
        try {
            Properties pro = new Properties();
            pro.load(Test5.class.getResourceAsStream("/student.properties"));
            String className = pro.getProperty("class");
            Class c = Class.forName(className);
            Object obj = c.newInstance();
            Set<String> names = pro.stringPropertyNames();
            for (String name : names) {
                if (name.equals("class")) continue;
                String value = pro.getProperty(name);
                Field f = c.getDeclaredField(name);
                f.setAccessible(true);
                Class typeClass = f.getType();
                if (typeClass == int.class) {
                    f.setInt(obj, Integer.parseInt(value));
                } else {
                    f.set(obj, value);
                }
            }
            return obj;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Stu2 {
    private String ClassName;
    private String name;
    private int age;

    public Stu2(String className, String name, int age) {
        ClassName = className;
        this.name = name;
        this.age = age;
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

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }
}