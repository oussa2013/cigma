package ma.cigma.javaZoom.ioc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

/**
 * Created by Oussama_Qaiboub on 2020-12-28.
 */
public class MainTest22 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Connection2Db connection2Db ;
        ResourceBundle resourceBundle = ResourceBundle.getBundle("ma.cigma.ioctp.ioc.application");
        String name = resourceBundle.getString("dbName");
        Class cls = Class.forName(name);

        Constructor[] constructor = cls.getDeclaredConstructors();
        constructor[0].setAccessible(true);
        connection2Db = (Connection2Db) constructor[0].newInstance();


        Etudient2 e = new Etudient2("hassan", 24);
        e.save(connection2Db);
    }
}
