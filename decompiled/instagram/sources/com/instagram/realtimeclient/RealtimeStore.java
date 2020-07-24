package com.instagram.realtimeclient;

import com.instagram.realtimeclient.RealtimeOperation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RealtimeStore {
    public final Map mOperationStore = new HashMap();
    public final Set mTombstoneStore = new HashSet();

    private synchronized boolean processNotifyOperation() {
        return true;
    }

    private synchronized boolean processRemoveOperation(RealtimeOperation realtimeOperation) {
        String key = RealtimeStoreKey.getKey(realtimeOperation);
        this.mOperationStore.remove(key);
        this.mTombstoneStore.add(key);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return false;
     */
    private synchronized boolean processReplaceOperation(RealtimeOperation realtimeOperation) {
        String key = RealtimeStoreKey.getKey(realtimeOperation);
        if (!this.mTombstoneStore.contains(key)) {
            RealtimeOperation realtimeOperation2 = (RealtimeOperation) this.mOperationStore.get(key);
            if (realtimeOperation2 == null) {
                this.mOperationStore.put(key, realtimeOperation);
            } else if (RealtimeEvent.compareSequences(realtimeOperation2.timestamp, realtimeOperation.timestamp) <= 0) {
                this.mOperationStore.put(key, realtimeOperation);
            }
        }
    }

    public synchronized void clear() {
        this.mOperationStore.clear();
        this.mTombstoneStore.clear();
    }

    /* renamed from: com.instagram.realtimeclient.RealtimeStore$1 */
    public /* synthetic */ class C00641 {
        public static final /* synthetic */ int[] $SwitchMap$com$instagram$realtimeclient$RealtimeOperation$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0024 */
        static {
            int[] iArr = new int[RealtimeOperation.Type.values().length];
            $SwitchMap$com$instagram$realtimeclient$RealtimeOperation$Type = iArr;
            iArr[RealtimeOperation.Type.add.ordinal()] = 1;
            iArr[RealtimeOperation.Type.remove.ordinal()] = 2;
            iArr[RealtimeOperation.Type.replace.ordinal()] = 3;
            iArr[RealtimeOperation.Type.notify.ordinal()] = 4;
        }
    }

    public boolean patchStoreWithOperation(RealtimeOperation realtimeOperation) {
        switch (realtimeOperation.f152op.ordinal()) {
            case 0:
                return processAddOperation(realtimeOperation);
            case 1:
                return processRemoveOperation(realtimeOperation);
            case 2:
                return processReplaceOperation(realtimeOperation);
            case 3:
                synchronized (this) {
                }
                return true;
            default:
                return false;
        }
    }

    private boolean processAddOperation(RealtimeOperation realtimeOperation) {
        String key = RealtimeStoreKey.getKey(realtimeOperation);
        synchronized (this) {
            if (this.mOperationStore.containsKey(key) || this.mTombstoneStore.contains(key)) {
                return false;
            }
            this.mOperationStore.put(key, realtimeOperation);
            return true;
        }
    }
}
