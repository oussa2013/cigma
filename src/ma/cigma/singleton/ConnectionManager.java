package ma.cigma.singleton;

import java.util.Collection;

/**
 * Created by Oussama_Qaiboub on 21/11/2020.
 */
public  class ConnectionManager {

    String con;

    private static ConnectionManager instance;

    private ConnectionManager() {
        System.out.println("test");
    }

    private ConnectionManager(String con) {
        this.con = con;
    }

    static ConnectionManager getInstance(String con){
        if (instance == null) {
            instance = new ConnectionManager(con);
        }
        return instance;
    }



}
