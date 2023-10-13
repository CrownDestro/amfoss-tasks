package p083m0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: m0.h */
class C2532h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f8580a;

    /* renamed from: b */
    private final PathMeasure f8581b;

    /* renamed from: c */
    private final float f8582c;

    /* renamed from: d */
    private final float[] f8583d = new float[2];

    /* renamed from: e */
    private final PointF f8584e = new PointF();

    /* renamed from: f */
    private float f8585f;

    C2532h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f8580a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f8581b = pathMeasure;
        this.f8582c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f8585f);
    }

    /* renamed from: b */
    public void set(T t, Float f) {
        this.f8585f = f.floatValue();
        this.f8581b.getPosTan(this.f8582c * f.floatValue(), this.f8583d, (float[]) null);
        PointF pointF = this.f8584e;
        float[] fArr = this.f8583d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f8580a.set(t, pointF);
    }
}
