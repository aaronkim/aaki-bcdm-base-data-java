package bcdm.base.data;

import bcdm.base.data.type.ValueImplement;

/**
 * Created by skkim on 8/25/16.
 */
public class DataOld extends ValueImplement {

    public DataOld(final String _nameString, final ValueImplement _value) {
        super( _value == null ? new ValueImplement(Object.class, _nameString) : _value);
    }

    public DataOld(final DataOld _data) {
        this(_data.getName(), _data);
    }

    public DataOld(final String _nameString, final Integer _value) {
        super(_nameString, _value);
//        this(_nameString, new Value<Integer>(Integer.class, _value));
    }

    public DataOld(final String _nameString, final Short _value) {
        this(_nameString, new ValueImplement(_nameString, _value));
    }

    public DataOld(final String _nameString, final Long _value) {
        this(_nameString, new ValueImplement(_nameString, _value));
    }

    public DataOld(final String _nameString, final Double _value) {
        this(_nameString, new ValueImplement(_nameString, _value));
    }

    public DataOld(final String _nameString, final Float _value) {
        this(_nameString, new ValueImplement(_nameString, _value));
    }

    public DataOld(final String _nameString, final Boolean _value) {
        this(_nameString, new ValueImplement(_nameString, _value));
    }

    public DataOld(final String _nameString, final String _value) {
        this(_nameString, new ValueImplement(_nameString, _value));
    }

    public ValueImplement getValue() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        getName();
        getValue().getData();

        return super.equals(o);
    }
}
