package p072k1;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C1544r;

/* renamed from: k1.h */
public class C2363h {
    /* renamed from: a */
    static C2356d m11006a(int i) {
        return i != 0 ? i != 1 ? m11007b() : new C2357e() : new C2365j();
    }

    /* renamed from: b */
    static C2356d m11007b() {
        return new C2365j();
    }

    /* renamed from: c */
    static C2358f m11008c() {
        return new C2358f();
    }

    /* renamed from: d */
    public static void m11009d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C2359g) {
            ((C2359g) background).mo8835U(f);
        }
    }

    /* renamed from: e */
    public static void m11010e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C2359g) {
            m11011f(view, (C2359g) background);
        }
    }

    /* renamed from: f */
    public static void m11011f(View view, C2359g gVar) {
        if (gVar.mo8831N()) {
            gVar.mo8839Y(C1544r.m7727d(view));
        }
    }
}
