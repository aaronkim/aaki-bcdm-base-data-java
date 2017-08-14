package bcdm.base.data.value;

/**
 * Created by skkim on 6/7/17.
 */

public class ValueString extends ValueObject<String> implements iValueString {

	private final int mMaxLength;
	private final String mFormat;


	public ValueString(final String _name, final ValueString _value) {
		this(_name == null ? _value.NAME() : _name, _value.MAX_LENGTH(), _value.FORMAT());
	}

	public ValueString(final String _name, final int _max_leng, final String _format) {
		super(_name);
		mMaxLength = _max_leng;
		mFormat = _format;
	}

	@Override
	public void set(final String _value) {
		super.set(_value);
	}

	@Override
	public String get() {
		return super.get();
	}

	@Override
	public int MAX_LENGTH() {
		return mMaxLength;
	}

	@Override
	public String FORMAT() {
		return mFormat;
	}


}
