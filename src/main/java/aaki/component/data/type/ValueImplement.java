package aaki.component.data.type;

import java.util.UUID;

/**
 * Created by skkim on 8/25/16.
 */
public class ValueImplement implements DataType, DataValue {
    DataTypeImplement mTypeObject = null;

//    protected Value(final Class<T> _dataClass, final T _value) {
//        mTypeObject = Value.convertTypeObject(_dataClass, _value);
//    }
//
//    protected Value(final Class<T> _dataClass) {
//        this(_dataClass, null);
//    }

    private String mName;
    public ValueImplement(final Class<?> _dataClass, final String _name, final Object _value) {
        mTypeObject = ValueImplement.convertTypeObject(_dataClass, _name, _value);
        mName = _name;
    }

    public ValueImplement(final Class<?> _dataClass, final String _name) {
        this(_dataClass, _name, null);
    }

    public ValueImplement(final String _name, final Integer _value) {
        this(Integer.class, _name, _value);
    }

    public ValueImplement(final String _name, final Long _value) {
        this(Long.class, _name, _value);
    }

    public ValueImplement(final String _name, final Short _value) {
        this(Short.class, _name, _value);
    }

    public ValueImplement(final String _name, final Double _value) {
        this(Double.class, _name, _value);
    }

    public ValueImplement(final String _name, final Float _value) {
        this(Float.class, _name, _value);
    }

    public ValueImplement(final String _name, final Boolean _value) {
        this(Boolean.class, _name, _value);
    }

    public ValueImplement(final String _name, final String _value) {
        this(String.class, _name, _value);
    }

    public ValueImplement(final ValueImplement _value) {
        mTypeObject = _value.getTypeObject();
    }


    private static DataTypeImplement convertTypeObject(final Class<?> _dataClass, final String _name, final Object _value) {
        Class<?> clazz = _dataClass;

        if(_dataClass == null) {
            clazz = Object.class;
        }

        if (Integer.class.isAssignableFrom(clazz)) {

           return (_value == null) ? new ValueInteger(_name) : new ValueInteger(_name, (Integer)_value);

        } else if (Long.class.isAssignableFrom(clazz)) {

            return (_value == null) ? new ValueLong(_name) : new ValueLong(_name, (Long) _value);

        } else if (Double.class.isAssignableFrom(clazz)) {

            return (_value == null) ? new ValueDouble(_name) : new ValueDouble(_name, (Double)_value);

        } else if (Float.class.isAssignableFrom(clazz)) {

            return (_value == null) ? new ValueDouble(_name) : new ValueDouble(_name, (Float)_value);

        } else if (Boolean.class.isAssignableFrom(clazz)) {

            return (_value == null) ? new ValueBoolean(_name) : new ValueBoolean(_name, (Boolean) _value);

        } else if (String.class.isAssignableFrom(clazz)) {

            return (_value == null) ? new ValueString(_name) : new ValueString(_name, (String) _value);

        } else {

            return new ValueObject<Object>(Object.class, _name, null);

        }
    }

    protected final DataTypeImplement getTypeObject() {
        return mTypeObject == null ? ValueImplement.convertTypeObject(Object.class, mName, null) : mTypeObject;
    }

    protected void setTypeObject(DataTypeImplement _typeObject) {
        if (_typeObject == null) {
            mTypeObject = ValueImplement.convertTypeObject(Object.class, mName, null);
        } else {
            mTypeObject = _typeObject;
        }
    }

    public void setValue(ValueImplement _value) {
        if (_value == null) {
            mTypeObject = ValueImplement.convertTypeObject(Object.class, mName, null);
        } else {
            mTypeObject = _value.getTypeObject();
        }
    }


    @Override
    public String getDataType() {
        return mTypeObject.getDataType();
    }

    @Override
    public Class getDataClass() {
        if (mTypeObject == null) {
            return Object.class;
        } else {
            return mTypeObject.getDataClass();
        }
    }

    @Override
    public String getName() {
        return mTypeObject.getName();
    }

    @Override
    public UUID getUUID() {
        return mTypeObject.getUUID();
    }

    @Override
    public Object getData() {
        return mTypeObject.getData();
    }

    @Override
    public void setData(final Object _data) {
        mTypeObject = ValueImplement.convertTypeObject(_data.getClass(), getName(), _data);
//        mTypeObject.setData(_data);
    }
}
