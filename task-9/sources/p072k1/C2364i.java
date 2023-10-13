package p072k1;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: k1.i */
public final class C2364i implements C2355c {

    /* renamed from: a */
    private final float f8164a;

    public C2364i(float f) {
        this.f8164a = f;
    }

    /* renamed from: b */
    private static float m11012b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    /* renamed from: a */
    public float mo8815a(RectF rectF) {
        return this.f8164a * m11012b(rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2364i) && this.f8164a == ((C2364i) obj).f8164a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8164a)});
    }
}
