package aaki.component.data.value;

/**
 * Created by skkim on 10/11/16.
 */
public final class ValueDouble extends ValueObject<Double> {
	public ValueDouble(final String _name) {
		this(_name, (Double)null);
	}

	public ValueDouble(final String _name, final Double _value) {
		super(Double.TYPE, _name, _value);
	}

	public ValueDouble(final String _name, final Float _value) {
		this(_name, _value == null ? null : _value.doubleValue());
	}

	public ValueDouble(final ValueDouble _typeObject) {
		super(_typeObject);
	}

}
