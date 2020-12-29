package ma.cigma.tpIntrface;

/**
 * Created by Oussama_Qaiboub on 29/11/2020.
 */
public interface Phone {

    void send();

    void receive();

  //  void start();

    default void start(){

    }
/*
    default String toString(){

    }*/

    default void show(){

    }
}
