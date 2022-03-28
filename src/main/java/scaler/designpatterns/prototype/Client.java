package scaler.designpatterns.prototype;

import scaler.designpatterns.prototype.addons.ChocoScoop;
import scaler.designpatterns.prototype.addons.VanillaScoop;
import scaler.designpatterns.prototype.cones.ChocolateCone;
import scaler.designpatterns.prototype.cones.OrangeCone;
import scaler.designpatterns.prototype.cones.VanillaCone;

public class Client {
    public static void main(String[] args) {
        IceCreamRegistry iceCreamRegistry = new IceCreamRegistry();

        IceCream chocoVanillaOrangeChoco =
                new ChocoScoop(
                    new VanillaScoop(
                        new OrangeCone(
                                new ChocolateCone()
                        )
                    )
                );

        IceCream chocoVanillaChocoOrangeVanilla = new ChocoScoop(
                new VanillaScoop(
                        new ChocolateCone(
                                new OrangeCone(
                                        new VanillaCone()
                                )
                        )
                )
        );

        iceCreamRegistry.put(IceCreamMenu.YUMMY, chocoVanillaOrangeChoco);
        iceCreamRegistry.put(IceCreamMenu.WOW, chocoVanillaChocoOrangeVanilla);

        IceCream clone = iceCreamRegistry.get(IceCreamMenu.YUMMY);

        IceCream order = new ChocoScoop(clone);

        System.out.println(order);


    }
}


