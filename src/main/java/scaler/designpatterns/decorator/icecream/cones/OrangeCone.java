package scaler.designpatterns.decorator.icecream.cones;

import scaler.designpatterns.decorator.icecream.IceCream;

import java.security.InvalidParameterException;

public class OrangeCone implements IceCream {
    private IceCream iceCream;

    public OrangeCone() {}

    public OrangeCone(IceCream iceCream) {
        if (iceCream == null) {
            throw new InvalidParameterException();
        }

        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        int cost = ConeCosts.ORANGE_COST;

        if (this.iceCream != null) {
            cost += iceCream.getCost();
        }

        return cost;
    }

    @Override
    public String getComposition() {
        String desc = "Orange Cone";

        if (this.iceCream != null) {
            desc = this.iceCream.getComposition() + " " + desc;
        }

        return desc;
    }

    @Override
    public boolean hasIngredient() {
        return false;
    }
}
