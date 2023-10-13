package p083m0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.C0735z;

/* renamed from: m0.z */
class C2562z {

    /* renamed from: a */
    private static final C2526f0 f8660a;

    /* renamed from: b */
    static final Property<View, Float> f8661b = new C2563a(Float.class, "translationAlpha");

    /* renamed from: c */
    static final Property<View, Rect> f8662c = new C2564b(Rect.class, "clipBounds");

    /* renamed from: m0.z$a */
    class C2563a extends Property<View, Float> {
        C2563a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C2562z.m11737c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C2562z.m11741g(view, f.floatValue());
        }
    }

    /* renamed from: m0.z$b */
    class C2564b extends Property<View, Rect> {
        C2564b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C0735z.m3237w(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            C0735z.m3242y0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f8660a = i >= 29 ? new C2524e0() : i >= 23 ? new C2516d0() : i >= 22 ? new C2512c0() : i >= 21 ? new C2499b0() : new C2497a0();
    }

    /* renamed from: a */
    static void m11735a(View view) {
        f8660a.mo9110a(view);
    }

    /* renamed from: b */
    static C2561y m11736b(View view) {
        return new C2560x(view);
    }

    /* renamed from: c */
    static float m11737c(View view) {
        return f8660a.mo9111c(view);
    }

    /* renamed from: d */
    static C2535i0 m11738d(View view) {
        return new C2533h0(view);
    }

    /* renamed from: e */
    static void m11739e(View view) {
        f8660a.mo9112d(view);
    }

    /* renamed from: f */
    static void m11740f(View view, int i, int i2, int i3, int i4) {
        f8660a.mo9153e(view, i, i2, i3, i4);
    }

    /* renamed from: g */
    static void m11741g(View view, float f) {
        f8660a.mo9113f(view, f);
    }

    /* renamed from: h */
    static void m11742h(View view, int i) {
        f8660a.mo9158g(view, i);
    }

    /* renamed from: i */
    static void m11743i(View view, Matrix matrix) {
        f8660a.mo9114h(view, matrix);
    }

    /* renamed from: j */
    static void m11744j(View view, Matrix matrix) {
        f8660a.mo9115i(view, matrix);
    }
}
