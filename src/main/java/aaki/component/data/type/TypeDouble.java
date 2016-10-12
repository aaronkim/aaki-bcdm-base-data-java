package aaki.component.data.type;

/**
 * Created by skkim on 10/11/16.
 */
class TypeDouble extends TypeObject<Double> {
	public TypeDouble() {
		super();
	}

	public TypeDouble(final Double _value) {
		super(_value);
	}

	public TypeDouble(final TypeDouble _object) {
		super(_object);
	}
}
