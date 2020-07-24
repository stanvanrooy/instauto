package com.facebook.rsys.callmanager.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy;

public abstract class CallManagerClient {
    public abstract CallClient createCallClient(String str, UserContext userContext, CallContext callContext);

    public abstract McfReference getAppClient();

    public abstract AppInfo getAppInfo();

    public abstract EnvironmentVariablesProxy getEnvironmentVariables();

    public abstract NetworkSession getNetworkSession();

    public abstract void onCallAdded(CallClient callClient);

    public abstract void onCallRemoved(CallClient callClient);
}
