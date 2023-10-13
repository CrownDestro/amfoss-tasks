package p116r3;

import p034e3.C1784p;
import p041f3.C1924k;
import p041f3.C1925l;
import p092n3.C2791s1;
import p110q3.C3031c;
import p127t2.C3178l;
import p127t2.C3187s;
import p145w2.C3443d;
import p145w2.C3448g;
import p145w2.C3454h;
import p157y2.C3565d;
import p157y2.C3566e;
import p157y2.C3569h;

/* renamed from: r3.c */
public final class C3084c<T> extends C3565d implements C3031c<T> {

    /* renamed from: g */
    public final C3031c<T> f10006g;

    /* renamed from: h */
    public final C3448g f10007h;

    /* renamed from: i */
    public final int f10008i;

    /* renamed from: j */
    private C3448g f10009j;

    /* renamed from: k */
    private C3443d<? super C3187s> f10010k;

    /* renamed from: r3.c$a */
    static final class C3085a extends C1925l implements C1784p<Integer, C3448g.C3451b, Integer> {

        /* renamed from: e */
        public static final C3085a f10011e = new C3085a();

        C3085a() {
            super(2);
        }

        /* renamed from: a */
        public final Integer mo10411a(int i, C3448g.C3451b bVar) {
            return Integer.valueOf(i + 1);
        }

        /* renamed from: l */
        public /* bridge */ /* synthetic */ Object mo3735l(Object obj, Object obj2) {
            return mo10411a(((Number) obj).intValue(), (C3448g.C3451b) obj2);
        }
    }

    public C3084c(C3031c<? super T> cVar, C3448g gVar) {
        super(C3083b.f10004d, C3454h.f11278d);
        this.f10006g = cVar;
        this.f10007h = gVar;
        this.f10008i = ((Number) gVar.mo9537n(0, C3085a.f10011e)).intValue();
    }

    /* renamed from: w */
    private final void m13823w(C3448g gVar, C3448g gVar2, T t) {
        if (gVar2 instanceof C3082a) {
            m13825y((C3082a) gVar2, t);
        }
        C3088e.m13837a(this, gVar);
    }

    /* renamed from: x */
    private final Object m13824x(C3443d<? super C3187s> dVar, T t) {
        C3448g b = dVar.mo8958b();
        C2791s1.m12513g(b);
        C3448g gVar = this.f10009j;
        if (gVar != b) {
            m13823w(b, gVar, t);
            this.f10009j = b;
        }
        this.f10010k = dVar;
        Object k = C3086d.f10012a.mo7462k(this.f10006g, t, this);
        if (!C1924k.m9136b(k, C3530d.m15553c())) {
            this.f10010k = null;
        }
        return k;
    }

    /* renamed from: y */
    private final void m13825y(C3082a aVar, Object obj) {
        throw new IllegalStateException(C2637i.m11970f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + aVar.f10002d + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    /* renamed from: b */
    public C3448g mo8958b() {
        C3448g gVar = this.f10009j;
        return gVar == null ? C3454h.f11278d : gVar;
    }

    /* renamed from: e */
    public C3566e mo8946e() {
        C3443d<? super C3187s> dVar = this.f10010k;
        if (dVar instanceof C3566e) {
            return (C3566e) dVar;
        }
        return null;
    }

    /* renamed from: h */
    public Object mo10196h(T t, C3443d<? super C3187s> dVar) {
        try {
            Object x = m13824x(dVar, t);
            if (x == C3530d.m15553c()) {
                C3569h.m15747c(dVar);
            }
            return x == C3530d.m15553c() ? x : C3187s.f10561a;
        } catch (Throwable th) {
            this.f10009j = new C3082a(th, dVar.mo8958b());
            throw th;
        }
    }

    /* renamed from: s */
    public StackTraceElement mo10409s() {
        return null;
    }

    /* renamed from: t */
    public Object mo3736t(Object obj) {
        Throwable b = C3178l.m14055b(obj);
        if (b != null) {
            this.f10009j = new C3082a(b, mo8958b());
        }
        C3443d<? super C3187s> dVar = this.f10010k;
        if (dVar != null) {
            dVar.mo8960j(obj);
        }
        return C3530d.m15553c();
    }

    /* renamed from: u */
    public void mo10410u() {
        super.mo10410u();
    }
}
