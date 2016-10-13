package aaki.component.data.type;

/**
 * Created by skkim on 8/25/16.
 */
public class Value implements BaseDataTypeInterface {
    TypeObject mTypeObject = null;

    public Value() {
        mTypeObject = TypeObject.NULL;
    }

    public Value(int _value) {
        setTypeObject(_value);
    }

    public Value(long _value) {
        setTypeObject(_value);
    }

    public Value(short _value) {
        setTypeObject(_value);
    }

    public Value(double _value) {
        setTypeObject(_value);
    }

    public Value(float _value) {
        setTypeObject(_value);
    }

    public Value(boolean _value) {
        setTypeObject(_value);
    }

    public Value(String _value) {
        setTypeObject(_value);
    }

    public Value(Object _value) {
        setTypeObject(_value);
    }

    private void setTypeObject(Object _value) {

        if(_value == null) {
            mTypeObject = TypeObject.NULL;
        } else {
            Class clazz = _value.getClass();

            if (Integer.class.equals(clazz)) {
                mTypeObject = new TypeInteger((int) _value);

            } else if (Short.class.equals(clazz)) {
                mTypeObject = new TypeShort((short) _value);

            } else if (Long.class.equals(clazz)) {
                mTypeObject = new TypeLong((long) _value);

            } else if (Double.class.equals(clazz)) {
                mTypeObject = new TypeDouble((long)_value);

            } else if (Float.class.equals(clazz)) {
                mTypeObject = new TypeDouble((float)_value);

            } else if (Boolean.class.equals(clazz)) {
                mTypeObject = new TypeBoolean((boolean) _value);

            } else if (String.class.equals(clazz)) {
                mTypeObject = new TypeString((String) _value);

            } else {
                mTypeObject = TypeObject.NULL;

            }
        }
    }

    @Override
    public Object getData() {
        return mTypeObject.getData();
    }

    @Override
    public void setData(Object _value) {
        setTypeObject(_value);
    }

    @Override
    public void setObject(TypeObject _typeObject) {
        if (_typeObject == null) {
            setTypeObject(null);
        } else {
            setTypeObject(_typeObject.getData());
        }
    }

    @Override
    public String getDataType() {
        return mTypeObject.getDataType();
    }

}
