package aaki.component.data.type;

/**
 * Created by skkim on 8/25/16.
 */
interface BaseDataTypeInterface<T> {

    public T getData();

    public void setData(T _value);

    public TypeObject get();

    public void set(TypeObject _typeObject);

    public String getType();
}
