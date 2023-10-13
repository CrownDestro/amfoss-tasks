package p072k1;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: k1.b */
public final class C2354b implements C2355c {

    /* renamed from: a */
    private final C2355c f8111a;

    /* renamed from: b */
    private final float f8112b;

    public C2354b(float f, C2355c cVar) {
        while (cVar instanceof C2354b) {
            cVar = ((C2354b) cVar).f8111a;
            f += ((C2354b) cVar).f8112b;
        }
        this.f8111a = cVar;
        this.f8112b = f;
    }

    /* renamed from: a */
    public float mo8815a(RectF rectF) {
        return Math.max(0.0f, this.f8111a.mo8815a(rectF) + this.f8112b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2354b)) {
            return false;
        }
        C2354b bVar = (C2354b) obj;
        return this.f8111a.equals(bVar.f8111a) && this.f8112b == bVar.f8112b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8111a, Float.valueOf(this.f8112b)});
    }
}
