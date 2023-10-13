package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.C0480d;
import androidx.core.content.res.C0502k;
import androidx.core.graphics.C0529g;
import androidx.core.graphics.drawable.C0515a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p070k.C2335a;

/* renamed from: androidx.vectordrawable.graphics.drawable.i */
public class C1177i extends C1176h {

    /* renamed from: n */
    static final PorterDuff.Mode f4101n = PorterDuff.Mode.SRC_IN;

    /* renamed from: e */
    private C1185h f4102e;

    /* renamed from: f */
    private PorterDuffColorFilter f4103f;

    /* renamed from: g */
    private ColorFilter f4104g;

    /* renamed from: h */
    private boolean f4105h;

    /* renamed from: i */
    private boolean f4106i;

    /* renamed from: j */
    private Drawable.ConstantState f4107j;

    /* renamed from: k */
    private final float[] f4108k;

    /* renamed from: l */
    private final Matrix f4109l;

    /* renamed from: m */
    private final Rect f4110m;

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$b */
    private static class C1179b extends C1183f {
        C1179b() {
        }

        C1179b(C1179b bVar) {
            super(bVar);
        }

        /* renamed from: f */
        private void m5837f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4137b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f4136a = C0529g.m2419d(string2);
            }
            this.f4138c = C0502k.m2304k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        /* renamed from: c */
        public boolean mo4869c() {
            return true;
        }

