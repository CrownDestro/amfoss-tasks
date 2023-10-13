package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.layout.C1205j;
import java.util.Objects;
import p041f3.C1920g;
import p041f3.C1924k;
import p101p0.C2905b;

/* renamed from: androidx.window.layout.k */
public final class C1210k implements C1205j {

    /* renamed from: d */
    public static final C1211a f4225d = new C1211a((C1920g) null);

    /* renamed from: a */
    private final C2905b f4226a;

    /* renamed from: b */
    private final C1212b f4227b;

    /* renamed from: c */
    private final C1205j.C1208b f4228c;

    /* renamed from: androidx.window.layout.k$a */
    public static final class C1211a {
        private C1211a() {
        }

        public /* synthetic */ C1211a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo5022a(C2905b bVar) {
            C1924k.m9141g(bVar, "bounds");
            boolean z = false;
            if ((bVar.mo10070d() == 0 && bVar.mo10067a() == 0) ? false : true) {
                if (bVar.mo10068b() == 0 || bVar.mo10069c() == 0) {
                    z = true;
                }
                if (!z) {
                    throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
                }
                return;
            }
            throw new IllegalArgumentException("Bounds must be non zero".toString());
        }
    }

    /* renamed from: androidx.window.layout.k$b */
    public static final class C1212b {

        /* renamed from: b */
        public static final C1213a f4229b = new C1213a((C1920g) null);
        /* access modifiers changed from: private */

        /* renamed from: c */
        public static final C1212b f4230c = new C1212b("FOLD");
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static final C1212b f4231d = new C1212b("HINGE");

        /* renamed from: a */
        private final String f4232a;

        /* renamed from: androidx.window.layout.k$b$a */
        public static final class C1213a {
            private C1213a() {
            }

            public /* synthetic */ C1213a(C1920g gVar) {
                this();
            }

            /* renamed from: a */
            public final C1212b mo5024a() {
                return C1212b.f4230c;
            }

            /* renamed from: b */
            public final C1212b mo5025b() {
                return C1212b.f4231d;
            }
        }

        private C1212b(String str) {
            this.f4232a = str;
        }

        public String toString() {
            return this.f4232a;
        }
    }

    public C1210k(C2905b bVar, C1212b bVar2, C1205j.C1208b bVar3) {
        C1924k.m9141g(bVar, "featureBounds");
        C1924k.m9141g(bVar2, "type");
        C1924k.m9141g(bVar3, "state");
        this.f4226a = bVar;
        this.f4227b = bVar2;
        this.f4228c = bVar3;
        f4225d.mo5022a(bVar);
    }

    /* renamed from: a */
    public Rect mo5004a() {
        return this.f4226a.mo10073f();
    }

    /* renamed from: b */
    public C1205j.C1206a mo5015b() {
        return (this.f4226a.mo10070d() == 0 || this.f4226a.mo10067a() == 0) ? C1205j.C1206a.f4218c : C1205j.C1206a.f4219d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1924k.m9136b(C1210k.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        C1210k kVar = (C1210k) obj;
        return C1924k.m9136b(this.f4226a, kVar.f4226a) && C1924k.m9136b(this.f4227b, kVar.f4227b) && C1924k.m9136b(getState(), kVar.getState());
    }

    public C1205j.C1208b getState() {
        return this.f4228c;
    }

    public int hashCode() {
        return (((this.f4226a.hashCode() * 31) + this.f4227b.hashCode()) * 31) + getState().hashCode();
    }

    public String toString() {
        return C1210k.class.getSimpleName() + " { " + this.f4226a + ", type=" + this.f4227b + ", state=" + getState() + " }";
    }
}
