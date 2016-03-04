package org.visitor.implementation.item;

import org.visitor.implementation.visitor.CleaningVisitor;
import org.visitor.implementation.visitor.PaymentVisitor;
import org.visitor.interfaces.item.VisitableItem;
import org.visitor.interfaces.visitor.Visitor;

/**
 * Created by blisss05 on 3/2/2016.
 */
public class OfficeOne implements VisitableItem {

    public final int roomQuantity = 10;
    public final int employeeQuantity = 5;
    public final int employeeRate = 2;

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
