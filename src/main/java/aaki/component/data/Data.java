package aaki.component.data;

import aaki.component.data.type.Value;

/**
 * Created by skkim on 8/25/16.
 */
public class Data extends Value {

    public Data(final String _nameString, final Value _value) {
        super( _value == null ? new Value(Object.class, _nameString) : _value);
    }

    public Data(final Data _data) {
        this(_data.getName(), _data);
    }

    public Data(final String _nameString, final Integer _value) {
        super(_nameString, _value);
//        this(_nameString, new Value<Integer>(Integer.class, _value));
    }

    public Data(final String _nameString, final Short _value) {
        this(_nameString, new Value(_nameString, _value));
    }

    public Data(final String _nameString, final Long _value) {
        this(_nameString, new Value(_nameString, _value));
    }

    public Data(final String _nameString, final Double _value) {
        this(_nameString, new Value(_nameString, _value));
    }

    public Data(final String _nameString, final Float _value) {
        this(_nameString, new Value(_nameString, _value));
    }

    public Data(final String _nameString, final Boolean _value) {
        this(_nameString, new Value(_nameString, _value));
    }

    public Data(final String _nameString, final String _value) {
        this(_nameString, new Value(_nameString, _value));
    }

    public Value getValue() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        getName();
        getValue().getData();

        return super.equals(o);
    }
}
