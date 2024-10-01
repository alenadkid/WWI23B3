package de.rinderle.dhbw.wwi23b3.patterns.builder;

import de.rinderle.dhbw.wwi23b3.patterns.composite.CustomDirectory;
import de.rinderle.dhbw.wwi23b3.patterns.composite.CustomFile;
import de.rinderle.dhbw.wwi23b3.patterns.composite.Visitor;

public class SizeVisitor implements Visitor {

    int sumSize = 0;

    @Override
    public void visit(CustomDirectory directory) {
        sumSize += directory.getSize();
    }

    @Override
    public void visit(CustomFile file) {
        sumSize += file.getSize();
    }

    public int getSumSize() {
        return sumSize;
    }
}
