package bcdm.base.data.value;

import bcdm.base.data.api.iValue;

/**
 * Created by skkim on 5/12/17.
 */

interface iValueNumber<T extends Number> extends iValue<T> {
	T UNIT();
	T STEP();
	T MIN();
	T MAX();

	T increase();
	T decrease();
}
