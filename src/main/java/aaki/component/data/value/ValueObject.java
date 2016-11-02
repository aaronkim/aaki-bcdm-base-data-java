package aaki.component.data.value;

/**
 * Created by skkim on 10/11/16.
 */
class ValueObject<T> extends DataTypeImplement<T> {

	protected ValueObject(final Class<T> _DataClass, final String _name, final T _value) {
		super(_DataClass, _name, _value);
	}

	protected ValueObject(ValueObject<T> _object) {
		super(_object);
	}


}
