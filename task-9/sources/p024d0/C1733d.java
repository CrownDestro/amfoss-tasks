package p024d0;

import android.view.animation.Interpolator;

/* renamed from: d0.d */
abstract class C1733d implements Interpolator {

    /* renamed from: a */
    private final float[] f6486a;

    /* renamed from: b */
    private final float f6487b;

    protected C1733d(float[] fArr) {
        this.f6486a = fArr;
        this.f6487b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f6486a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f6487b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f6486a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
