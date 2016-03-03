package org.visitor.implementation.visitor;

import org.visitor.implementation.item.OfficeOne;
import org.visitor.implementation.item.OfficeTwo;
import org.visitor.implementation.item.Cafeteria;
import org.visitor.interfaces.visitor.Visitor;

/**
 * Created by blisss05 on 3/2/2016.
 */
public class PaymentVisitor implements Visitor {

    @Override
    public int visit(OfficeOne officeOne) {
        int $payment$ = officeOne.employeeQuantity * officeOne.employeeRate;
        return $payment$;
    }

    @Override
    public int visit(OfficeTwo officeTwo) {
        float specialDiscount = 2;
        int $payment$ = officeTwo.employeeQuantity * officeTwo.employeeRate / 2;
        return $payment$;
    }

    @Override
    public int visit(Cafeteria cafeteria) {
        int $payment$ = cafeteria.employeeQuantity * cafeteria.employeeRate / 2;
        return $payment$;
    }
}
