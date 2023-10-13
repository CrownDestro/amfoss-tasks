package p083m0;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: m0.a0 */
class C2497a0 extends C2526f0 {

    /* renamed from: e */
    private static boolean f8494e = true;

    C2497a0() {
    }

    /* renamed from: a */
    public void mo9110a(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public float mo9111c(View view) {
        if (f8494e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f8494e = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo9112d(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo9113f(View view, float f) {
        if (f8494e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f8494e = false;
            }
        }
        view.setAlpha(f);
    }
}
