package org.visitor.implementation.visitor;

import org.visitor.implementation.item.OfficeOne;
import org.visitor.implementation.item.OfficeTwo;
import org.visitor.implementation.item.Cafeteria;
import org.visitor.interfaces.visitor.Visitor;

/**
 * Created by blisss05 on 3/2/2016.
 */
public class CleaningVisitor implements Visitor {

    private int averageToTimeCleanARoom = 2;
    private int averageToTimeCleanCafeteriaRoom = 3;

    @Override
    public int visit(OfficeOne officeOne) {
        int timeToClean = officeOne.roomQuantity * averageToTimeCleanARoom;
        return timeToClean;
    }

    @Override
    public int visit(OfficeTwo officeTwo) {
        int timeToClean = officeTwo.roomQuantity * averageToTimeCleanARoom;
        return timeToClean;
    }

    @Override
    public int visit(Cafeteria cafeteria) {
        int timeToClean = cafeteria.roomQuantity * averageToTimeCleanCafeteriaRoom;
        return timeToClean;
    }
}
