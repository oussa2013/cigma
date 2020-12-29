package ma.cigma.tpIntrface;

/**
 * Created by Oussama_Qaiboub on 29/11/2020.
 */
public class TestInterface {
    public static void main(String[] args) {
        //Anonymous Class
        Phone p1 = new Phone() {
            @Override
            public void send() {

            }

            @Override
            public void receive() {

            }
        };
        Phone p2 = new AndroidImpl();
        AndroidImpl p3 = new AndroidImpl();
        Device p4 = new AndroidImpl();



        ((AndroidImpl) p2).displaySerial();
        p4.displaySerial();
        p3.show();
    }
}
