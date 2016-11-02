package aaki.component.data.value;

/**
 * Created by skkim on 10/11/16.
 */
public final class ValueBoolean extends ValueObject<Boolean> {

	public ValueBoolean(final String _name) {
		this(_name, (Boolean)null);
	}

	public ValueBoolean(final String _name, final Boolean _value) {
		super(Boolean.TYPE, _name, _value);
	}

	public ValueBoolean(final ValueBoolean _typeObject) {
		super(_typeObject);
	}
}
