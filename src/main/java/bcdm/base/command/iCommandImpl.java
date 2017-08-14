package bcdm.base.command;

import android.os.RemoteException;

import bcdm.base.command.api.iCommand;

/**
 * Created by skkim on 6/29/17.
 */

class iCommandImpl extends iCommand.Stub {

	@Override
	public String getCommand() throws RemoteException {
		return null;
	}
}
