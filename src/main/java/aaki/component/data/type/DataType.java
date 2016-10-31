package aaki.component.data.type;

/**
 * Created by skkim on 8/25/16.
 */
public interface DataType<T> extends DataValue<T> {

    public String getName();

    public String getDataType();

    public Class<T> getDataClass();
}
