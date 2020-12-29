package ma.cigma.factory;

/**
 * Created by Oussama_Qaiboub on 21/11/2020.
 */
public class DataFactory {

    public Data getData(String data) {

        if ("f".equals(data))
            return new DataFile();
        else if ("db".equals(data))
            return new DataDb();
        else
            return null;
    }

}
