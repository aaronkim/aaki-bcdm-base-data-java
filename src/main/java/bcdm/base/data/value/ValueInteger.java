package bcdm.base.data.value;

/**
 * Created by skkim on 5/12/17.
 */

public final class ValueInteger extends ValueNumber<Integer> {

	public ValueInteger(final String _name, final ValueInteger _value) {
		super(_name, _value);
	}

	public ValueInteger(final String _name, final int _unit, final int _step, final int _min, final int _max) {
		super(_name, _unit, _step, _min, _max);
	}

	@Override
	protected Integer onIncrease(final Integer _a, final Integer _b) {
		return _a + _b;
	}

	@Override
	protected Integer onDecrease(final Integer _a, final Integer _b) {
		return _a - _b;
	}

	@Override
	protected int onCompare(final Integer _a, final Integer _b) {
		if(_a > _b) {
			return 1;
		} else if(_a < _b) {
			return -1;
		}

		return 0;
	}
}
