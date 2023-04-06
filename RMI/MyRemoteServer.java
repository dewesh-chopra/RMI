package RMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyRemoteServer {
    public static void main(String[] args) {
        try {
            MyRemoteInterface remoteObject = new MyRemoteImplementation();
            Registry registry = LocateRegistry.createRegistry(1099);
            Naming.rebind("MyRemoteObject", remoteObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
