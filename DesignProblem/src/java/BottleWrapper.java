import itadesign.beerdrinker.BeerBottle;
import itadesign.beerdrinker.DefaultBeerBottle;

public class BottleWrapper implements BeerBottle {

    DefaultBeerBottle bottle;

    public BottleWrapper(DefaultBeerBottle bottle) {
        this.bottle = bottle;
    }

    @Override
    public double getAlcoholContentInPercent() {
        return 0;
    }

    @Override
    public double getVolumeInLiters() {
        return bottle.getVolumeInLiters();
    }

    @Override
    public void takeASip(double volumeInLiters) {
        bottle.takeASip(volumeInLiters);
    }
}
