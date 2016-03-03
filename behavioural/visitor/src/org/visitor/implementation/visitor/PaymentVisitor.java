package org.visitor.implementation.visitor;

import org.visitor.implementation.item.OfficeOne;
import org.visitor.implementation.item.OfficeTwo;
import org.visitor.interfaces.visitor.Visitor;

/**
 * Created by blisss05 on 3/2/2016.
 */
public class PaymentVisitor implements Visitor {

    @Override
    public int visit(OfficeOne officeOne) {
        return 0;
    }

    @Override
    public int visit(OfficeTwo officeTwo) {
        return 0;
    }
}
