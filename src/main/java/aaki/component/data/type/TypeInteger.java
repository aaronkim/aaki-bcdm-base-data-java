package aaki.component.data.type;

/**
 * Created by skkim on 10/11/16.
 */
class TypeInteger extends TypeObject<Integer> {
	public TypeInteger() {
		super(Integer.TYPE);
	}

	public TypeInteger(int _data) {
		super(Integer.TYPE, _data);
	}

	public TypeInteger(short _data) {
		super(Integer.TYPE, (int)_data);
	}

	public TypeInteger(TypeInteger _object) {
		super(Integer.TYPE, _object);
	}
}
