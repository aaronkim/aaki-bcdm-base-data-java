package aaki.component.data.type;

/**
 * Created by skkim on 10/11/16.
 */
class TypeBoolean extends TypeObject<Boolean> {
	public TypeBoolean() {
		super();
	}

	public TypeBoolean(final Boolean _data) {
		super(_data);
	}

	public TypeBoolean(final TypeBoolean _object) {
		super(_object);
	}
}
