package aaki.component.data.type;

/**
 * Created by skkim on 10/11/16.
 */
class TypeShort extends TypeObject<Short> {
	public TypeShort() {
		super(Short.TYPE);
	}

	public TypeShort(short _data) {
		super(Short.TYPE, _data);
	}

	public TypeShort(TypeShort _object) {
		super(Short.TYPE, _object);
	}
}
