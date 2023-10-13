package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p041f3.C1924k;
import p041f3.C1928o;
import p092n3.C2763l0;

/* renamed from: kotlinx.coroutines.internal.p */
public class C2423p {

    /* renamed from: d */
    static final /* synthetic */ AtomicReferenceFieldUpdater f8343d;

    /* renamed from: e */
    static final /* synthetic */ AtomicReferenceFieldUpdater f8344e;

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f8345f;
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* renamed from: kotlinx.coroutines.internal.p$a */
    public static abstract class C2424a extends C2400d<C2423p> {

        /* renamed from: b */
        public final C2423p f8346b;

        /* renamed from: c */
        public C2423p f8347c;

        public C2424a(C2423p pVar) {
            this.f8346b = pVar;
        }

        /* renamed from: h */
        public void mo8952d(C2423p pVar, Object obj) {
            boolean z = obj == null;
            C2423p pVar2 = z ? this.f8346b : this.f8347c;
            if (pVar2 != null && C2398c.m11194a(C2423p.f8343d, pVar, this, pVar2) && z) {
                C2423p pVar3 = this.f8346b;
                C2423p pVar4 = this.f8347c;
                C1924k.m9138d(pVar4);
                pVar3.m11283r(pVar4);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.p$b */
    public static final class C2425b extends C2437x {
    }

    /* renamed from: kotlinx.coroutines.internal.p$c */
    /* synthetic */ class C2426c extends C1928o {
        C2426c(Object obj) {
            super(obj, C2763l0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        public Object get() {
            return C2763l0.m12399a(this.f6881e);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C2423p> cls2 = C2423p.class;
        f8343d = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f8344e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f8345f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* renamed from: A */
    private final C2438y m11279A() {
        C2438y yVar = (C2438y) this._removedRef;
        if (yVar != null) {
            return yVar;
        }
        C2438y yVar2 = new C2438y(this);
        f8345f.lazySet(this, yVar2);
        return yVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlinx.coroutines.internal.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlinx.coroutines.internal.p} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (kotlinx.coroutines.internal.C2398c.m11194a(f8343d, r3, r2, ((kotlinx.coroutines.internal.C2438y) r4).f8367a) != false) goto L_0x004b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlinx.coroutines.internal.C2423p m11281p(kotlinx.coroutines.internal.C2437x r8) {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.p r0 = (kotlinx.coroutines.internal.C2423p) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f8344e
            boolean r0 = kotlinx.coroutines.internal.C2398c.m11194a(r1, r7, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r7.mo8991x()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r8) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C2437x
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0032
            r0 = r4
            kotlinx.coroutines.internal.x r0 = (kotlinx.coroutines.internal.C2437x) r0
            boolean r0 = r8.mo9027b(r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            kotlinx.coroutines.internal.x r4 = (kotlinx.coroutines.internal.C2437x) r4
            r4.mo8951c(r2)
            goto L_0x0000
        L_0x0038:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C2438y
            if (r5 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f8343d
            kotlinx.coroutines.internal.y r4 = (kotlinx.coroutines.internal.C2438y) r4
            kotlinx.coroutines.internal.p r4 = r4.f8367a
            boolean r2 = kotlinx.coroutines.internal.C2398c.m11194a(r5, r3, r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x0000
        L_0x004b:
            r2 = r3
            goto L_0x0006
        L_0x004d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.p r2 = (kotlinx.coroutines.internal.C2423p) r2
            goto L_0x0007
        L_0x0052:
            r3 = r4
            kotlinx.coroutines.internal.p r3 = (kotlinx.coroutines.internal.C2423p) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C2423p.m11281p(kotlinx.coroutines.internal.x):kotlinx.coroutines.internal.p");
    }

    /* renamed from: q */
    private final C2423p m11282q(C2423p pVar) {
        while (pVar.mo8991x()) {
            pVar = (C2423p) pVar._prev;
        }
        return pVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m11283r(C2423p pVar) {
        C2423p pVar2;
        do {
            pVar2 = (C2423p) pVar._prev;
            if (mo8995s() != pVar) {
                return;
            }
        } while (!C2398c.m11194a(f8344e, pVar, pVar2, this));
        if (mo8991x()) {
            pVar.m11281p((C2437x) null);
        }
    }

    /* renamed from: B */
    public final int mo8992B(C2423p pVar, C2423p pVar2, C2424a aVar) {
        f8344e.lazySet(pVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8343d;
        atomicReferenceFieldUpdater.lazySet(pVar, pVar2);
        aVar.f8347c = pVar2;
        if (!C2398c.m11194a(atomicReferenceFieldUpdater, this, pVar2, aVar)) {
            return 0;
        }
        return aVar.mo8951c(this) == null ? 1 : 2;
    }

    /* renamed from: m */
    public final boolean mo8993m(C2423p pVar, C2423p pVar2) {
        f8344e.lazySet(pVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8343d;
        atomicReferenceFieldUpdater.lazySet(pVar, pVar2);
        if (!C2398c.m11194a(atomicReferenceFieldUpdater, this, pVar2, pVar)) {
            return false;
        }
        pVar.m11283r(pVar2);
        return true;
    }

    /* renamed from: o */
    public final boolean mo8994o(C2423p pVar) {
        f8344e.lazySet(pVar, this);
        f8343d.lazySet(pVar, this);
        while (mo8995s() == this) {
            if (C2398c.m11194a(f8343d, this, this, pVar)) {
                pVar.m11283r(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public final Object mo8995s() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C2437x)) {
                return obj;
            }
            ((C2437x) obj).mo8951c(this);
        }
    }

    /* renamed from: t */
    public final C2423p mo8996t() {
        return C2422o.m11278b(mo8995s());
    }

    public String toString() {
        return new C2426c(this) + '@' + C2763l0.m12400b(this);
    }

    /* renamed from: u */
    public final C2423p mo8998u() {
        C2423p p = m11281p((C2437x) null);
        return p == null ? m11282q((C2423p) this._prev) : p;
    }

    /* renamed from: v */
    public final void mo8999v() {
        ((C2438y) mo8995s()).f8367a.mo9000w();
    }

    /* renamed from: w */
    public final void mo9000w() {
        C2423p pVar = this;
        while (true) {
            Object s = pVar.mo8995s();
            if (s instanceof C2438y) {
                pVar = ((C2438y) s).f8367a;
            } else {
                pVar.m11281p((C2437x) null);
                return;
            }
        }
    }

    /* renamed from: x */
    public boolean mo8991x() {
        return mo8995s() instanceof C2438y;
    }

    /* renamed from: y */
    public boolean mo9001y() {
        return mo9002z() == null;
    }

    /* renamed from: z */
    public final C2423p mo9002z() {
        Object s;
        C2423p pVar;
        do {
            s = mo8995s();
            if (s instanceof C2438y) {
                return ((C2438y) s).f8367a;
            }
            if (s == this) {
                return (C2423p) s;
            }
            pVar = (C2423p) s;
        } while (!C2398c.m11194a(f8343d, this, s, pVar.m11279A()));
        pVar.m11281p((C2437x) null);
        return null;
    }
}
