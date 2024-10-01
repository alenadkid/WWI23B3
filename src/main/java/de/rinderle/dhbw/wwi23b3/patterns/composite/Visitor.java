package de.rinderle.dhbw.wwi23b3.patterns.composite;

import java.awt.*;

public interface Visitor {

    void visit(CustomDirectory directory);
    void visit(CustomFile file);

}
