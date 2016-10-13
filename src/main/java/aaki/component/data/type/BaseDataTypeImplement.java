package aaki.component.data.type;

/**
 * Created by skkim on 8/25/16.
 */
 class BaseDataTypeImplement<T> implements BaseDataTypeInterface<T> {

    private T mValue = null;
    private Class<T> mClassType = null;

    protected BaseDataTypeImplement(Class<T> _class) {
        mClassType = _class;
    }

    @Override
    public T getData() {
        return mValue;
    }

    @Override
    public void setData(final T _value) {
        mValue = _value;
    }

    @Override
    public void setObject(TypeObject<T> _typeObject) {
        setData(_typeObject.getData());
    }

    @Override
    public String getDataType() {

        return getDataClass().toString();
    }

    private Class<T> getDataClass() {

        return mClassType;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof BaseDataTypeImplement
                && mValue != null
                && mValue.equals(((BaseDataTypeImplement) o).mValue);
    }
}
