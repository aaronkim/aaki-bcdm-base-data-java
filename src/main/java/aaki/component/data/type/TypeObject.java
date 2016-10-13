package aaki.component.data.type;

class TypeObject<T> extends BaseDataType<T> {

    public static final TypeObject<Object> NULL = new TypeObject<Object>(Object.class);

    public TypeObject(Class<T> _class) {
        super(_class);
    }

    public TypeObject(Class<T> _class, T _data) {
        super(_class, _data);
    }

    public TypeObject(Class<T> _class, TypeObject<T> _object) {
        super(_class, _object);
    }
}
