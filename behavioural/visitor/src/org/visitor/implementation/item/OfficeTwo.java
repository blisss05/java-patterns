package org.visitor.implementation.item;

import org.visitor.implementation.visitor.CleaningVisitor;
import org.visitor.implementation.visitor.PaymentVisitor;
import org.visitor.interfaces.item.VisitableItem;

/**
 * Created by blisss05 on 3/2/2016.
 */
public class OfficeTwo implements VisitableItem {

    public final int roomQuantity = 20;
    public final int employeeQuantity = 10;
    public final int employeeRate = 3;

    @Override
    public int accept(CleaningVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public int accept(PaymentVisitor visitor) {
        return visitor.visit(this);
    }
}
