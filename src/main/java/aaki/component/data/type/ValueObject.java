package aaki.component.data.type;

/**
 * Created by skkim on 10/11/16.
 */
class ValueObject<T> extends DataTypeImplement<T> {

	public ValueObject(final Class<T> _DataClass) {
		super(_DataClass);
	}

	public ValueObject(final Class<T> _DataClass, final String _name) {
		super(_DataClass, _name, null);
	}

	public ValueObject(final Class<T> _DataClass, final String _name, final T _value) {
		super(_DataClass, _name, _value);
	}

	public ValueObject(ValueObject<T> _object) {
		super(_object);
	}
}
