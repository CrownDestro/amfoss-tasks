package p041f3;

import p074k3.C2384a;
import p074k3.C2387d;

/* renamed from: f3.i */
public class C1922i extends C1914c implements C1921h, C2387d {

    /* renamed from: k */
    private final int f6895k;

    /* renamed from: l */
    private final int f6896l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1922i(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f6895k = i;
        this.f6896l = i2 >> 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C2384a mo7650b() {
        return C1933t.m9160a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1922i) {
            C1922i iVar = (C1922i) obj;
            return mo7652e().equals(iVar.mo7652e()) && mo7654h().equals(iVar.mo7654h()) && this.f6896l == iVar.f6896l && this.f6895k == iVar.f6895k && C1924k.m9136b(mo7651d(), iVar.mo7651d()) && C1924k.m9136b(mo7653g(), iVar.mo7653g());
        } else if (obj instanceof C2387d) {
            return obj.equals(mo7649a());
        } else {
            return false;
        }
    }

    /* renamed from: f */
    public int mo7661f() {
        return this.f6895k;
    }

    public int hashCode() {
        return (((mo7653g() == null ? 0 : mo7653g().hashCode() * 31) + mo7652e().hashCode()) * 31) + mo7654h().hashCode();
    }

    public String toString() {
        C2384a a = mo7649a();
        if (a != this) {
            return a.toString();
        }
        if ("<init>".equals(mo7652e())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + mo7652e() + " (Kotlin reflection is not available)";
    }
}
