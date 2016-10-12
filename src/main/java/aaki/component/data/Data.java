package aaki.component.data;

import aaki.component.data.type.Key;
import aaki.component.data.type.Value;

/**
 * Created by skkim on 8/25/16.
 */
public class Data {
    private Key mKey        = null;
    private Value mValue    = null;

    public Data(final Data _data) {
        this.mKey = _data.mKey;
        this.mValue = _data.mValue;
    }

    public Data(final Key _key, final Value _value) {
        this.mKey = _key;
        this.mValue = _value;
    }

    public Key getKey() {
        return this.mKey;
    }

    public Value getValue() {
        return this.mValue;
    }

    @Override
    public boolean equals(Object o) {
        getKey().get();
        getValue().get();

        return super.equals(o);
    }
}
