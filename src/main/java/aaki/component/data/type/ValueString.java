package aaki.component.data.type;

/**
 * Created by skkim on 10/11/16.
 */
class ValueString extends ValueObject<String> {
	public ValueString(final String _name) {
		super(String.class, _name);
	}

	public ValueString(final String _name, final String _value) {
		super(String.class, _name, _value);
	}

	public ValueString(final ValueString _typeObject) {
		super(_typeObject);
	}
}
