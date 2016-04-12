package org.template;

import org.template.impl.RegularSandwich;
import org.template.impl.VegetarianSandwich;
import org.template.interf.Sandwich;

import javax.xml.transform.sax.SAXSource;

/**
 * Created by vzhemev on 4/12/2016.
 */
public class TemplateApp {

    public static void main(String[] args) {

        /**
         * In this example we have an abstract class Sandwich
         * which has a template method "makeSandwich" which
         * can prepare different types of sandwiches
         */
        Sandwich sandwichR = new RegularSandwich();
        Sandwich sandwichV = new VegetarianSandwich();

        System.out.println("Regular sandwich");
        sandwichR.makeSandwich();

        System.out.println("\nVegetarian sandwich");
        sandwichV.makeSandwich();
    }
    /**
     * Output:
     *
     * Regular sandwich
     * Making your sandwich...
     * Prepared a bun...
     * Added vegetable..
     * Added meat..
     * Your sandwich is ready!

     * Vegetarian sandwich
     * Making your sandwich...
     * Prepared a bun...
     * Added vegetable..
     * Added more spices...
     * Your sandwich is ready!
     *
     */
}
