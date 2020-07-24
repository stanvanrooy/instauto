package com.facebook.react.animated;

import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import p000X.A3W;
import p000X.A3o;
import p000X.A44;
import p000X.A47;
import p000X.A93;
import p000X.A9T;
import p000X.AB1;
import p000X.AB2;
import p000X.AB3;
import p000X.AB4;
import p000X.AB6;
import p000X.AB7;
import p000X.ABC;
import p000X.ABD;
import p000X.ABE;
import p000X.ABG;
import p000X.ABJ;
import p000X.ABL;
import p000X.ABM;
import p000X.ABN;
import p000X.ABO;
import p000X.ABR;
import p000X.ABS;
import p000X.ABV;
import p000X.ABW;
import p000X.ABY;
import p000X.ACK;
import p000X.Constants;
import p000X.AnonymousClass0FY;
import p000X.C23043A0y;
import p000X.C23172ABa;
import p000X.C23180ABi;
import p000X.C23183ABl;

@ReactModule(name = "NativeAnimatedModule")
public class NativeAnimatedModule extends NativeAnimatedModuleSpec implements A47, A9T {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean ANIMATED_MODULE_DEBUG = false;
    public static final String NAME = "NativeAnimatedModule";
    public final A93 mAnimatedFrameCallback;
    public volatile boolean mFabricBatchCompleted = false;
    public boolean mInitializedForFabric = false;
    public AB3 mNodesManager;
    public int mNumFabricAnimations = 0;
    public int mNumNonFabricAnimations = 0;
    public ConcurrentLinkedQueue mOperations = new ConcurrentLinkedQueue();
    public ConcurrentLinkedQueue mPreOperations = new ConcurrentLinkedQueue();
    public final ACK mReactChoreographer;
    public int mUIManagerType = 1;

    public void addAnimatedEventToView(double d, String str, C23043A0y a0y) {
        A44 reactApplicationContext;
        A3o A01;
        int i = (int) d;
        int i2 = 1;
        if (i % 2 == 0) {
            i2 = 2;
        }
        this.mUIManagerType = i2;
        if (i2 == 2) {
            this.mNumFabricAnimations++;
        } else {
            this.mNumNonFabricAnimations++;
        }
        if (!this.mInitializedForFabric && i2 == 2 && (reactApplicationContext = getReactApplicationContext()) != null && (A01 = A3W.A01(reactApplicationContext, 2, true)) != null) {
            A01.addUIManagerEventListener(this);
            this.mInitializedForFabric = true;
        }
        this.mOperations.add(new AB6(this, i, str, a0y));
    }

    public void addListener(String str) {
    }

    public void connectAnimatedNodeToView(double d, double d2) {
        this.mOperations.add(new AB2(this, (int) d, (int) d2));
    }

    public void connectAnimatedNodes(double d, double d2) {
        this.mOperations.add(new ABC(this, (int) d, (int) d2));
    }

    public void createAnimatedNode(double d, C23043A0y a0y) {
        this.mOperations.add(new AB1(this, (int) d, a0y));
    }

    public void disconnectAnimatedNodeFromView(double d, double d2) {
        this.mOperations.add(new ABD(this, (int) d, (int) d2));
    }

    public void disconnectAnimatedNodes(double d, double d2) {
        this.mOperations.add(new ABO(this, (int) d, (int) d2));
    }

    public void dropAnimatedNode(double d) {
        this.mOperations.add(new ABW(this, (int) d));
    }

    public void extractAnimatedNodeOffset(double d) {
        this.mOperations.add(new ABN(this, (int) d));
    }

    public void flattenAnimatedNodeOffset(double d) {
        this.mOperations.add(new ABM(this, (int) d));
    }

    public String getName() {
        return NAME;
    }

    public void removeAnimatedEventFromView(double d, String str, double d2) {
        int i = (int) d;
        int i2 = (int) d2;
        char c = 1;
        if (i % 2 == 0) {
            c = 2;
        }
        if (c == 2) {
            this.mNumFabricAnimations--;
        } else {
            this.mNumNonFabricAnimations--;
        }
        int i3 = this.mNumNonFabricAnimations;
        if (i3 == 0 && this.mNumFabricAnimations > 0 && this.mUIManagerType != 2) {
            this.mUIManagerType = 2;
        } else if (this.mNumFabricAnimations == 0 && i3 > 0 && this.mUIManagerType != 1) {
            this.mUIManagerType = 1;
        }
        this.mOperations.add(new ABJ(this, i, str, i2));
    }

