package p072k1;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: k1.a */
public final class C2353a implements C2355c {

    /* renamed from: a */
    private final float f8110a;

    public C2353a(float f) {
        this.f8110a = f;
    }

    /* renamed from: a */
    public float mo8815a(RectF rectF) {
        return this.f8110a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2353a) && this.f8110a == ((C2353a) obj).f8110a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8110a)});
    }
}
