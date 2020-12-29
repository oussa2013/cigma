package ma.cigma.javaZoom.ioc;


/**
 * Created by Oussama_Qaiboub on 2020-12-28.
 */

public class Etudient2 {

    String name;
    Integer age;

    public Etudient2(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    void save(Connection2Db cnx) {
        cnx.insert(name, age);
    }

}
