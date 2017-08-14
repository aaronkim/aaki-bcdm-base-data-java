package bcdm.base.data.value;

/**
 * Created by skkim on 5/12/17.
 */

public final class ValueDouble extends ValueNumber<Double> {

	public ValueDouble(final String _name, final ValueDouble _value) {
		super(_name, _value);
	}

	public ValueDouble(final String _name, final double _unit, double _step, double _min, double _max) {
		super(_name, _unit, _step, _min, _max);
	}

	@Override
	protected Double onIncrease(final Double _a, final Double _b) {
		return _a + _b;
	}

	@Override
	protected Double onDecrease(final Double _a, final Double _b) {
		return _a - _b;
	}

	@Override
	protected int onCompare(final Double _a, final Double _b) {
		if(_a > _b) {
			return 1;
		} else if(_a < _b) {
			return -1;
		}

		return 0;
	}
}
