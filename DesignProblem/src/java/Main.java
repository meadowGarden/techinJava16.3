import itadesign.beerdrinker.DefaultBeerBottle;
import itadesign.beerdrinker.NoMoreMaltException;

public class Main {
    public static void main(String[] args) throws NoMoreMaltException {

        BeerFactoryImpl factory = new BeerFactoryImpl();
        DefaultBeerBottle beerBottle01 = factory.produceNextBeerBottle();
        System.out.printf("volume in liters -> %.2f%n", beerBottle01.getVolumeInLiters());
        System.out.printf("alcohol content -> %.2f%n", beerBottle01.getAlcoholContentInPercent());

//        System.out.println(factory.getMalt());
//        for (int i = 1; i <= 40; i++) {
//            DefaultBeerBottle def = factory.produceNextBeerBottle();
//        }
//        System.out.println(factory.getMalt());

        System.out.println("-------");


        BeerConsumerImpl beerConsumer01 = new BeerConsumerImpl();
        System.out.printf("was beer consumed? -> %s%n", beerConsumer01.consumeBeer(beerBottle01));
        System.out.printf("%f%n", beerConsumer01.getBloodAlcoholContentInLiters());
        System.out.printf("should drink a bottle? -> %s%n", beerConsumer01.shouldConsumeBeer(beerBottle01));
        System.out.println("-------");


    }
}
