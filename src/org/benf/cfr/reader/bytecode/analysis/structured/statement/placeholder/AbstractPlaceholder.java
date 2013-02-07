package org.benf.cfr.reader.bytecode.analysis.structured.statement.placeholder;

import org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement;
import org.benf.cfr.reader.bytecode.analysis.parse.utils.BlockIdentifier;
import org.benf.cfr.reader.bytecode.analysis.structured.StructuredStatement;
import org.benf.cfr.reader.bytecode.analysis.structured.StructuredStatementTransformer;
import org.benf.cfr.reader.util.output.Dumper;

import java.util.List;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 24/01/2013
 * Time: 06:05
 */
public abstract class AbstractPlaceholder implements StructuredStatement {
    @Override
    public void linearizeInto(List<StructuredStatement> out) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isProperlyStructured() {
        return false;
    }

    @Override
    public void transformStructuredChildren(StructuredStatementTransformer transformer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuredStatement informBlockHeirachy(Vector<BlockIdentifier> blockIdentifiers) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuredStatement claimBlock(Op04StructuredStatement innerBlock, BlockIdentifier blockIdentifier, Vector<BlockIdentifier> blocksCurrentlyIn) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setContainer(Op04StructuredStatement container) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void dump(Dumper dumper) {
    }
}