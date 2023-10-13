package p021c4;

import p041f3.C1920g;
import p041f3.C1924k;
import p062i4.C2115i;

/* renamed from: c4.c */
public final class C1306c {

    /* renamed from: d */
    public static final C2115i f4664d;

    /* renamed from: e */
    public static final C2115i f4665e;

    /* renamed from: f */
    public static final C2115i f4666f;

    /* renamed from: g */
    public static final C2115i f4667g;

    /* renamed from: h */
    public static final C2115i f4668h;

    /* renamed from: i */
    public static final C2115i f4669i;

    /* renamed from: j */
    public static final C1307a f4670j = new C1307a((C1920g) null);

    /* renamed from: a */
    public final int f4671a;

    /* renamed from: b */
    public final C2115i f4672b;

    /* renamed from: c */
    public final C2115i f4673c;

    /* renamed from: c4.c$a */
    public static final class C1307a {
        private C1307a() {
        }

        public /* synthetic */ C1307a(C1920g gVar) {
            this();
        }
    }

    static {
        C2115i.C2116a aVar = C2115i.f7358h;
        f4664d = aVar.mo8007d(":");
        f4665e = aVar.mo8007d(":status");
        f4666f = aVar.mo8007d(":method");
        f4667g = aVar.mo8007d(":path");
        f4668h = aVar.mo8007d(":scheme");
        f4669i = aVar.mo8007d(":authority");
    }

    public C1306c(C2115i iVar, C2115i iVar2) {
        C1924k.m9142h(iVar, "name");
        C1924k.m9142h(iVar2, "value");
        this.f4672b = iVar;
        this.f4673c = iVar2;
        this.f4671a = iVar.mo7999u() + 32 + iVar2.mo7999u();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1306c(C2115i iVar, String str) {
        this(iVar, C2115i.f7358h.mo8007d(str));
        C1924k.m9142h(iVar, "name");
        C1924k.m9142h(str, "value");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1306c(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            p041f3.C1924k.m9142h(r2, r0)
            java.lang.String r0 = "value"
            p041f3.C1924k.m9142h(r3, r0)
            i4.i$a r0 = p062i4.C2115i.f7358h
            i4.i r2 = r0.mo8007d(r2)
            i4.i r3 = r0.mo8007d(r3)
            r1.<init>((p062i4.C2115i) r2, (p062i4.C2115i) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p021c4.C1306c.<init>(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final C2115i mo5132a() {
        return this.f4672b;
    }

    /* renamed from: b */
    public final C2115i mo5133b() {
        return this.f4673c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1306c)) {
            return false;
        }
        C1306c cVar = (C1306c) obj;
        return C1924k.m9136b(this.f4672b, cVar.f4672b) && C1924k.m9136b(this.f4673c, cVar.f4673c);
    }

    public int hashCode() {
        C2115i iVar = this.f4672b;
        int i = 0;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        C2115i iVar2 = this.f4673c;
        if (iVar2 != null) {
            i = iVar2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return this.f4672b.mo8002x() + ": " + this.f4673c.mo8002x();
    }
}
