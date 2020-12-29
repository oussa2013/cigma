package ma.cigma.factory;

/**
 * Created by Oussama_Qaiboub on 21/11/2020.
 */
public class TestData {

    public static void main(String[] args) {
        String type = null;
        DataFactory dataFactory = new DataFactory();

        Data data = dataFactory.getData(type);

        if (data != null)
            data.lire();
        else
            System.out.println("le type de data n'exsist pas");

    }
}
