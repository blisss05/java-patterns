package org.visitor.interfaces.visitor;

import org.visitor.implementation.item.OfficeOne;
import org.visitor.implementation.item.OfficeTwo;
import org.visitor.implementation.item.Cafeteria;

/**
 * Created by blisss05 on 3/2/2016.
 */
public interface Visitor {

    public int visit(OfficeOne officeOne);

    public int visit(OfficeTwo officeTwo);

    public int visit(Cafeteria cafeteria);
}
