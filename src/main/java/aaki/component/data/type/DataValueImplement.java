package aaki.component.data.type;

class DataValueImplement<T> implements DataValue<T> {

    public final static  DataValueImplement<Object> NULL = new DataValueImplement<>("null");

    private final String mName;
    private T mValue = null;

    protected DataValueImplement(final String _name, final T _value) {
        mName = (_name == null) ? NULL.getName() : _name;
        mValue = _value;
    }

    protected DataValueImplement(final String _name) {
        this(_name, (T) null);
    }

    protected DataValueImplement(final DataValue<T> _dataValue) {
        this(_dataValue == null ? null : _dataValue.getName(), _dataValue == null ? null : _dataValue.getData());
    }

    @Override
    public String getName() {
        return mName;
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
                && getName() != null
                && getName().equals(((DataValueImplement) o).getName())
                && getData() != null
                && getData().equals(((DataValueImplement) o).getData());
    }
}
