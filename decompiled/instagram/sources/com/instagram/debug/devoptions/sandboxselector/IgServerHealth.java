package com.instagram.debug.devoptions.sandboxselector;

import p000X.AnonymousClass7BR;
import p000X.C13150hy;

public abstract class IgServerHealth {

    public final class CheckingHealth extends IgServerHealth {
        public static final CheckingHealth INSTANCE = new CheckingHealth();
    }

    public final class Healthy extends IgServerHealth {
        public static final Healthy INSTANCE = new Healthy();
    }

    public final class Unhealthy extends IgServerHealth {
        public final UnhealthyReason errorStatus;

        public enum UnhealthyReason {
            BAD_GATEWAY,
            TIMED_OUT,
            DJANGO_UNHEALTHY,
            UNKNOWN;
            
            public static final Companion Companion = null;

            /* access modifiers changed from: public */
            static {
                Companion = new Companion();
            }

            public final class Companion {
                public final UnhealthyReason fromHttpStatusCode(int i) {
                    switch (i) {
                        case 502:
                            return UnhealthyReason.BAD_GATEWAY;
                        case 503:
                            return UnhealthyReason.TIMED_OUT;
                        case 504:
                            return UnhealthyReason.DJANGO_UNHEALTHY;
                        default:
                            return UnhealthyReason.UNKNOWN;
                    }
                }

                public Companion() {
                }

                public /* synthetic */ Companion(AnonymousClass7BR r1) {
                }
            }
        }

        public static /* synthetic */ Unhealthy copy$default(Unhealthy unhealthy, UnhealthyReason unhealthyReason, int i, Object obj) {
            if ((i & 1) != 0) {
                unhealthyReason = unhealthy.errorStatus;
            }
            return unhealthy.copy(unhealthyReason);
        }

        public final UnhealthyReason component1() {
            return this.errorStatus;
        }

        public final Unhealthy copy(UnhealthyReason unhealthyReason) {
            C13150hy.A02(unhealthyReason, "errorStatus");
            return new Unhealthy(unhealthyReason);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Unhealthy) && C13150hy.A05(this.errorStatus, ((Unhealthy) obj).errorStatus);
            }
            return true;
        }

        public int hashCode() {
            UnhealthyReason unhealthyReason = this.errorStatus;
            if (unhealthyReason != null) {
                return unhealthyReason.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Unhealthy(errorStatus=" + this.errorStatus + ")";
        }

        public Unhealthy(UnhealthyReason unhealthyReason) {
            C13150hy.A02(unhealthyReason, "errorStatus");
            this.errorStatus = unhealthyReason;
        }

        public final UnhealthyReason getErrorStatus() {
            return this.errorStatus;
        }
    }

    public IgServerHealth() {
    }

    public /* synthetic */ IgServerHealth(AnonymousClass7BR r1) {
    }
}
