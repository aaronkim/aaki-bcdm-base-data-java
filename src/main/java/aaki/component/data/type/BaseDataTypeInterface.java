package aaki.component.data.type;

/**
 * Created by skkim on 8/25/16.
 */
interface BaseDataTypeInterface<T> {

    public T getData();

    public void setData(T _value);

    public void setObject(TypeObject<T> _typeObject);

    public String getDataType();

//    public Class<T> getDataClass();
}
