package aaki.component.data.type;

/**
 * Created by skkim on 10/11/16.
 */
class TypeInteger extends TypeObject<Integer> {
	public TypeInteger() {
		super();
	}

	public TypeInteger(Integer _data) {
		super(_data);
	}

	public TypeInteger(TypeInteger _object) {
		super(_object);
	}
}
