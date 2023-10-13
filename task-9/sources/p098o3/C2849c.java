package p098o3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import p034e3.C1780l;
import p041f3.C1920g;
import p041f3.C1924k;
import p041f3.C1925l;
import p092n3.C2761l;
import p092n3.C2791s1;
import p092n3.C2799v0;
import p127t2.C3187s;
import p145w2.C3448g;

/* renamed from: o3.c */
public final class C2849c extends C2852d {
    private volatile C2849c _immediate;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Handler f9368f;

    /* renamed from: g */
    private final String f9369g;

    /* renamed from: h */
    private final boolean f9370h;

    /* renamed from: i */
    private final C2849c f9371i;

    /* renamed from: o3.c$a */
    public static final class C2850a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C2761l f9372d;

        /* renamed from: e */
        final /* synthetic */ C2849c f9373e;

        public C2850a(C2761l lVar, C2849c cVar) {
            this.f9372d = lVar;
            this.f9373e = cVar;
        }

        public final void run() {
            this.f9372d.mo9509g(this.f9373e, C3187s.f10561a);
        }
    }

    /* renamed from: o3.c$b */
    static final class C2851b extends C1925l implements C1780l<Throwable, C3187s> {

        /* renamed from: e */
        final /* synthetic */ C2849c f9374e;

        /* renamed from: f */
        final /* synthetic */ Runnable f9375f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2851b(C2849c cVar, Runnable runnable) {
            super(1);
            this.f9374e = cVar;
            this.f9375f = runnable;
        }

        /* renamed from: a */
        public final void mo9826a(Throwable th) {
            this.f9374e.f9368f.removeCallbacks(this.f9375f);
        }

        /* renamed from: n */
        public /* bridge */ /* synthetic */ Object mo3836n(Object obj) {
            mo9826a((Throwable) obj);
            return C3187s.f10561a;
        }
    }

    public C2849c(Handler handler, String str) {
        this(handler, str, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2849c(Handler handler, String str, int i, C1920g gVar) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C2849c(Handler handler, String str, boolean z) {
        super((C1920g) null);
        C2849c cVar = null;
        this.f9368f = handler;
        this.f9369g = str;
        this.f9370h = z;
        this._immediate = z ? this : cVar;
        C2849c cVar2 = this._immediate;
        if (cVar2 == null) {
            cVar2 = new C2849c(handler, str, true);
            this._immediate = cVar2;
        }
        this.f9371i = cVar2;
    }

    /* renamed from: g0 */
    private final void m12923g0(C3448g gVar, Runnable runnable) {
        C2791s1.m12509c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C2799v0.m12532b().mo8989a0(gVar, runnable);
    }

    /* renamed from: O */
    public void mo8988O(long j, C2761l<? super C3187s> lVar) {
        C2850a aVar = new C2850a(lVar, this);
        if (this.f9368f.postDelayed(aVar, C2331f.m10819e(j, 4611686018427387903L))) {
            lVar.mo9510m(new C2851b(this, aVar));
        } else {
            m12923g0(lVar.mo8958b(), aVar);
        }
    }

    /* renamed from: a0 */
    public void mo8989a0(C3448g gVar, Runnable runnable) {
        if (!this.f9368f.post(runnable)) {
            m12923g0(gVar, runnable);
        }
    }

    /* renamed from: b0 */
    public boolean mo9021b0(C3448g gVar) {
        return !this.f9370h || !C1924k.m9136b(Looper.myLooper(), this.f9368f.getLooper());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2849c) && ((C2849c) obj).f9368f == this.f9368f;
    }

    /* renamed from: h0 */
    public C2849c mo9022d0() {
        return this.f9371i;
    }

    public int hashCode() {
        return System.identityHashCode(this.f9368f);
    }

    public String toString() {
        String e0 = mo9604e0();
        if (e0 != null) {
            return e0;
        }
        String str = this.f9369g;
        if (str == null) {
            str = this.f9368f.toString();
        }
        if (!this.f9370h) {
            return str;
        }
        return str + ".immediate";
    }
}
