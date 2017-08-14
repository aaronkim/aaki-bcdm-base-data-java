package bcdm.base.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bcdm.base.data.api.iData;
import bcdm.base.data.api.iValue;

/**
 * Created by skkim on 6/9/17.
 */

public class Data implements iData {
	private final Map<String, iValue> mValueMap = new HashMap<>();

	@Override
	public List<String> getNames() {
		return new ArrayList<>(mValueMap.keySet());
	}

	@Override
	public iValue getValue(final String _name) {
		return mValueMap.get(_name);
	}

	@Override
	public void setValue(final iValue _value) {
		if(_value == null) {
//			throw new NullPointerException();
			return;
		}

		mValueMap.put(_value.NAME(), _value);
	}

	@Override
	public void setData(final iData _data) {
		if(_data == null) {
//			throw new NullPointerException();
			return;
		}

		List<String> names = _data.getNames();

		for(String name : names) {
			setValue(_data.getValue(name));
		}
	}
}
