package com.mohammadag.xperiadialermods;

import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.callbacks.XC_InitPackageResources.InitPackageResourcesParam;

public class XposedMod implements IXposedHookInitPackageResources {
	@Override
	public void handleInitPackageResources(InitPackageResourcesParam resparam) throws Throwable {
		if (!resparam.packageName.equals("com.android.phone"))
			return;

		resparam.res.setReplacement("com.android.phone", "bool", "enable_call_recording", true);
	}
}
