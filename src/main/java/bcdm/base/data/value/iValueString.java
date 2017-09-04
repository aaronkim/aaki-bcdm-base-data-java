package bcdm.base.data.value;

import bcdm.base.data.api.iValue;

/**
 * Created by skkim on 6/7/17.
 */

interface iValueString extends iValue<String> {
	final static int UNLIMITED_LENGTH = -1;

	@Override
	void set(String _value);

	@Override
	String get();

	int MAX_LENGTH();

	String FORMAT();
}
