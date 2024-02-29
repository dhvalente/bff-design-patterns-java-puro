package singleton;

import javax.swing.*;

/**
 * Singleton Lazy Holder
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * Beneficios:
 * Static factory
 * Lazy Initialization
 * Thread Safe
 */
public class SingletonLazyHolder {


    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }
   public static SingletonLazyHolder getInstancia(){
       return InstanceHolder.instancia;
   }
}
