package aaki.component.data.value;

/**
 * Created by skkim on 10/11/16.
 */
public final class ValueInteger extends ValueObject<Integer> {

	public ValueInteger(final String _name, final Integer _data) {
		super(Integer.TYPE, _name, _data);
	}

	public ValueInteger(final String _name) {
		this(_name, (Integer)null);
	}

	public ValueInteger(final String _name, final Short _data) {
		this(_name, _data == null ? null : _data.intValue());
	}

	public ValueInteger(final ValueInteger _typeObject) {
		super(_typeObject);
	}
}
