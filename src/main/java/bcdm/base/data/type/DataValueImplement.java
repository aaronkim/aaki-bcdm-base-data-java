package bcdm.base.data.type;

import java.util.UUID;

class DataValueImplement<T> implements DataValue<T> {
    protected String TAG = getClass().getSimpleName();
    protected boolean DEBUG = true; //BuildConfig.DEBUG;

    public final static  DataValueImplement<Object> NULL = new DataValueImplement<>(new Object());

    private final UUID mUUID;
    private T mValue = null;

    private DataValueImplement(final UUID _uuid, final T _value) {
        mUUID = _uuid;
        mValue = _value;
    }

    DataValueImplement(final T _value) {
        this(UUID.randomUUID(), _value);
    }

    DataValueImplement(final DataValue<T> _dataValue) {
        this(_dataValue == null ? null : _dataValue.getUUID(), _dataValue == null ? null : _dataValue.getData());
    }

    @Override
    public UUID getUUID() {
        return mUUID;
    }

    @Override
    public T getData() {
        return mValue;
    }

    @Override
    public void setData(final T _data) {
        mValue = _data;
    }

    @Override
    public boolean equals(Object o) {
        return o != null
                && o instanceof DataValueImplement
                && getUUID() != null
                && getUUID().equals(((DataValueImplement) o).getUUID())
                && getData() != null
                && getData().equals(((DataValueImplement) o).getData());
    }
}
