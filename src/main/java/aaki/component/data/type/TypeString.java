package aaki.component.data.type;

/**
 * Created by skkim on 10/11/16.
 */
class TypeString extends TypeObject<String> {
	public TypeString() {
		super(String.class);
	}

	public TypeString(String _value) {
		super(String.class, _value);
	}

	public TypeString(TypeString _object) {
		super(String.class, _object);
	}
}
