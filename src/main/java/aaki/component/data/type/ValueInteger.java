package aaki.component.data.type;

/**
 * Created by skkim on 10/11/16.
 */
class ValueInteger extends ValueObject<Integer> {
	public ValueInteger(final String _name) {
		super(Integer.class, _name);
	}

	public ValueInteger(final String _name, final Integer _data) {
		super(Integer.TYPE, _name, _data);
	}

	public ValueInteger(final String _name, final Short _data) {
		super(Integer.TYPE, _name, (int)_data);
	}

	public ValueInteger(final ValueInteger _typeObject) {
		super(_typeObject);
	}
}
