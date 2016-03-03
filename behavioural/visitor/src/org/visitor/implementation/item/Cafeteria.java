package org.visitor.implementation.item;

import org.visitor.implementation.visitor.CleaningVisitor;
import org.visitor.implementation.visitor.PaymentVisitor;
import org.visitor.interfaces.item.VisitableItem;

/**
 * Created by vzhemev on 3/2/2016.
 */
public class Cafeteria implements VisitableItem {

    public final int roomQuantity = 3;
    public final int employeeQuantity = 2;
    public final int employeeRate = 1;

    @Override
    public int accept(CleaningVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public int accept(PaymentVisitor visitor) {
        return visitor.visit(this);
    }
}
