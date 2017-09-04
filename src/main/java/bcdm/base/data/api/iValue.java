package bcdm.base.data.api;

/**
 * Created by skkim on 5/12/17.
 */

public interface iValue<T> {
	String NAME();

	void set(T _value);

	T get();
}
