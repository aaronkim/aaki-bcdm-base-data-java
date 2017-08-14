package bcdm.base.data.value;

import bcdm.base.data.api.iValue;

/**
 * Created by skkim on 6/7/17.
 */

class ValueObject <T extends Object> implements iValue<T> {

	private final String mName;
	private T mValue;

	ValueObject(final String _name) {
		mName = _name;
	}

	@Override
	public String NAME() {
		return mName;
	}

	@Override
	public void set(T _value) {
		mValue = _value;
	}

	@Override
	public T get() {
		return mValue;
	}
}
