package aaki.component.data.type;

/**
 * Created by skkim on 10/11/16.
 */
public final class ValueLong extends ValueObject<Long> {
	public ValueLong(final String _name) {
		this(_name, (Long)null);
	}

	public ValueLong(final String _name, final Long _data) {
		super(Long.TYPE, _name, _data);
	}

	public ValueLong(final String _name, final Integer _data) {
		this(_name, _data == null ? null : _data.longValue());
	}

	public ValueLong(final String _name, final Short _data) {
		this(_name, _data == null ? null : _data.longValue());
	}

	public ValueLong(ValueLong _typeObject) {
		super(_typeObject);
	}

	public ValueLong(ValueInteger _typeObject) {
		this(_typeObject.getName(), _typeObject.getData());
	}
}
