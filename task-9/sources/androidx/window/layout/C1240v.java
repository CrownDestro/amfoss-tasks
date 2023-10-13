package androidx.window.layout;

import java.util.List;
import p034e3.C1780l;
import p041f3.C1924k;

/* renamed from: androidx.window.layout.v */
public final class C1240v {

    /* renamed from: a */
    private final List<C1198e> f4275a;

    public C1240v(List<? extends C1198e> list) {
        C1924k.m9141g(list, "displayFeatures");
        this.f4275a = list;
    }

    /* renamed from: a */
    public final List<C1198e> mo5060a() {
        return this.f4275a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C1924k.m9136b(C1240v.class, obj.getClass())) {
            return false;
        }
        return C1924k.m9136b(this.f4275a, ((C1240v) obj).f4275a);
    }

    public int hashCode() {
        return this.f4275a.hashCode();
    }

    public String toString() {
        return C3271t.m14390E(this.f4275a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, (CharSequence) null, (C1780l) null, 56, (Object) null);
    }
}
