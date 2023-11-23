import itadesign.beerdrinker.BeerConsumer;
import itadesign.beerdrinker.BeerFactory;
import itadesign.test.AbstractBeerTest;

public class DrinkerTest extends AbstractBeerTest {

    @Override
    protected BeerFactory getBeerFactory() {
        return new BeerFactoryImpl();
    }

    @Override
    protected BeerConsumer getBeerConsumer() {
        return new BeerConsumerImpl();
    }
}
