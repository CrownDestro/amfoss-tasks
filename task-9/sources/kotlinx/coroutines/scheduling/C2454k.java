package kotlinx.coroutines.scheduling;

import p092n3.C2763l0;

/* renamed from: kotlinx.coroutines.scheduling.k */
public final class C2454k extends C2451h {

    /* renamed from: f */
    public final Runnable f8407f;

    public C2454k(Runnable runnable, long j, C2452i iVar) {
        super(j, iVar);
        this.f8407f = runnable;
    }

    public void run() {
        try {
            this.f8407f.run();
        } finally {
            this.f8405e.mo9058b();
        }
    }

    public String toString() {
        return "Task[" + C2763l0.m12399a(this.f8407f) + '@' + C2763l0.m12400b(this.f8407f) + ", " + this.f8404d + ", " + this.f8405e + ']';
    }
}
