package bcdm.base.data.api;

import java.util.List;

/**
 * Created by skkim on 5/31/17.
 */

public interface iData {

	final static String DEFAULT_TAG = "data";

	List<String> getNames();

	iValue getValue(final String _name);

	void setValue(final iValue _value);

	void setData(final iData _data);

	class Mock implements iData {

		@Override
		public List<String> getNames() {
			return null;
		}

		@Override
		public iValue getValue(String _name) {
			return null;
		}

		@Override
		public void setValue(iValue _value) {

		}

		@Override
		public void setData(iData _data) {

		}
	}
}
