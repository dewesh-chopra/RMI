package RMI;

import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String[] args) {
        try {
            MyRemoteInterface remoteObject = (MyRemoteInterface) Naming.lookup("MyRemoteObject");
            System.out.println(remoteObject.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
