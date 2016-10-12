package aaki.component.data.type;

/**
 * Created by skkim on 8/25/16.
 */
 class BaseDataTypeImplement<T> implements BaseDataTypeInterface<T> {

    private T mTypeValue = null;
    private Class<T> mClassType = null;

    @Override
    public T getData() {
        return mTypeValue;
    }

    @Override
    public void setData(T _value) {
        mTypeValue = _value;
    }

    @Override
    public TypeObject<T> get() {
        return new TypeObject<> (mTypeValue);
    }

    @Override
    public void set(TypeObject _typeObject) {
        set(_typeObject.get());
    }

    @Override
    public String getType() {

        return mTypeValue.getClass().getSimpleName().toLowerCase();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof BaseDataTypeImplement
                && mTypeValue != null
                && mTypeValue.equals(((BaseDataTypeImplement) o).mTypeValue);
    }
}
