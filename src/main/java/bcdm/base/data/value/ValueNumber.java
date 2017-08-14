package bcdm.base.data.value;

/**
 * Created by skkim on 5/12/17.
 */

abstract class ValueNumber<T extends Number> extends ValueObject<T> implements iValueNumber<T> {

	private final T VALUE_UNIT;
	private final T VALUE_STEP;
	private final T VALUE_MIN;
	private final T VALUE_MAX;

	ValueNumber(final String _name, final iValueNumber<T> _value) {
		this(_name == null ? _value.NAME() : _name, _value.UNIT(), _value.STEP(), _value.MIN(), _value.MAX());
	}

	ValueNumber(final String _name, final T _unit, final T _step, final T _min, final T _max) {
		super(_name);

		VALUE_UNIT = _unit;
		VALUE_STEP = _step;
		VALUE_MIN = _min;
		VALUE_MAX = _max;
	}

	private T mValue;

	public void set(T t) {
		mValue = t;
	}

	@Override
	public T get() {
		return mValue;
	}

	@Override
	public T UNIT() {
		return VALUE_UNIT;
	}

	@Override
	public T STEP(){
		return VALUE_STEP;
	}

	@Override
	public T MIN(){
		return VALUE_MIN;
	}

	@Override
	public T MAX(){
		return VALUE_MAX;
	}

	@Override
	public T increase() {
		T value = onIncrease(get(), STEP()) ;

		if(onCompare(value, MAX()) > 0) {
			set(MAX());
		} else {
			set(value);
		}

		return get();
	}

	@Override
	public T decrease() {
		T value = onDecrease(get(), STEP()) ;

		if(onCompare(value, MIN()) < 0) {
			set(MIN());
		} else {
			set(value);
		}

		return get();
	}

	/**
	 * @return
	 *  value of a - b
	 */
	protected abstract T onIncrease(final T _a, final T _b);

	/**
	 * @return
	 *  value of a + b
	 */
	protected abstract T onDecrease(final T _a, final T _b);

	/**
	 * @return
	 *  if 1 then a > b
	 *  else if 0 then a == b
	 *  else -1 then a < b
	 */
	protected abstract int onCompare(final T _a, final T _b);

}
