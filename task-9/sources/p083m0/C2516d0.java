package p083m0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: m0.d0 */
class C2516d0 extends C2512c0 {

    /* renamed from: i */
    private static boolean f8539i = true;

    C2516d0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo9158g(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo9158g(view, i);
        } else if (f8539i) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f8539i = false;
            }
        }
    }
}
