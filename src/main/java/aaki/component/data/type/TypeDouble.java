package aaki.component.data.type;

/**
 * Created by skkim on 10/11/16.
 */
class TypeDouble extends TypeObject<Double> {
	public TypeDouble() {
		super(Double.TYPE);
	}

	public TypeDouble(final double _value) {
		super(Double.TYPE, _value);
	}

	public TypeDouble(final float _value) {
		super(Double.TYPE, (double)_value);
	}

	public TypeDouble(final TypeDouble _object) {
		super(Double.TYPE, _object);
	}
}
