package ma.cigma.javaZoom.ioc;

/**
 * Created by Oussama_Qaiboub on 2020-12-28.
 */
public class Connection2MySqlImpl implements Connection2Db{

    @Override
    public void insert(String name, Integer age) {
        System.out.println("save to mysql / name : " + name +" and age : " + age);
    }
}
