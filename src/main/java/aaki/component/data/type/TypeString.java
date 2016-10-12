package aaki.component.data.type;

/**
 * Created by skkim on 10/11/16.
 */
class TypeString extends TypeObject<String> {
	public TypeString() {
		super();
	}

	public TypeString(String _value) {
		super(_value);
	}

	public TypeString(TypeString _object) {
		super(_object);
	}
}
