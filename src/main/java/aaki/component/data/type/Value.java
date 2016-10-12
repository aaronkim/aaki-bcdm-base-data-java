package aaki.component.data.type;

/**
 * Created by skkim on 8/25/16.
 */
public class Value<T> extends TypeObject<T> {

    public Value() {
        super();
    }

    public Value(final T _value) {
        super(_value);
    }

    public Value(final Value _type) {
        super(_type);
    }



}
