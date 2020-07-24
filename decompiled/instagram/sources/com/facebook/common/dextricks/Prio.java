package com.facebook.common.dextricks;

import android.os.Build;
import com.facebook.forker.Process;
import java.io.Closeable;

public final class Prio {
    public final int cpuPriority;
    public final int ioPriority;

    public final class With implements Closeable {
        public final int savedCpuPriority;
        public final int savedIoPriority;

        public With() {
            int ioprio_get;
            int threadPriority;
            if (Build.VERSION.SDK_INT >= 26) {
                this.savedIoPriority = Process.WAIT_RESULT_TIMEOUT;
                this.savedCpuPriority = Process.WAIT_RESULT_TIMEOUT;
                return;
            }
            int myTid = android.os.Process.myTid();
            if (Prio.this.ioPriority == Integer.MIN_VALUE) {
                ioprio_get = Process.WAIT_RESULT_TIMEOUT;
            } else {
                ioprio_get = DalvikInternals.ioprio_get(1, 0);
            }
            this.savedIoPriority = ioprio_get;
            if (Prio.this.cpuPriority == Integer.MIN_VALUE) {
                threadPriority = Process.WAIT_RESULT_TIMEOUT;
            } else {
                threadPriority = android.os.Process.getThreadPriority(myTid);
            }
            this.savedCpuPriority = threadPriority;
            try {
                int i = Prio.this.cpuPriority;
                if (i != Integer.MIN_VALUE) {
                    android.os.Process.setThreadPriority(myTid, i);
                }
                int i2 = Prio.this.ioPriority;
                if (i2 != Integer.MIN_VALUE) {
                    DalvikInternals.ioprio_set(1, 0, i2);
                }
            } catch (Throwable th) {
                close();
                throw th;
            }
        }

        public void close() {
            int i = this.savedIoPriority;
            if (i != Integer.MIN_VALUE) {
                DalvikInternals.ioprio_set(1, 0, i);
            }
            if (this.savedCpuPriority != Integer.MIN_VALUE) {
                android.os.Process.setThreadPriority(android.os.Process.myTid(), this.savedCpuPriority);
            }
        }
    }

    public static Prio lowest() {
        return new Prio(DalvikInternals.IOPRIO_BACKGROUND, 19);
    }

    public static Prio unchanged() {
        return new Prio(Process.WAIT_RESULT_TIMEOUT, Process.WAIT_RESULT_TIMEOUT);
    }

    public Prio ioOnly() {
        return new Prio(this.ioPriority, Process.WAIT_RESULT_TIMEOUT);
    }

    public boolean isDefault() {
        if (this.ioPriority >= 0 || this.cpuPriority >= 0) {
            return false;
        }
        return true;
    }

    public With with() {
        return new With();
    }

    public Prio(int i, int i2) {
        this.ioPriority = i;
        this.cpuPriority = i2;
    }
}
