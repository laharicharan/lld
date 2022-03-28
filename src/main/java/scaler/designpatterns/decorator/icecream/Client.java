package scaler.designpatterns.decorator.icecream;

import scaler.designpatterns.decorator.icecream.addons.ChocoScoop;
import scaler.designpatterns.decorator.icecream.addons.VanillaScoop;
import scaler.designpatterns.decorator.icecream.cones.ChocolateCone;
import scaler.designpatterns.decorator.icecream.cones.OrangeCone;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream =
                new ChocoScoop(
                    new VanillaScoop(
                        new OrangeCone(
                                new ChocolateCone()
                        )
                    )
                );

        System.out.println(iceCream.getComposition());

//        IceCream iceCream1 = new VanillaScoop(null);

        IceCream iceCream1 = new OrangeCone();
        System.out.println(iceCream1.getComposition());
        System.out.println(iceCream1.getCost());
    }
}


