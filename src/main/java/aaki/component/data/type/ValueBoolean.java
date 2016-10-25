package aaki.component.data.type;

/**
 * Created by skkim on 10/11/16.
 */
class ValueBoolean extends ValueObject<Boolean> {

	public ValueBoolean(final String _name) {
		super(Boolean.TYPE, _name);
	}

	public ValueBoolean(final String _name, Boolean _value) {
		super(Boolean.TYPE, _name, _value);
	}

	public ValueBoolean(final ValueBoolean _typeObject) {
		super(_typeObject);
	}
}
