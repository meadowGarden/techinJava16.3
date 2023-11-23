import itadesign.beerdrinker.BeerBottle;
import itadesign.beerdrinker.BeerConsumer;

public class BeerConsumerImpl extends BeerConsumer {


    @Override
    protected boolean shouldConsumeBeer(BeerBottle beerBottle) {
        if ((beerBottle.getVolumeInLiters() > 0.5) ||
                (beerBottle.getAlcoholContentInPercent() > 0.06) ||
                (super.getBloodAlcoholContentInLiters() > 0.12)) {
            return false;
        }
        return true;
    }

    @Override
    public BeerBottle showBeerBottleToAStranger(BeerBottle beerBottle, boolean b) {
        return null;
    }

}
