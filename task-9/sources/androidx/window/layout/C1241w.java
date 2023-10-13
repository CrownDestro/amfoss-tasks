package androidx.window.layout;

import android.graphics.Rect;
import p041f3.C1924k;
import p101p0.C2905b;

/* renamed from: androidx.window.layout.w */
public final class C1241w {

    /* renamed from: a */
    private final C2905b f4276a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1241w(Rect rect) {
        this(new C2905b(rect));
        C1924k.m9141g(rect, "bounds");
    }

    public C1241w(C2905b bVar) {
        C1924k.m9141g(bVar, "_bounds");
        this.f4276a = bVar;
    }

    /* renamed from: a */
    public final Rect mo5064a() {
        return this.f4276a.mo10073f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C1924k.m9136b(C1241w.class, obj.getClass())) {
            return false;
        }
        return C1924k.m9136b(this.f4276a, ((C1241w) obj).f4276a);
    }

    public int hashCode() {
        return this.f4276a.hashCode();
    }

    public String toString() {
        return "WindowMetrics { bounds: " + mo5064a() + " }";
    }
}