    public void removeListeners(double d) {
    }

    public void restoreDefaultValues(double d) {
        this.mPreOperations.add(new AB7(this, (int) d));
    }

    public void setAnimatedNodeOffset(double d, double d2) {
        this.mOperations.add(new ABL(this, (int) d, d2));
    }

    public void setAnimatedNodeValue(double d, double d2) {
        this.mOperations.add(new ABG(this, (int) d, d2));
    }

    public void startAnimatingNode(double d, double d2, C23043A0y a0y, Callback callback) {
        this.mOperations.add(new ABY(this, (int) d, (int) d2, a0y, callback));
    }

    public void startListeningToAnimatedNodeValue(double d) {
        int i = (int) d;
        this.mOperations.add(new ABR(this, i, new C23180ABi(this, i)));
    }

    public void stopAnimation(double d) {
        this.mOperations.add(new ABE(this, (int) d));
    }

    public void stopListeningToAnimatedNodeValue(double d) {
        this.mOperations.add(new ABS(this, (int) d));
    }

    private void clearFrameCallback() {
        ACK ack = this.mReactChoreographer;
        AnonymousClass0FY.A00(ack);
        ack.A02(Constants.A0C, this.mAnimatedFrameCallback);
    }

    private void enqueueFrameCallback() {
        ACK ack = this.mReactChoreographer;
        AnonymousClass0FY.A00(ack);
        ack.A01(Constants.A0C, this.mAnimatedFrameCallback);
    }

    public static AB3 getNodesManager(NativeAnimatedModule nativeAnimatedModule) {
        A44 reactApplicationContextIfActiveOrWarn;
        if (nativeAnimatedModule.mNodesManager == null && (reactApplicationContextIfActiveOrWarn = nativeAnimatedModule.getReactApplicationContextIfActiveOrWarn()) != null) {
            nativeAnimatedModule.mNodesManager = new AB3(reactApplicationContextIfActiveOrWarn);
        }
        return nativeAnimatedModule.mNodesManager;
    }

    public void didDispatchMountItems(A3o a3o) {
        if (this.mUIManagerType == 2 && this.mFabricBatchCompleted) {
            executeAllOperations(this, this.mPreOperations);
            executeAllOperations(this, this.mOperations);
            this.mFabricBatchCompleted = false;
        }
    }

    public void didScheduleMountItems(A3o a3o) {
        if (this.mUIManagerType == 2) {
            this.mFabricBatchCompleted = true;
        }
    }

    public void willDispatchViewUpdates(A3o a3o) {
        if ((!this.mOperations.isEmpty() || !this.mPreOperations.isEmpty()) && this.mUIManagerType != 2) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            while (!this.mPreOperations.isEmpty()) {
                linkedList.add(this.mPreOperations.poll());
            }
            while (!this.mOperations.isEmpty()) {
                linkedList2.add(this.mOperations.poll());
            }
            C23172ABa aBa = new C23172ABa(this, linkedList);
            ABV abv = new ABV(this, linkedList2);
            UIManagerModule uIManagerModule = (UIManagerModule) a3o;
            uIManagerModule.prependUIBlock(aBa);
            uIManagerModule.addUIBlock(abv);
        }
    }

    public NativeAnimatedModule(A44 a44) {
        super(a44);
        AnonymousClass0FY.A01(ACK.A06, "ReactChoreographer needs to be initialized.");
        this.mReactChoreographer = ACK.A06;
        this.mAnimatedFrameCallback = new AB4(this, a44);
    }

    public static void executeAllOperations(NativeAnimatedModule nativeAnimatedModule, Queue queue) {
        AB3 nodesManager = getNodesManager(nativeAnimatedModule);
        while (!queue.isEmpty()) {
            ((C23183ABl) queue.poll()).ADZ(nodesManager);
        }
    }

    public void initialize() {
        A44 reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null && !reactApplicationContextIfActiveOrWarn.A09()) {
            reactApplicationContextIfActiveOrWarn.A06(this);
            NativeModule A02 = reactApplicationContextIfActiveOrWarn.A02(UIManagerModule.class);
            AnonymousClass0FY.A00(A02);
            ((UIManagerModule) A02).addUIManagerEventListener(this);
        }
    }

    public void onHostDestroy() {
        clearFrameCallback();
    }

    public void onHostPause() {
        clearFrameCallback();
    }

    public void onHostResume() {
        enqueueFrameCallback();
    }

    public void setNodesManager(AB3 ab3) {
        this.mNodesManager = ab3;
    }
}
