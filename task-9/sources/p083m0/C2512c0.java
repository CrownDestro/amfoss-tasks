package p083m0;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: m0.c0 */
class C2512c0 extends C2499b0 {

    /* renamed from: h */
    private static boolean f8534h = true;

    C2512c0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo9153e(View view, int i, int i2, int i3, int i4) {
        if (f8534h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f8534h = false;
            }
        }
    }
}
