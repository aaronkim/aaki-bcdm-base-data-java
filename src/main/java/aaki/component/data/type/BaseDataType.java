package aaki.component.data.type;

import aaki.component.data.BuildConfig;

/**
 * Created by skkim on 8/25/16.
 */
class BaseDataType<T> extends BaseDataTypeImplement<T> {
    protected String TAG = getClass().getSimpleName();
    protected boolean DEBUG = BuildConfig.DEBUG;

    public static final BaseDataType<Object> EMPTY = new BaseDataType<>();

    public BaseDataType() {
        setData((T) null);
    }

    public BaseDataType(final T _data) {
        setData(_data);
    }

    public BaseDataType(final TypeObject _object) {
        set(_object);
    }

}
