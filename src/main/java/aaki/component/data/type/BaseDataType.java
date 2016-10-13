package aaki.component.data.type;

/**
 * Created by skkim on 8/25/16.
 */
class BaseDataType<T> extends BaseDataTypeImplement<T> {
    protected String TAG = getClass().getSimpleName();
    protected boolean DEBUG = true; //BuildConfig.DEBUG;

    protected BaseDataType(Class<T> _class) {
        super(_class);
    }

    protected BaseDataType(Class<T> _class, final T _data) {
        super(_class);
        setData(_data);
    }

    protected BaseDataType(Class<T> _class, final BaseDataType<T> _object) {
        this(_class, _object.getData());
    }
}
