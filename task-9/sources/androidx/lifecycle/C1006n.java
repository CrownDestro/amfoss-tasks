package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.C0988f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p041f3.C1920g;
import p041f3.C1924k;
import p051h.C1993c;
import p057i.C2079a;
import p057i.C2080b;

/* renamed from: androidx.lifecycle.n */
public class C1006n extends C0988f {

    /* renamed from: j */
    public static final C1007a f3428j = new C1007a((C1920g) null);

    /* renamed from: b */
    private final boolean f3429b;

    /* renamed from: c */
    private C2079a<C1004l, C1008b> f3430c;

    /* renamed from: d */
    private C0988f.C0993b f3431d;

    /* renamed from: e */
    private final WeakReference<C1005m> f3432e;

    /* renamed from: f */
    private int f3433f;

    /* renamed from: g */
    private boolean f3434g;

    /* renamed from: h */
    private boolean f3435h;

    /* renamed from: i */
    private ArrayList<C0988f.C0993b> f3436i;

    /* renamed from: androidx.lifecycle.n$a */
    public static final class C1007a {
        private C1007a() {
        }

        public /* synthetic */ C1007a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C0988f.C0993b mo3790a(C0988f.C0993b bVar, C0988f.C0993b bVar2) {
            C1924k.m9141g(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }
    }

    /* renamed from: androidx.lifecycle.n$b */
    public static final class C1008b {

        /* renamed from: a */
        private C0988f.C0993b f3437a;

        /* renamed from: b */
        private C1002j f3438b;

        public C1008b(C1004l lVar, C0988f.C0993b bVar) {
            C1924k.m9141g(bVar, "initialState");
            C1924k.m9138d(lVar);
            this.f3438b = C1010p.m4497f(lVar);
            this.f3437a = bVar;
        }

        /* renamed from: a */
        public final void mo3791a(C1005m mVar, C0988f.C0989a aVar) {
            C1924k.m9141g(aVar, "event");
            C0988f.C0993b b = aVar.mo3778b();
            this.f3437a = C1006n.f3428j.mo3790a(this.f3437a, b);
            C1002j jVar = this.f3438b;
            C1924k.m9138d(mVar);
            jVar.mo144j(mVar, aVar);
            this.f3437a = b;
        }

