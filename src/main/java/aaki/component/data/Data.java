package aaki.component.data;

import aaki.component.data.type.Name;
import aaki.component.data.type.Value;

/**
 * Created by skkim on 8/25/16.
 */
public class Data {
    private Name mName = null;
    private Value mValue    = null;

    public Data(final Data _data) {
        this.mName = _data.mName;
        this.mValue = _data.mValue;
    }

    public Data(final Name _name, final Value _value) {
        this.mName = _name;
        this.mValue = _value;
    }

    public Data(final String _nameString, final Object _valueObject) {
        this.mName = new Name(_nameString);
        this.mValue = new Value(_valueObject);
    }

    public String getName() {
        return this.mName.getData();
    }

    public Value getValue() {
        return this.mValue;
    }

    public void setValue(Value _value) {
        this.mValue = _value;
    }

    @Override
    public boolean equals(Object o) {
        getName();
        getValue().getData();

        return super.equals(o);
    }
}
