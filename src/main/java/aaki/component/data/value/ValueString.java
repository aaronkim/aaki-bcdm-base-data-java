package aaki.component.data.value;

/**
 * Created by skkim on 10/11/16.
 */
public final class ValueString extends ValueObject<String> {
	public ValueString(final String _name) {
		this(_name, null);
	}

	public ValueString(final String _name, final String _value) {
		super(String.class, _name, _value);
	}

	public ValueString(final ValueString _typeObject) {
		super(_typeObject);
	}
}
