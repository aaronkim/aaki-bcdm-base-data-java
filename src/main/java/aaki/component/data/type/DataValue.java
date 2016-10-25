package aaki.component.data.type;

/**
 * Created by skkim on 10/18/16.
 */
public interface DataValue<T> {

	public String getName();

	public T getData();

	public void setData(final T _data);
}
