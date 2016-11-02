package aaki.component.data.value;

import java.util.UUID;

/**
 * Created by skkim on 11/2/16.
 */

class DataKeyImplement implements DataKey {
	protected String TAG = getClass().getSimpleName();
	protected boolean DEBUG = true; //BuildConfig.DEBUG;

	private final String mName;
	private final UUID mUUID;

	private DataKeyImplement(final String _name, final UUID _uuid) {
		mName = _name;
		mUUID = _uuid;
	}

	protected DataKeyImplement(final DataKey _dataKey) {
		if(_dataKey != null && _dataKey instanceof DataKeyImplement) {
			mName = _dataKey.getName();
			mUUID = _dataKey.getUUID();
		} else {
			mName = null;
			mUUID = null;
		}
	}

	@Override
	public String getName() {
		return mName;
	}

	@Override
	public UUID getUUID() {
		return mUUID;
	}
}
