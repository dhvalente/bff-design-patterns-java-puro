import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Main {
    public static void main(String[] args) {

        //Singletons
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println("Lazy: " + lazy);

        lazy = SingletonLazy.getInstancia();
        System.out.println("Lazy: " + lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println("Eager: " + eager);

        eager = SingletonEager.getInstancia();
        System.out.println("Eager: " + eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("LazyHolder: " + lazyHolder);

        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("LazyHolder: " + lazyHolder);
        //Singletons

        //Strategy
        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();
        Robo robo = new Robo();
        robo.setComportamento(agressivo);
        robo.mover();
        //Strategy
    }
}