        /* renamed from: b */
        public final C0988f.C0993b mo3792b() {
            return this.f3437a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1006n(C1005m mVar) {
        this(mVar, true);
        C1924k.m9141g(mVar, "provider");
    }

    private C1006n(C1005m mVar, boolean z) {
        this.f3429b = z;
        this.f3430c = new C2079a<>();
        this.f3431d = C0988f.C0993b.INITIALIZED;
        this.f3436i = new ArrayList<>();
        this.f3432e = new WeakReference<>(mVar);
    }

    /* renamed from: e */
    private final void m4473e(C1005m mVar) {
        Iterator<Map.Entry<C1004l, C1008b>> s = this.f3430c.mo7843s();
        C1924k.m9140f(s, "observerMap.descendingIterator()");
        while (s.hasNext() && !this.f3435h) {
            Map.Entry next = s.next();
            C1924k.m9140f(next, "next()");
            C1004l lVar = (C1004l) next.getKey();
            C1008b bVar = (C1008b) next.getValue();
            while (bVar.mo3792b().compareTo(this.f3431d) > 0 && !this.f3435h && this.f3430c.contains(lVar)) {
                C0988f.C0989a a = C0988f.C0989a.Companion.mo3779a(bVar.mo3792b());
                if (a != null) {
                    m4480n(a.mo3778b());
                    bVar.mo3791a(mVar, a);
                    m4479m();
                } else {
                    throw new IllegalStateException("no event down from " + bVar.mo3792b());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r4 = r4.getValue();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.lifecycle.C0988f.C0993b m4474f(androidx.lifecycle.C1004l r4) {
        /*
            r3 = this;
            i.a<androidx.lifecycle.l, androidx.lifecycle.n$b> r0 = r3.f3430c
            java.util.Map$Entry r4 = r0.mo7835E(r4)
            r0 = 0
            if (r4 == 0) goto L_0x0016
            java.lang.Object r4 = r4.getValue()
            androidx.lifecycle.n$b r4 = (androidx.lifecycle.C1006n.C1008b) r4
            if (r4 == 0) goto L_0x0016
            androidx.lifecycle.f$b r4 = r4.mo3792b()
            goto L_0x0017
        L_0x0016:
            r4 = r0
        L_0x0017:
            java.util.ArrayList<androidx.lifecycle.f$b> r1 = r3.f3436i
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x002f
            java.util.ArrayList<androidx.lifecycle.f$b> r0 = r3.f3436i
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            androidx.lifecycle.f$b r0 = (androidx.lifecycle.C0988f.C0993b) r0
        L_0x002f:
            androidx.lifecycle.n$a r1 = f3428j
            androidx.lifecycle.f$b r2 = r3.f3431d
            androidx.lifecycle.f$b r4 = r1.mo3790a(r2, r4)
            androidx.lifecycle.f$b r4 = r1.mo3790a(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1006n.m4474f(androidx.lifecycle.l):androidx.lifecycle.f$b");
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: g */
    private final void m4475g(String str) {
        if (this.f3429b && !C1993c.m9238f().mo7739b()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    /* renamed from: h */
    private final void m4476h(C1005m mVar) {
        C2080b<K, V>.d z = this.f3430c.mo7847z();
        C1924k.m9140f(z, "observerMap.iteratorWithAdditions()");
        while (z.hasNext() && !this.f3435h) {
            Map.Entry entry = (Map.Entry) z.next();
            C1004l lVar = (C1004l) entry.getKey();
            C1008b bVar = (C1008b) entry.getValue();
            while (bVar.mo3792b().compareTo(this.f3431d) < 0 && !this.f3435h && this.f3430c.contains(lVar)) {
                m4480n(bVar.mo3792b());
                C0988f.C0989a b = C0988f.C0989a.Companion.mo3780b(bVar.mo3792b());
                if (b != null) {
                    bVar.mo3791a(mVar, b);
                    m4479m();
                } else {
                    throw new IllegalStateException("no event up from " + bVar.mo3792b());
                }
            }
        }
    }

    /* renamed from: j */
    private final boolean m4477j() {
        if (this.f3430c.size() == 0) {
            return true;
        }
        Map.Entry<C1004l, C1008b> x = this.f3430c.mo7846x();
        C1924k.m9138d(x);
        C0988f.C0993b b = x.getValue().mo3792b();
        Map.Entry<C1004l, C1008b> A = this.f3430c.mo7838A();
        C1924k.m9138d(A);
        C0988f.C0993b b2 = A.getValue().mo3792b();
        return b == b2 && this.f3431d == b2;
    }

    /* renamed from: l */
    private final void m4478l(C0988f.C0993b bVar) {
        C0988f.C0993b bVar2 = this.f3431d;
        if (bVar2 != bVar) {
            if ((bVar2 == C0988f.C0993b.INITIALIZED && bVar == C0988f.C0993b.DESTROYED) ? false : true) {
                this.f3431d = bVar;
                if (this.f3434g || this.f3433f != 0) {
                    this.f3435h = true;
                    return;
                }
                this.f3434g = true;
                m4481p();
                this.f3434g = false;
                if (this.f3431d == C0988f.C0993b.DESTROYED) {
                    this.f3430c = new C2079a<>();
                    return;
                }
                return;
            }
            throw new IllegalStateException(("no event down from " + this.f3431d + " in component " + this.f3432e.get()).toString());
        }
    }

    /* renamed from: m */
    private final void m4479m() {
        ArrayList<C0988f.C0993b> arrayList = this.f3436i;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: n */
    private final void m4480n(C0988f.C0993b bVar) {
        this.f3436i.add(bVar);
    }

    /* renamed from: p */
    private final void m4481p() {
        C1005m mVar = (C1005m) this.f3432e.get();
        if (mVar != null) {
            while (true) {
                boolean j = m4477j();
                this.f3435h = false;
                if (!j) {
                    C0988f.C0993b bVar = this.f3431d;
                    Map.Entry<C1004l, C1008b> x = this.f3430c.mo7846x();
                    C1924k.m9138d(x);
                    if (bVar.compareTo(x.getValue().mo3792b()) < 0) {
                        m4473e(mVar);
                    }
                    Map.Entry<C1004l, C1008b> A = this.f3430c.mo7838A();
                    if (!this.f3435h && A != null && this.f3431d.compareTo(A.getValue().mo3792b()) > 0) {
                        m4476h(mVar);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
    }

    /* renamed from: a */
    public void mo3774a(C1004l lVar) {
        C1005m mVar;
        C1924k.m9141g(lVar, "observer");
        m4475g("addObserver");
        C0988f.C0993b bVar = this.f3431d;
        C0988f.C0993b bVar2 = C0988f.C0993b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = C0988f.C0993b.INITIALIZED;
        }
        C1008b bVar3 = new C1008b(lVar, bVar2);
        if (this.f3430c.mo7833C(lVar, bVar3) == null && (mVar = (C1005m) this.f3432e.get()) != null) {
            boolean z = this.f3433f != 0 || this.f3434g;
            C0988f.C0993b f = m4474f(lVar);
            this.f3433f++;
            while (bVar3.mo3792b().compareTo(f) < 0 && this.f3430c.contains(lVar)) {
                m4480n(bVar3.mo3792b());
                C0988f.C0989a b = C0988f.C0989a.Companion.mo3780b(bVar3.mo3792b());
                if (b != null) {
                    bVar3.mo3791a(mVar, b);
                    m4479m();
                    f = m4474f(lVar);
                } else {
                    throw new IllegalStateException("no event up from " + bVar3.mo3792b());
                }
            }
            if (!z) {
                m4481p();
            }
            this.f3433f--;
        }
    }

    /* renamed from: b */
    public C0988f.C0993b mo3775b() {
        return this.f3431d;
    }

    /* renamed from: d */
    public void mo3777d(C1004l lVar) {
        C1924k.m9141g(lVar, "observer");
        m4475g("removeObserver");
        this.f3430c.mo7834D(lVar);
    }

    /* renamed from: i */
    public void mo3787i(C0988f.C0989a aVar) {
        C1924k.m9141g(aVar, "event");
        m4475g("handleLifecycleEvent");
        m4478l(aVar.mo3778b());
    }

    /* renamed from: k */
    public void mo3788k(C0988f.C0993b bVar) {
        C1924k.m9141g(bVar, "state");
        m4475g("markState");
        mo3789o(bVar);
    }

    /* renamed from: o */
    public void mo3789o(C0988f.C0993b bVar) {
        C1924k.m9141g(bVar, "state");
        m4475g("setCurrentState");
        m4478l(bVar);
    }
}
