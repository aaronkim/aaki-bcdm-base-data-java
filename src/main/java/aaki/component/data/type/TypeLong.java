package aaki.component.data.type;

/**
 * Created by skkim on 10/11/16.
 */
class TypeLong extends TypeObject<Long> {
	public TypeLong() {
		super(Long.TYPE);
	}

	public TypeLong(long _data) {
		super(Long.TYPE, _data);
	}

	public TypeLong(int _data) {
		super(Long.TYPE, (long)_data);
	}

	public TypeLong(short _data) {
		super(Long.TYPE, (long)_data);
	}

	public TypeLong(TypeLong _object) {
		super(Long.TYPE, _object);
	}
}
