package aaki.component.data.type;

/**
 * Created by skkim on 10/11/16.
 */
class TypeBoolean extends TypeObject<Boolean> {

	protected TypeBoolean() {
		super(Boolean.TYPE);
	}

	public TypeBoolean(boolean _data) {
		super(Boolean.TYPE, _data);
	}

	public TypeBoolean(TypeBoolean _object) {
		super(Boolean.TYPE, _object);
	}
}
