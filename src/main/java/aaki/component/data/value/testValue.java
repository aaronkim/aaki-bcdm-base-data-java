package aaki.component.data.value;

import java.util.UUID;

/**
 * Created by skkim on 10/28/16.
 */

class testValue {

	public enum Type implements DataType {
		Integer(Integer.class),
		Long(Long.class),
		Short(Short.class),
		String(String.class);

		@Override
		public UUID getUUID() {
			return null;
		}

		@Override
		public Object getData() {
			return null;
		}

		@Override
		public void setData(Object _data) {

		}

		@Override
		public String getName() {
			return null;
		}

		@Override
		public String getDataType() {
			return null;
		}

		@Override
		public Class getDataClass() {
			return null;
		}

		private final Class mClass;

		private Type(Class _class) {
			mClass = _class;
		}
	}
}
