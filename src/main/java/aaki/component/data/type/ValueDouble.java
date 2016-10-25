package aaki.component.data.type;

/**
 * Created by skkim on 10/11/16.
 */
class ValueDouble extends ValueObject<Double> {
	public ValueDouble(final String _name) {
		super(Double.TYPE, _name);
	}

	public ValueDouble(final String _name, final Double _value) {
		super(Double.TYPE, _name, _value);
	}

	public ValueDouble(final String _name, final Float _value) {
		super(Double.TYPE, _name, (double)_value);
	}

	public ValueDouble(final ValueDouble _typeObject) {
		super(_typeObject);
	}

}