        /* renamed from: e */
        public void mo4870e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0502k.m2311r(xmlPullParser, "pathData")) {
                TypedArray s = C0502k.m2312s(resources, theme, attributeSet, C1163a.f4070d);
                m5837f(s, xmlPullParser);
                s.recycle();
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$c */
    private static class C1180c extends C1183f {

        /* renamed from: e */
        private int[] f4111e;

        /* renamed from: f */
        C0480d f4112f;

        /* renamed from: g */
        float f4113g = 0.0f;

        /* renamed from: h */
        C0480d f4114h;

        /* renamed from: i */
        float f4115i = 1.0f;

        /* renamed from: j */
        float f4116j = 1.0f;

        /* renamed from: k */
        float f4117k = 0.0f;

        /* renamed from: l */
        float f4118l = 1.0f;

        /* renamed from: m */
        float f4119m = 0.0f;

        /* renamed from: n */
        Paint.Cap f4120n = Paint.Cap.BUTT;

        /* renamed from: o */
        Paint.Join f4121o = Paint.Join.MITER;

        /* renamed from: p */
        float f4122p = 4.0f;

        C1180c() {
        }

        C1180c(C1180c cVar) {
            super(cVar);
            this.f4111e = cVar.f4111e;
            this.f4112f = cVar.f4112f;
            this.f4113g = cVar.f4113g;
            this.f4115i = cVar.f4115i;
            this.f4114h = cVar.f4114h;
            this.f4138c = cVar.f4138c;
            this.f4116j = cVar.f4116j;
            this.f4117k = cVar.f4117k;
            this.f4118l = cVar.f4118l;
            this.f4119m = cVar.f4119m;
            this.f4120n = cVar.f4120n;
            this.f4121o = cVar.f4121o;
            this.f4122p = cVar.f4122p;
        }

        /* renamed from: e */
        private Paint.Cap m5840e(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: f */
        private Paint.Join m5841f(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: h */
        private void m5842h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f4111e = null;
            if (C0502k.m2311r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f4137b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f4136a = C0529g.m2419d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f4114h = C0502k.m2302i(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f4116j = C0502k.m2303j(typedArray, xmlPullParser, "fillAlpha", 12, this.f4116j);
                this.f4120n = m5840e(C0502k.m2304k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f4120n);
                this.f4121o = m5841f(C0502k.m2304k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f4121o);
                this.f4122p = C0502k.m2303j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f4122p);
                this.f4112f = C0502k.m2302i(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f4115i = C0502k.m2303j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f4115i);
                this.f4113g = C0502k.m2303j(typedArray, xmlPullParser, "strokeWidth", 4, this.f4113g);
                this.f4118l = C0502k.m2303j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f4118l);
                this.f4119m = C0502k.m2303j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f4119m);
                this.f4117k = C0502k.m2303j(typedArray, xmlPullParser, "trimPathStart", 5, this.f4117k);
                this.f4138c = C0502k.m2304k(typedArray, xmlPullParser, "fillType", 13, this.f4138c);
            }
        }

        /* renamed from: a */
        public boolean mo4871a() {
            return this.f4114h.mo2460i() || this.f4112f.mo2460i();
        }

        /* renamed from: b */
        public boolean mo4872b(int[] iArr) {
            return this.f4112f.mo2461j(iArr) | this.f4114h.mo2461j(iArr);
        }

        /* renamed from: g */
        public void mo4873g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = C0502k.m2312s(resources, theme, attributeSet, C1163a.f4069c);
            m5842h(s, xmlPullParser, theme);
            s.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f4116j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f4114h.mo2457e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f4115i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f4112f.mo2457e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f4113g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f4118l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f4119m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f4117k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f4116j = f;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f4114h.mo2462k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f4115i = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f4112f.mo2462k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f4113g = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f4118l = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f4119m = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f4117k = f;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$d */
    private static class C1181d extends C1182e {

        /* renamed from: a */
        final Matrix f4123a;

        /* renamed from: b */
        final ArrayList<C1182e> f4124b;

        /* renamed from: c */
        float f4125c;

        /* renamed from: d */
        private float f4126d;

        /* renamed from: e */
        private float f4127e;

        /* renamed from: f */
        private float f4128f;

        /* renamed from: g */
        private float f4129g;

        /* renamed from: h */
        private float f4130h;

        /* renamed from: i */
        private float f4131i;

        /* renamed from: j */
        final Matrix f4132j;

        /* renamed from: k */
        int f4133k;

        /* renamed from: l */
        private int[] f4134l;

        /* renamed from: m */
        private String f4135m;

        public C1181d() {
            super();
            this.f4123a = new Matrix();
            this.f4124b = new ArrayList<>();
            this.f4125c = 0.0f;
            this.f4126d = 0.0f;
            this.f4127e = 0.0f;
            this.f4128f = 1.0f;
            this.f4129g = 1.0f;
            this.f4130h = 0.0f;
            this.f4131i = 0.0f;
            this.f4132j = new Matrix();
            this.f4135m = null;
        }

        public C1181d(C1181d dVar, C2335a<String, Object> aVar) {
            super();
            C1183f fVar;
            this.f4123a = new Matrix();
            this.f4124b = new ArrayList<>();
            this.f4125c = 0.0f;
            this.f4126d = 0.0f;
            this.f4127e = 0.0f;
            this.f4128f = 1.0f;
            this.f4129g = 1.0f;
            this.f4130h = 0.0f;
            this.f4131i = 0.0f;
            Matrix matrix = new Matrix();
            this.f4132j = matrix;
            this.f4135m = null;
            this.f4125c = dVar.f4125c;
            this.f4126d = dVar.f4126d;
            this.f4127e = dVar.f4127e;
            this.f4128f = dVar.f4128f;
            this.f4129g = dVar.f4129g;
            this.f4130h = dVar.f4130h;
            this.f4131i = dVar.f4131i;
            this.f4134l = dVar.f4134l;
            String str = dVar.f4135m;
            this.f4135m = str;
            this.f4133k = dVar.f4133k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f4132j);
            ArrayList<C1182e> arrayList = dVar.f4124b;
            for (int i = 0; i < arrayList.size(); i++) {
                C1182e eVar = arrayList.get(i);
                if (eVar instanceof C1181d) {
                    this.f4124b.add(new C1181d((C1181d) eVar, aVar));
                } else {
                    if (eVar instanceof C1180c) {
                        fVar = new C1180c((C1180c) eVar);
                    } else if (eVar instanceof C1179b) {
                        fVar = new C1179b((C1179b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f4124b.add(fVar);
                    String str2 = fVar.f4137b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m5846d() {
            this.f4132j.reset();
            this.f4132j.postTranslate(-this.f4126d, -this.f4127e);
            this.f4132j.postScale(this.f4128f, this.f4129g);
            this.f4132j.postRotate(this.f4125c, 0.0f, 0.0f);
            this.f4132j.postTranslate(this.f4130h + this.f4126d, this.f4131i + this.f4127e);
        }

        /* renamed from: e */
        private void m5847e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f4134l = null;
            this.f4125c = C0502k.m2303j(typedArray, xmlPullParser, "rotation", 5, this.f4125c);
            this.f4126d = typedArray.getFloat(1, this.f4126d);
            this.f4127e = typedArray.getFloat(2, this.f4127e);
            this.f4128f = C0502k.m2303j(typedArray, xmlPullParser, "scaleX", 3, this.f4128f);
            this.f4129g = C0502k.m2303j(typedArray, xmlPullParser, "scaleY", 4, this.f4129g);
            this.f4130h = C0502k.m2303j(typedArray, xmlPullParser, "translateX", 6, this.f4130h);
            this.f4131i = C0502k.m2303j(typedArray, xmlPullParser, "translateY", 7, this.f4131i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4135m = string;
            }
            m5846d();
        }

        /* renamed from: a */
        public boolean mo4871a() {
            for (int i = 0; i < this.f4124b.size(); i++) {
                if (this.f4124b.get(i).mo4871a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo4872b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f4124b.size(); i++) {
                z |= this.f4124b.get(i).mo4872b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void mo4890c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = C0502k.m2312s(resources, theme, attributeSet, C1163a.f4068b);
            m5847e(s, xmlPullParser);
            s.recycle();
        }

        public String getGroupName() {
            return this.f4135m;
        }

        public Matrix getLocalMatrix() {
            return this.f4132j;
        }

        public float getPivotX() {
            return this.f4126d;
        }

        public float getPivotY() {
            return this.f4127e;
        }

        public float getRotation() {
            return this.f4125c;
        }

        public float getScaleX() {
            return this.f4128f;
        }

        public float getScaleY() {
            return this.f4129g;
        }

        public float getTranslateX() {
            return this.f4130h;
        }

        public float getTranslateY() {
            return this.f4131i;
        }

        public void setPivotX(float f) {
            if (f != this.f4126d) {
                this.f4126d = f;
                m5846d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f4127e) {
                this.f4127e = f;
                m5846d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f4125c) {
                this.f4125c = f;
                m5846d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f4128f) {
                this.f4128f = f;
                m5846d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f4129g) {
                this.f4129g = f;
                m5846d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f4130h) {
                this.f4130h = f;
                m5846d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f4131i) {
                this.f4131i = f;
                m5846d();
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$e */
    private static abstract class C1182e {
        private C1182e() {
        }

        /* renamed from: a */
        public boolean mo4871a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo4872b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$f */
    private static abstract class C1183f extends C1182e {

        /* renamed from: a */
        protected C0529g.C0531b[] f4136a = null;

        /* renamed from: b */
        String f4137b;

        /* renamed from: c */
        int f4138c = 0;

        /* renamed from: d */
        int f4139d;

        public C1183f() {
            super();
        }

        public C1183f(C1183f fVar) {
            super();
            this.f4137b = fVar.f4137b;
            this.f4139d = fVar.f4139d;
            this.f4136a = C0529g.m2421f(fVar.f4136a);
        }

        /* renamed from: c */
        public boolean mo4869c() {
            return false;
        }

        /* renamed from: d */
        public void mo4907d(Path path) {
            path.reset();
            C0529g.C0531b[] bVarArr = this.f4136a;
            if (bVarArr != null) {
                C0529g.C0531b.m2429e(bVarArr, path);
            }
        }

        public C0529g.C0531b[] getPathData() {
            return this.f4136a;
        }

        public String getPathName() {
            return this.f4137b;
        }

        public void setPathData(C0529g.C0531b[] bVarArr) {
            if (!C0529g.m2417b(this.f4136a, bVarArr)) {
                this.f4136a = C0529g.m2421f(bVarArr);
            } else {
                C0529g.m2425j(this.f4136a, bVarArr);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$g */
    private static class C1184g {

        /* renamed from: q */
        private static final Matrix f4140q = new Matrix();

        /* renamed from: a */
        private final Path f4141a;

        /* renamed from: b */
        private final Path f4142b;

        /* renamed from: c */
        private final Matrix f4143c;

        /* renamed from: d */
        Paint f4144d;

        /* renamed from: e */
        Paint f4145e;

        /* renamed from: f */
        private PathMeasure f4146f;

        /* renamed from: g */
        private int f4147g;

        /* renamed from: h */
        final C1181d f4148h;

        /* renamed from: i */
        float f4149i;

        /* renamed from: j */
        float f4150j;

        /* renamed from: k */
        float f4151k;

        /* renamed from: l */
        float f4152l;

        /* renamed from: m */
        int f4153m;

        /* renamed from: n */
        String f4154n;

        /* renamed from: o */
        Boolean f4155o;

        /* renamed from: p */
        final C2335a<String, Object> f4156p;

        public C1184g() {
            this.f4143c = new Matrix();
            this.f4149i = 0.0f;
            this.f4150j = 0.0f;
            this.f4151k = 0.0f;
            this.f4152l = 0.0f;
            this.f4153m = 255;
            this.f4154n = null;
            this.f4155o = null;
            this.f4156p = new C2335a<>();
            this.f4148h = new C1181d();
            this.f4141a = new Path();
            this.f4142b = new Path();
        }

        public C1184g(C1184g gVar) {
            this.f4143c = new Matrix();
            this.f4149i = 0.0f;
            this.f4150j = 0.0f;
            this.f4151k = 0.0f;
            this.f4152l = 0.0f;
            this.f4153m = 255;
            this.f4154n = null;
            this.f4155o = null;
            C2335a<String, Object> aVar = new C2335a<>();
            this.f4156p = aVar;
            this.f4148h = new C1181d(gVar.f4148h, aVar);
            this.f4141a = new Path(gVar.f4141a);
            this.f4142b = new Path(gVar.f4142b);
            this.f4149i = gVar.f4149i;
            this.f4150j = gVar.f4150j;
            this.f4151k = gVar.f4151k;
            this.f4152l = gVar.f4152l;
            this.f4147g = gVar.f4147g;
            this.f4153m = gVar.f4153m;
            this.f4154n = gVar.f4154n;
            String str = gVar.f4154n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f4155o = gVar.f4155o;
        }

        /* renamed from: a */
        private static float m5855a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: c */
        private void m5856c(C1181d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f4123a.set(matrix);
            dVar.f4123a.preConcat(dVar.f4132j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f4124b.size(); i3++) {
                C1182e eVar = dVar.f4124b.get(i3);
                if (eVar instanceof C1181d) {
                    m5856c((C1181d) eVar, dVar.f4123a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C1183f) {
                    m5857d(dVar, (C1183f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m5857d(C1181d dVar, C1183f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f4151k;
            float f2 = ((float) i2) / this.f4152l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f4123a;
            this.f4143c.set(matrix);
            this.f4143c.postScale(f, f2);
            float e = m5858e(matrix);
            if (e != 0.0f) {
                fVar.mo4907d(this.f4141a);
                Path path = this.f4141a;
                this.f4142b.reset();
                if (fVar.mo4869c()) {
                    this.f4142b.setFillType(fVar.f4138c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f4142b.addPath(path, this.f4143c);
                    canvas.clipPath(this.f4142b);
                    return;
                }
                C1180c cVar = (C1180c) fVar;
                float f3 = cVar.f4117k;
                if (!(f3 == 0.0f && cVar.f4118l == 1.0f)) {
                    float f4 = cVar.f4119m;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.f4118l + f4) % 1.0f;
                    if (this.f4146f == null) {
                        this.f4146f = new PathMeasure();
                    }
                    this.f4146f.setPath(this.f4141a, false);
                    float length = this.f4146f.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f4146f.getSegment(f7, length, path, true);
                        this.f4146f.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f4146f.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f4142b.addPath(path, this.f4143c);
                if (cVar.f4114h.mo2463l()) {
                    C0480d dVar2 = cVar.f4114h;
                    if (this.f4145e == null) {
                        Paint paint = new Paint(1);
                        this.f4145e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f4145e;
                    if (dVar2.mo2459h()) {
                        Shader f9 = dVar2.mo2458f();
                        f9.setLocalMatrix(this.f4143c);
                        paint2.setShader(f9);
                        paint2.setAlpha(Math.round(cVar.f4116j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(C1177i.m5827a(dVar2.mo2457e(), cVar.f4116j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f4142b.setFillType(cVar.f4138c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f4142b, paint2);
                }
                if (cVar.f4112f.mo2463l()) {
                    C0480d dVar3 = cVar.f4112f;
                    if (this.f4144d == null) {
                        Paint paint3 = new Paint(1);
                        this.f4144d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f4144d;
                    Paint.Join join = cVar.f4121o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f4120n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f4122p);
                    if (dVar3.mo2459h()) {
                        Shader f10 = dVar3.mo2458f();
                        f10.setLocalMatrix(this.f4143c);
                        paint4.setShader(f10);
                        paint4.setAlpha(Math.round(cVar.f4115i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(C1177i.m5827a(dVar3.mo2457e(), cVar.f4115i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f4113g * min * e);
                    canvas.drawPath(this.f4142b, paint4);
                }
            }
        }

        /* renamed from: e */
        private float m5858e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = m5855a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: b */
        public void mo4911b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m5856c(this.f4148h, f4140q, canvas, i, i2, colorFilter);
        }

        /* renamed from: f */
        public boolean mo4912f() {
            if (this.f4155o == null) {
                this.f4155o = Boolean.valueOf(this.f4148h.mo4871a());
            }
            return this.f4155o.booleanValue();
        }

        /* renamed from: g */
        public boolean mo4913g(int[] iArr) {
            return this.f4148h.mo4872b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f4153m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f4153m = i;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$h */
    private static class C1185h extends Drawable.ConstantState {

        /* renamed from: a */
        int f4157a;

        /* renamed from: b */
        C1184g f4158b;

        /* renamed from: c */
        ColorStateList f4159c;

        /* renamed from: d */
        PorterDuff.Mode f4160d;

        /* renamed from: e */
        boolean f4161e;

        /* renamed from: f */
        Bitmap f4162f;

        /* renamed from: g */
        ColorStateList f4163g;

        /* renamed from: h */
        PorterDuff.Mode f4164h;

        /* renamed from: i */
        int f4165i;

        /* renamed from: j */
        boolean f4166j;

        /* renamed from: k */
        boolean f4167k;

        /* renamed from: l */
        Paint f4168l;

        public C1185h() {
            this.f4159c = null;
            this.f4160d = C1177i.f4101n;
            this.f4158b = new C1184g();
        }

        public C1185h(C1185h hVar) {
            this.f4159c = null;
            this.f4160d = C1177i.f4101n;
            if (hVar != null) {
                this.f4157a = hVar.f4157a;
                C1184g gVar = new C1184g(hVar.f4158b);
                this.f4158b = gVar;
                if (hVar.f4158b.f4145e != null) {
                    gVar.f4145e = new Paint(hVar.f4158b.f4145e);
                }
                if (hVar.f4158b.f4144d != null) {
                    this.f4158b.f4144d = new Paint(hVar.f4158b.f4144d);
                }
                this.f4159c = hVar.f4159c;
                this.f4160d = hVar.f4160d;
                this.f4161e = hVar.f4161e;
            }
        }

        /* renamed from: a */
        public boolean mo4918a(int i, int i2) {
            return i == this.f4162f.getWidth() && i2 == this.f4162f.getHeight();
        }

        /* renamed from: b */
        public boolean mo4919b() {
            return !this.f4167k && this.f4163g == this.f4159c && this.f4164h == this.f4160d && this.f4166j == this.f4161e && this.f4165i == this.f4158b.getRootAlpha();
        }

        /* renamed from: c */
        public void mo4920c(int i, int i2) {
            if (this.f4162f == null || !mo4918a(i, i2)) {
                this.f4162f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f4167k = true;
            }
        }

        /* renamed from: d */
        public void mo4921d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f4162f, (Rect) null, rect, mo4922e(colorFilter));
        }

        /* renamed from: e */
        public Paint mo4922e(ColorFilter colorFilter) {
            if (!mo4923f() && colorFilter == null) {
                return null;
            }
            if (this.f4168l == null) {
                Paint paint = new Paint();
                this.f4168l = paint;
                paint.setFilterBitmap(true);
            }
            this.f4168l.setAlpha(this.f4158b.getRootAlpha());
            this.f4168l.setColorFilter(colorFilter);
            return this.f4168l;
        }

        /* renamed from: f */
        public boolean mo4923f() {
            return this.f4158b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean mo4924g() {
            return this.f4158b.mo4912f();
        }

        public int getChangingConfigurations() {
            return this.f4157a;
        }

        /* renamed from: h */
        public boolean mo4926h(int[] iArr) {
            boolean g = this.f4158b.mo4913g(iArr);
            this.f4167k |= g;
            return g;
        }

        /* renamed from: i */
        public void mo4927i() {
            this.f4163g = this.f4159c;
            this.f4164h = this.f4160d;
            this.f4165i = this.f4158b.getRootAlpha();
            this.f4166j = this.f4161e;
            this.f4167k = false;
        }

        /* renamed from: j */
        public void mo4928j(int i, int i2) {
            this.f4162f.eraseColor(0);
            this.f4158b.mo4911b(new Canvas(this.f4162f), i, i2, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new C1177i(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1177i(this);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$i */
    private static class C1186i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f4169a;

        public C1186i(Drawable.ConstantState constantState) {
            this.f4169a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f4169a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4169a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1177i iVar = new C1177i();
            iVar.f4100d = (VectorDrawable) this.f4169a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1177i iVar = new C1177i();
            iVar.f4100d = (VectorDrawable) this.f4169a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1177i iVar = new C1177i();
            iVar.f4100d = (VectorDrawable) this.f4169a.newDrawable(resources, theme);
            return iVar;
        }
    }

    C1177i() {
        this.f4106i = true;
        this.f4108k = new float[9];
        this.f4109l = new Matrix();
        this.f4110m = new Rect();
        this.f4102e = new C1185h();
    }

    C1177i(C1185h hVar) {
        this.f4106i = true;
        this.f4108k = new float[9];
        this.f4109l = new Matrix();
        this.f4110m = new Rect();
        this.f4102e = hVar;
        this.f4103f = mo4859j(this.f4103f, hVar.f4159c, hVar.f4160d);
    }

    /* renamed from: a */
    static int m5827a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[Catch:{ IOException | XmlPullParserException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ IOException | XmlPullParserException -> 0x0045 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.vectordrawable.graphics.drawable.C1177i m5828b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0023
            androidx.vectordrawable.graphics.drawable.i r0 = new androidx.vectordrawable.graphics.drawable.i
            r0.<init>()
            android.graphics.drawable.Drawable r6 = androidx.core.content.res.C0490h.m2267e(r6, r7, r8)
            r0.f4100d = r6
            androidx.vectordrawable.graphics.drawable.i$i r6 = new androidx.vectordrawable.graphics.drawable.i$i
            android.graphics.drawable.Drawable r7 = r0.f4100d
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f4107j = r6
            return r0
        L_0x0023:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
        L_0x002b:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            r4 = 2
            if (r3 == r4) goto L_0x0036
            r5 = 1
            if (r3 == r5) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            if (r3 != r4) goto L_0x003d
            androidx.vectordrawable.graphics.drawable.i r6 = m5829c(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            return r6
        L_0x003d:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            goto L_0x0048
        L_0x0047:
            r6 = move-exception
        L_0x0048:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1177i.m5828b(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.vectordrawable.graphics.drawable.i");
    }

    /* renamed from: c */
    public static C1177i m5829c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1177i iVar = new C1177i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: androidx.vectordrawable.graphics.drawable.i$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: androidx.vectordrawable.graphics.drawable.i$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: androidx.vectordrawable.graphics.drawable.i$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: androidx.vectordrawable.graphics.drawable.i$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: androidx.vectordrawable.graphics.drawable.i$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5830e(android.content.res.Resources r11, org.xmlpull.v1.XmlPullParser r12, android.util.AttributeSet r13, android.content.res.Resources.Theme r14) {
        /*
            r10 = this;
            androidx.vectordrawable.graphics.drawable.i$h r0 = r10.f4102e
            androidx.vectordrawable.graphics.drawable.i$g r1 = r0.f4158b
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            androidx.vectordrawable.graphics.drawable.i$d r3 = r1.f4148h
            r2.push(r3)
            int r3 = r12.getEventType()
            int r4 = r12.getDepth()
            r5 = 1
            int r4 = r4 + r5
            r6 = 1
        L_0x0019:
            if (r3 == r5) goto L_0x00c4
            int r7 = r12.getDepth()
            r8 = 3
            if (r7 >= r4) goto L_0x0024
            if (r3 == r8) goto L_0x00c4
        L_0x0024:
            r7 = 2
            java.lang.String r9 = "group"
            if (r3 != r7) goto L_0x00af
            java.lang.String r3 = r12.getName()
            java.lang.Object r7 = r2.peek()
            androidx.vectordrawable.graphics.drawable.i$d r7 = (androidx.vectordrawable.graphics.drawable.C1177i.C1181d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0059
            androidx.vectordrawable.graphics.drawable.i$c r3 = new androidx.vectordrawable.graphics.drawable.i$c
            r3.<init>()
            r3.mo4873g(r11, r13, r14, r12)
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.i$e> r6 = r7.f4124b
            r6.add(r3)
            java.lang.String r6 = r3.getPathName()
            if (r6 == 0) goto L_0x0057
            k.a<java.lang.String, java.lang.Object> r6 = r1.f4156p
            java.lang.String r7 = r3.getPathName()
            r6.put(r7, r3)
        L_0x0057:
            r6 = 0
            goto L_0x007d
        L_0x0059:
            java.lang.String r8 = "clip-path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0085
            androidx.vectordrawable.graphics.drawable.i$b r3 = new androidx.vectordrawable.graphics.drawable.i$b
            r3.<init>()
            r3.mo4870e(r11, r13, r14, r12)
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.i$e> r7 = r7.f4124b
            r7.add(r3)
            java.lang.String r7 = r3.getPathName()
            if (r7 == 0) goto L_0x007d
            k.a<java.lang.String, java.lang.Object> r7 = r1.f4156p
            java.lang.String r8 = r3.getPathName()
            r7.put(r8, r3)
        L_0x007d:
            int r7 = r0.f4157a
            int r3 = r3.f4139d
        L_0x0081:
            r3 = r3 | r7
            r0.f4157a = r3
            goto L_0x00be
        L_0x0085:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            androidx.vectordrawable.graphics.drawable.i$d r3 = new androidx.vectordrawable.graphics.drawable.i$d
            r3.<init>()
            r3.mo4890c(r11, r13, r14, r12)
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.i$e> r7 = r7.f4124b
            r7.add(r3)
            r2.push(r3)
            java.lang.String r7 = r3.getGroupName()
            if (r7 == 0) goto L_0x00aa
            k.a<java.lang.String, java.lang.Object> r7 = r1.f4156p
            java.lang.String r8 = r3.getGroupName()
            r7.put(r8, r3)
        L_0x00aa:
            int r7 = r0.f4157a
            int r3 = r3.f4133k
            goto L_0x0081
        L_0x00af:
            if (r3 != r8) goto L_0x00be
            java.lang.String r3 = r12.getName()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            r2.pop()
        L_0x00be:
            int r3 = r12.next()
            goto L_0x0019
        L_0x00c4:
            if (r6 != 0) goto L_0x00c7
            return
        L_0x00c7:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r12 = "no path defined"
            r11.<init>(r12)
            goto L_0x00d0
        L_0x00cf:
            throw r11
        L_0x00d0:
            goto L_0x00cf
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1177i.m5830e(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    /* renamed from: f */
    private boolean m5831f() {
        return isAutoMirrored() && C0515a.m2365f(this) == 1;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m5832g(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: i */
    private void m5833i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C1185h hVar = this.f4102e;
        C1184g gVar = hVar.f4158b;
        hVar.f4160d = m5832g(C0502k.m2304k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g = C0502k.m2300g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g != null) {
            hVar.f4159c = g;
        }
        hVar.f4161e = C0502k.m2298e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f4161e);
        gVar.f4151k = C0502k.m2303j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f4151k);
        float j = C0502k.m2303j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f4152l);
        gVar.f4152l = j;
        if (gVar.f4151k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (j > 0.0f) {
            gVar.f4149i = typedArray.getDimension(3, gVar.f4149i);
            float dimension = typedArray.getDimension(2, gVar.f4150j);
            gVar.f4150j = dimension;
            if (gVar.f4149i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(C0502k.m2303j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f4154n = string;
                    gVar.f4156p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f4100d;
        if (drawable == null) {
            return false;
        }
        C0515a.m2361b(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object mo4844d(String str) {
        return this.f4102e.f4158b.f4156p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f4110m);
        if (this.f4110m.width() > 0 && this.f4110m.height() > 0) {
            ColorFilter colorFilter = this.f4104g;
            if (colorFilter == null) {
                colorFilter = this.f4103f;
            }
            canvas.getMatrix(this.f4109l);
            this.f4109l.getValues(this.f4108k);
            float abs = Math.abs(this.f4108k[0]);
            float abs2 = Math.abs(this.f4108k[4]);
            float abs3 = Math.abs(this.f4108k[1]);
            float abs4 = Math.abs(this.f4108k[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f4110m.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f4110m.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f4110m;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m5831f()) {
                    canvas.translate((float) this.f4110m.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f4110m.offsetTo(0, 0);
                this.f4102e.mo4920c(min, min2);
                if (!this.f4106i) {
                    this.f4102e.mo4928j(min, min2);
                } else if (!this.f4102e.mo4919b()) {
                    this.f4102e.mo4928j(min, min2);
                    this.f4102e.mo4927i();
                }
                this.f4102e.mo4921d(canvas, colorFilter, this.f4110m);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f4100d;
        return drawable != null ? C0515a.m2363d(drawable) : this.f4102e.f4158b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f4100d;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4102e.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4100d;
        return drawable != null ? C0515a.m2364e(drawable) : this.f4104g;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f4100d != null && Build.VERSION.SDK_INT >= 24) {
            return new C1186i(this.f4100d.getConstantState());
        }
        this.f4102e.f4157a = getChangingConfigurations();
        return this.f4102e;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f4100d;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f4102e.f4158b.f4150j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f4100d;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f4102e.f4158b.f4149i;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4853h(boolean z) {
        this.f4106i = z;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            C0515a.m2366g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1185h hVar = this.f4102e;
        hVar.f4158b = new C1184g();
        TypedArray s = C0502k.m2312s(resources, theme, attributeSet, C1163a.f4067a);
        m5833i(s, xmlPullParser, theme);
        s.recycle();
        hVar.f4157a = getChangingConfigurations();
        hVar.f4167k = true;
        m5830e(resources, xmlPullParser, attributeSet, theme);
        this.f4103f = mo4859j(this.f4103f, hVar.f4159c, hVar.f4160d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f4100d;
        return drawable != null ? C0515a.m2367h(drawable) : this.f4102e.f4161e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f4102e.f4159c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f4102e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f4100d
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.i$h r0 = r1.f4102e
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo4924g()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.i$h r0 = r1.f4102e
            android.content.res.ColorStateList r0 = r0.f4159c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1177i.isStateful():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public PorterDuffColorFilter mo4859j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4105h && super.mutate() == this) {
            this.f4102e = new C1185h(this.f4102e);
            this.f4105h = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C1185h hVar = this.f4102e;
        ColorStateList colorStateList = hVar.f4159c;
        if (!(colorStateList == null || (mode = hVar.f4160d) == null)) {
            this.f4103f = mo4859j(this.f4103f, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.mo4924g() || !hVar.mo4926h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f4102e.f4158b.getRootAlpha() != i) {
            this.f4102e.f4158b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            C0515a.m2369j(drawable, z);
        } else {
            this.f4102e.f4161e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f4104g = colorFilter;
        invalidateSelf();
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            C0515a.m2373n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            C0515a.m2374o(drawable, colorStateList);
            return;
        }
        C1185h hVar = this.f4102e;
        if (hVar.f4159c != colorStateList) {
            hVar.f4159c = colorStateList;
            this.f4103f = mo4859j(this.f4103f, colorStateList, hVar.f4160d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            C0515a.m2375p(drawable, mode);
            return;
        }
        C1185h hVar = this.f4102e;
        if (hVar.f4160d != mode) {
            hVar.f4160d = mode;
            this.f4103f = mo4859j(this.f4103f, hVar.f4159c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f4100d;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
