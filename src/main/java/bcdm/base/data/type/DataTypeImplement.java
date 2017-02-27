package bcdm.base.data.type;

import java.util.UUID;

/**
 * Created by skkim on 8/25/16.
 */
class DataTypeImplement<T> implements DataType<T>, DataValue<T> {
    protected String TAG = getClass().getSimpleName();
    protected boolean DEBUG = true; //BuildConfig.DEBUG;

    private final Class<T> mDataClassType;
    private final String mName;
    private DataValue<T> mDataValue = null;

    private DataTypeImplement(final Class<T> _dataClass, final String _name, final DataValue<T> _valueObject) {
        mName = _name;
        mDataClassType = _dataClass;
        mDataValue = _valueObject;
    }

    DataTypeImplement(final Class<T> _dataClass, final String _name) {
        this(_dataClass, _name, new DataValueImplement<T>((T)null));
    }

    DataTypeImplement(final Class<T> _dataClass, final String _name, final T _value) {
        this(_dataClass, _name, new DataValueImplement<T>(_value));
    }

    DataTypeImplement(final DataType<T> _typeObject) {
        this(_typeObject == null ? null : _typeObject.getDataClass(),
                (_typeObject == null) ? null : _typeObject.getName(),
                (_typeObject == null) ? null : ((DataTypeImplement<T>)_typeObject).mDataValue);
    }

    @Override
    public String getDataType() {

        return getDataClass().getSimpleName();
    }

    @Override
    public Class<T> getDataClass() {

        return mDataClassType;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public UUID getUUID() {
        return mDataValue == null ? null : mDataValue.getUUID();
    }

    @Override
    public T getData() {
        return mDataValue == null ? null : mDataValue.getData();
    }

    @Override
    public void setData(T _data) {
        if (mDataValue == null) {
            mDataValue = new DataValueImplement<T>(_data);
        } else {
            mDataValue.setData(_data);
        }
    }

    @Override
    public boolean equals(Object o) {
        return o != null
                && o instanceof DataType
                && super.equals(o)
                && getDataClass() != null
                && getDataClass().equals(((DataType) o).getDataClass());
    }


}
