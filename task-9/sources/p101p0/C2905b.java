package p101p0;

import android.graphics.Rect;
import java.util.Objects;
import p041f3.C1924k;

/* renamed from: p0.b */
public final class C2905b {

    /* renamed from: a */
    private final int f9632a;

    /* renamed from: b */
    private final int f9633b;

    /* renamed from: c */
    private final int f9634c;

    /* renamed from: d */
    private final int f9635d;

    public C2905b(int i, int i2, int i3, int i4) {
        this.f9632a = i;
        this.f9633b = i2;
        this.f9634c = i3;
        this.f9635d = i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2905b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        C1924k.m9141g(rect, "rect");
    }

    /* renamed from: a */
    public final int mo10067a() {
        return this.f9635d - this.f9633b;
    }

    /* renamed from: b */
    public final int mo10068b() {
        return this.f9632a;
    }

    /* renamed from: c */
    public final int mo10069c() {
        return this.f9633b;
    }

    /* renamed from: d */
    public final int mo10070d() {
        return this.f9634c - this.f9632a;
    }

    /* renamed from: e */
    public final boolean mo10071e() {
        return mo10067a() == 0 && mo10070d() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1924k.m9136b(C2905b.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        C2905b bVar = (C2905b) obj;
        return this.f9632a == bVar.f9632a && this.f9633b == bVar.f9633b && this.f9634c == bVar.f9634c && this.f9635d == bVar.f9635d;
    }

    /* renamed from: f */
    public final Rect mo10073f() {
        return new Rect(this.f9632a, this.f9633b, this.f9634c, this.f9635d);
    }

    public int hashCode() {
        return (((((this.f9632a * 31) + this.f9633b) * 31) + this.f9634c) * 31) + this.f9635d;
    }

    public String toString() {
        return C2905b.class.getSimpleName() + " { [" + this.f9632a + ',' + this.f9633b + ',' + this.f9634c + ',' + this.f9635d + "] }";
    }
}
