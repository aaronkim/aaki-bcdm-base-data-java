package aaki.component.data.type;

/**
 * Created by skkim on 8/25/16.
 */
public interface DataType<T> {

    public String getDataType();

    public Class<T> getDataClass();
}
