package org.visitor;

import org.visitor.implementation.item.Cafeteria;
import org.visitor.implementation.item.OfficeOne;
import org.visitor.implementation.item.OfficeTwo;
import org.visitor.implementation.visitor.CleaningVisitor;
import org.visitor.implementation.visitor.PaymentVisitor;
import org.visitor.interfaces.item.VisitableItem;

/**
 * Created by blisss05 on 3/2/2016.
 */
public class VisitorApp {

    public static void main(String[] args) {
        VisitableItem[] items = {new OfficeOne(), new OfficeTwo(), new Cafeteria()};

        int cleaningTimeHours = 0;
        int $payment$ = 0;

        CleaningVisitor cleaningVisitor = new CleaningVisitor();
        PaymentVisitor paymentVisitor = new PaymentVisitor();

        for (VisitableItem item : items) {
            cleaningTimeHours += item.accept(cleaningVisitor);
            $payment$ += item.accept(paymentVisitor);
        }
        System.out.println("You need [ " + cleaningTimeHours + " ] hours to clean all items.");
        System.out.println("You need [ " + $payment$ + " ] bucks to pay all items.");
    }
}
