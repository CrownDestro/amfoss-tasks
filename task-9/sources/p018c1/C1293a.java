package p018c1;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.C0510d;
import p053h1.C2007b;
import p119s0.C3096b;
import p161z0.C3622a;

/* renamed from: c1.a */
public class C1293a {

    /* renamed from: f */
    private static final int f4616f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a */
    private final boolean f4617a;

    /* renamed from: b */
    private final int f4618b;

    /* renamed from: c */
    private final int f4619c;

    /* renamed from: d */
    private final int f4620d;

    /* renamed from: e */
    private final float f4621e;

    public C1293a(Context context) {
        this(C2007b.m9261b(context, C3096b.elevationOverlayEnabled, false), C3622a.m16068b(context, C3096b.elevationOverlayColor, 0), C3622a.m16068b(context, C3096b.elevationOverlayAccentColor, 0), C3622a.m16068b(context, C3096b.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    public C1293a(boolean z, int i, int i2, int i3, float f) {
        this.f4617a = z;
        this.f4618b = i;
        this.f4619c = i2;
        this.f4620d = i3;
        this.f4621e = f;
    }

    /* renamed from: f */
    private boolean m6169f(int i) {
        return C0510d.m2339k(i, 255) == this.f4620d;
    }

    /* renamed from: a */
    public float mo5115a(float f) {
        float f2 = this.f4621e;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int mo5116b(int i, float f) {
        int i2;
        float a = mo5115a(f);
        int alpha = Color.alpha(i);
        int j = C3622a.m16076j(C0510d.m2339k(i, 255), this.f4618b, a);
        if (a > 0.0f && (i2 = this.f4619c) != 0) {
            j = C3622a.m16075i(j, C0510d.m2339k(i2, f4616f));
        }
        return C0510d.m2339k(j, alpha);
    }

    /* renamed from: c */
    public int mo5117c(int i, float f) {
        return (!this.f4617a || !m6169f(i)) ? i : mo5116b(i, f);
    }

    /* renamed from: d */
    public int mo5118d(float f) {
        return mo5117c(this.f4620d, f);
    }

    /* renamed from: e */
    public boolean mo5119e() {
        return this.f4617a;
    }
}
