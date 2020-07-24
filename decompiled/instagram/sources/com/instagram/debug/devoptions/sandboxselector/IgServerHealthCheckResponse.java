package com.instagram.debug.devoptions.sandboxselector;

import p000X.C13150hy;
import p000X.C28691Ms;

public final class IgServerHealthCheckResponse extends C28691Ms {
    public final IgServerHealth health;

    public static /* synthetic */ IgServerHealthCheckResponse copy$default(IgServerHealthCheckResponse igServerHealthCheckResponse, IgServerHealth igServerHealth, int i, Object obj) {
        if ((i & 1) != 0) {
            igServerHealth = igServerHealthCheckResponse.health;
        }
        return igServerHealthCheckResponse.copy(igServerHealth);
    }

    public final IgServerHealth component1() {
        return this.health;
    }

    public final IgServerHealthCheckResponse copy(IgServerHealth igServerHealth) {
        C13150hy.A02(igServerHealth, "health");
        return new IgServerHealthCheckResponse(igServerHealth);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof IgServerHealthCheckResponse) && C13150hy.A05(this.health, ((IgServerHealthCheckResponse) obj).health);
        }
        return true;
    }

    public int hashCode() {
        IgServerHealth igServerHealth = this.health;
        if (igServerHealth != null) {
            return igServerHealth.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "IgServerHealthCheckResponse(health=" + this.health + ")";
    }

    public IgServerHealthCheckResponse(IgServerHealth igServerHealth) {
        C13150hy.A02(igServerHealth, "health");
        this.health = igServerHealth;
    }

    public final IgServerHealth getHealth() {
        return this.health;
    }
}
