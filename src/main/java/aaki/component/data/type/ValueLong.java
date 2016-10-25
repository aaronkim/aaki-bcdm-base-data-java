package aaki.component.data.type;

/**
 * Created by skkim on 10/11/16.
 */
class ValueLong extends ValueObject<Long> {
	public ValueLong(final String _name) {
		super(Long.TYPE, _name);
	}

	public ValueLong(final String _name, final Long _data) {
		super(Long.TYPE, _name, _data);
	}

	public ValueLong(final String _name, final Integer _data) {
		super(Long.TYPE, _name, (long)_data);
	}

	public ValueLong(final String _name, final Short _data) {
		super(Long.TYPE, _name, (long)_data);
	}

	public ValueLong(ValueLong _typeObject) {
		super(_typeObject);
	}

	public ValueLong(ValueInteger _typeObject) {
		this(_typeObject.getName(), _typeObject.getData());
	}
}
