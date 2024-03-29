package model.values;

import model.types.IType;
import model.types.IntType;

public class IntValue implements IValue {
    int val;

    public IntValue(int v) {
        val = v;
    }

    public int getVal() {
        return val;
    }

    public String toString() {
        return String.valueOf(val);
    }

    public IType getType() {
        return new IntType();
    }

    @Override
    public IValue deepcopy() {
        return new IntValue(val);
    }
}