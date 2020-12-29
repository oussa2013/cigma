package ma.cigma.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Oussama_Qaiboub on 21/11/2020.
 */
public class TestConnection {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {

        ConnectionManager connection1 = ConnectionManager.getInstance("conncetion O1");
        ConnectionManager connection2 = ConnectionManager.getInstance("conncetion O2");

        System.out.println(connection1.con);
        System.out.println(connection2.con);

        Class c = ConnectionManager.class;
        Constructor [] c1 =c.getDeclaredConstructors();
        c1[0].setAccessible(true);
        c1[0].newInstance(null);


    }
}
