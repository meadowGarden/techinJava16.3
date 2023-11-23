import itadesign.beerdrinker.BeerFactory;
import itadesign.beerdrinker.DefaultBeerBottle;
import itadesign.beerdrinker.NoMoreMaltException;

import java.util.Random;

public class BeerFactoryImpl implements BeerFactory {

    private double malt;

    public BeerFactoryImpl() {
        this.malt = UnitConverter.kgToG(1.00);
    }

    @Override
    public void receiveMaltShippment(double amountInKilograms){
        if (amountInKilograms >= 0) {
            malt += UnitConverter.kgToG(amountInKilograms);
        }
    }

    @Override
    public DefaultBeerBottle produceNextBeerBottle() throws NoMoreMaltException {
        if (malt < UnitConverter.kgToG(0.025)) {
            throw new NoMoreMaltException("no malt in storage");
        }

        double[] arrVolume = {0.33, 0.5};
        int bottleVolume = new Random().nextInt(arrVolume.length);

        double[] arrContent = {4.5, 5.7};
        int alcoholContent = new Random().nextInt(arrContent.length);
        malt -= UnitConverter.kgToG(0.025);

        return new DefaultBeerBottle(arrVolume[bottleVolume], arrContent[alcoholContent]);
    }

    public double getMalt() {
        return malt;
    }
}
