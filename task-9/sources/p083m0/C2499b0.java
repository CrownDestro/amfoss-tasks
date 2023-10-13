package p083m0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: m0.b0 */
class C2499b0 extends C2497a0 {

    /* renamed from: f */
    private static boolean f8495f = true;

    /* renamed from: g */
    private static boolean f8496g = true;

    C2499b0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo9114h(View view, Matrix matrix) {
        if (f8495f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f8495f = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo9115i(View view, Matrix matrix) {
        if (f8496g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f8496g = false;
            }
        }
    }
}
