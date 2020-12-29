package ma.cigma.tpIntrface;

/**
 * Created by Oussama_Qaiboub on 29/11/2020.
 */
public interface Device2 extends Device , Phone{

    @Override
    default void displaySerial() {

    }

    @Override
    default void show() {

    }

    @Override
    default void send() {

    }

    @Override
    default void receive() {

    }
}
