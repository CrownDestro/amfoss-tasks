package p041f3;

import p074k3.C2384a;
import p074k3.C2389f;

/* renamed from: f3.p */
public abstract class C1929p extends C1914c implements C2389f {

    /* renamed from: k */
    private final boolean f6900k;

    public C1929p() {
        this.f6900k = false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1929p(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        boolean z = false;
        this.f6900k = (i & 2) == 2 ? true : z;
    }

    /* renamed from: a */
    public C2384a mo7649a() {
        return this.f6900k ? this : super.mo7649a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1929p) {
            C1929p pVar = (C1929p) obj;
            return mo7653g().equals(pVar.mo7653g()) && mo7652e().equals(pVar.mo7652e()) && mo7654h().equals(pVar.mo7654h()) && C1924k.m9136b(mo7651d(), pVar.mo7651d());
        } else if (obj instanceof C2389f) {
            return obj.equals(mo7649a());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((mo7653g().hashCode() * 31) + mo7652e().hashCode()) * 31) + mo7654h().hashCode();
    }

    public String toString() {
        C2384a a = mo7649a();
        if (a != this) {
            return a.toString();
        }
        return "property " + mo7652e() + " (Kotlin reflection is not available)";
    }
}
