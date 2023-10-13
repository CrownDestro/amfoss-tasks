package p083m0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* renamed from: m0.w */
class C2559w {

    /* renamed from: a */
    private static boolean f8658a = true;

    /* renamed from: a */
    static C2558v m11728a(ViewGroup viewGroup) {
        return new C2557u(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private static void m11729b(ViewGroup viewGroup, boolean z) {
        if (f8658a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f8658a = false;
            }
        }
    }

    /* renamed from: c */
    static void m11730c(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            m11729b(viewGroup, z);
        }
    }
}
