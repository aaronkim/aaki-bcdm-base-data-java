package aaki.component.data.type;

/**
 * Created by skkim on 8/25/16.
 */
class DataTypeImplement<T> implements DataType<T>, DataValue<T> {
    protected String TAG = getClass().getSimpleName();
    protected boolean DEBUG = true; //BuildConfig.DEBUG;

    private final Class<T> mDataClassType;
    private DataValueImplement<T> mDataValue = null;

    protected DataTypeImplement(final Class<T> _dataClass) {
        this(_dataClass, null, (T)null);
    }

    protected DataTypeImplement(final Class<T> _dataClass, final String _name, final T _value) {
        mDataClassType = _dataClass;
        mDataValue = new DataValueImplement<T>(_name, _value);
    }

    protected DataTypeImplement(final DataTypeImplement<T> _typeObject) {
        this(_typeObject == null ? null : _typeObject.getDataClass(),
                (_typeObject == null) ? null : _typeObject.getName(),
                (_typeObject == null) ? null : _typeObject.getData());
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
        return mDataValue == null ? null : mDataValue.getName();
    }

    @Override
    public T getData() {
        return mDataValue == null ? null : mDataValue.getData();
    }

    @Override
    public void setData(T _data) {
        if (mDataValue != null) {
            mDataValue.setData(_data);
        }
    }

    @Override
    public boolean equals(Object o) {
        return o != null
                && o instanceof DataTypeImplement
                && super.equals(o)
                && getDataClass() != null
                && getDataClass().equals(((DataTypeImplement) o).getDataClass());
    }


}
