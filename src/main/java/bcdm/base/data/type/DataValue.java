package bcdm.base.data.type;

import java.util.UUID;

/**
 * Created by skkim on 10/18/16.
 */
public interface DataValue<T> {

	public UUID getUUID();

	public T getData();

	public void setData(final T _data);
}
