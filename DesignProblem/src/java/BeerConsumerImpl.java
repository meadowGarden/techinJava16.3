import itadesign.beerdrinker.BeerBottle;
import itadesign.beerdrinker.BeerConsumer;
import itadesign.beerdrinker.DefaultBeerBottle;

public class BeerConsumerImpl extends BeerConsumer {


    @Override
    protected boolean shouldConsumeBeer(BeerBottle beerBottle) {

        if ((beerBottle.getVolumeInLiters() > 0.5) ||
                (beerBottle.getAlcoholContentInPercent() > 6) ||
                (super.getBloodAlcoholContentInLiters() >= 0.120)) {
            return false;
        }
        return true;
    }

    @Override
    public BeerBottle showBeerBottleToAStranger(BeerBottle beerBottle, boolean mightBeAPoliceMan) {


        if (mightBeAPoliceMan) {
            return new BottleWrapper((DefaultBeerBottle) beerBottle);
        }
        return beerBottle;
    }

}
