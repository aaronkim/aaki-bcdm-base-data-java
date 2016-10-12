package aaki.component.data.type;

import android.util.Log;

class TypeObject<T> extends BaseDataType<T> {

    public TypeObject() {
        super();
    }

    public TypeObject(final T _data) {
        super(_data);
        if(DEBUG) Log.d(TAG, "crete value = " + _data);
    }

    public TypeObject(final TypeObject _object) {
        super(_object);
        if(DEBUG) Log.d(TAG, "crete value = " + _object.getData());
    }
}
