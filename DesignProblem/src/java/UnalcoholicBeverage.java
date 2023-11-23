import itadesign.beerdrinker.BeerBottle;

public class UnalcoholicBeverage implements BeerBottle {

    private double volumeInLiters;
    private double alcoholContentInPercent;

    public UnalcoholicBeverage(double volumeInLiters, double alcoholContentInPercent) {
        this.volumeInLiters = volumeInLiters;
        this.alcoholContentInPercent = alcoholContentInPercent;
    }

    @Override
    public double getAlcoholContentInPercent() {
        return alcoholContentInPercent;
    }

    @Override
    public double getVolumeInLiters() {
        return volumeInLiters;
    }

    @Override
    public void takeASip(double v) {

    }
}
