package ma.cigma.tpioc.equipe2.banque.logic;

import ma.cigma.tpioc.equipe1.banque.dao.IvirementDao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

/**
 * Created by Oussama_Qaiboub on 29/11/2020.
 */
public class VirementLogic {

    public static void validate() throws IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        IvirementDao dao ;
        ResourceBundle resourceBundle = ResourceBundle.getBundle("ma.cigma.tpioc.equipe1.banque.dao.application");
        String name = resourceBundle.getString("class.name");
        Class c = Class.forName(name);
        Constructor[] constructors = c.getDeclaredConstructors();
        constructors[0].setAccessible(true);
        dao = (IvirementDao) constructors[0].newInstance();
        dao.save();
    }
}
