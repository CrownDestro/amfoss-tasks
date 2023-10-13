package p072k1;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.graphics.drawable.C0520c;
import androidx.core.util.C0606c;
import java.util.BitSet;
import p011b1.C1252a;
import p018c1.C1293a;
import p066j1.C2320a;
import p072k1.C2366k;
import p072k1.C2370l;
import p072k1.C2374m;
import p119s0.C3096b;
import p161z0.C3622a;

/* renamed from: k1.g */
public class C2359g extends Drawable implements C0520c, C2382n {

    /* renamed from: A */
    private static final String f8114A = C2359g.class.getSimpleName();

    /* renamed from: B */
    private static final Paint f8115B;

    /* renamed from: d */
    private C2362c f8116d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2374m.C2381g[] f8117e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2374m.C2381g[] f8118f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final BitSet f8119g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f8120h;

    /* renamed from: i */
    private final Matrix f8121i;

    /* renamed from: j */
    private final Path f8122j;

    /* renamed from: k */
    private final Path f8123k;

    /* renamed from: l */
    private final RectF f8124l;

    /* renamed from: m */
    private final RectF f8125m;

    /* renamed from: n */
    private final Region f8126n;

    /* renamed from: o */
    private final Region f8127o;

    /* renamed from: p */
    private C2366k f8128p;

    /* renamed from: q */
    private final Paint f8129q;

    /* renamed from: r */
    private final Paint f8130r;

    /* renamed from: s */
    private final C2320a f8131s;

    /* renamed from: t */
    private final C2370l.C2372b f8132t;

    /* renamed from: u */
    private final C2370l f8133u;

    /* renamed from: v */
    private PorterDuffColorFilter f8134v;

    /* renamed from: w */
    private PorterDuffColorFilter f8135w;

    /* renamed from: x */
    private int f8136x;

    /* renamed from: y */
    private final RectF f8137y;

    /* renamed from: z */
    private boolean f8138z;

    /* renamed from: k1.g$a */
    class C2360a implements C2370l.C2372b {
        C2360a() {
        }

        /* renamed from: a */
        public void mo8860a(C2374m mVar, Matrix matrix, int i) {
            C2359g.this.f8119g.set(i, mVar.mo8906e());
            C2359g.this.f8117e[i] = mVar.mo8907f(matrix);
        }

        /* renamed from: b */
        public void mo8861b(C2374m mVar, Matrix matrix, int i) {
            C2359g.this.f8119g.set(i + 4, mVar.mo8906e());
            C2359g.this.f8118f[i] = mVar.mo8907f(matrix);
        }
    }

    /* renamed from: k1.g$b */
    class C2361b implements C2366k.C2369c {

        /* renamed from: a */
        final /* synthetic */ float f8140a;

        C2361b(float f) {
            this.f8140a = f;
        }

        /* renamed from: a */
        public C2355c mo8862a(C2355c cVar) {
            return cVar instanceof C2364i ? cVar : new C2354b(this.f8140a, cVar);
        }
    }

    /* renamed from: k1.g$c */
    protected static class C2362c extends Drawable.ConstantState {

        /* renamed from: a */
        C2366k f8142a;

        /* renamed from: b */
        C1293a f8143b;

        /* renamed from: c */
        ColorFilter f8144c;

        /* renamed from: d */
        ColorStateList f8145d = null;

        /* renamed from: e */
        ColorStateList f8146e = null;

        /* renamed from: f */
        ColorStateList f8147f = null;

        /* renamed from: g */
        ColorStateList f8148g = null;

        /* renamed from: h */
        PorterDuff.Mode f8149h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i */
        Rect f8150i = null;

        /* renamed from: j */
        float f8151j = 1.0f;

        /* renamed from: k */
        float f8152k = 1.0f;

        /* renamed from: l */
        float f8153l;

        /* renamed from: m */
        int f8154m = 255;

        /* renamed from: n */
        float f8155n = 0.0f;

        /* renamed from: o */
        float f8156o = 0.0f;

        /* renamed from: p */
        float f8157p = 0.0f;

        /* renamed from: q */
        int f8158q = 0;

        /* renamed from: r */
        int f8159r = 0;

        /* renamed from: s */
        int f8160s = 0;

        /* renamed from: t */
        int f8161t = 0;

        /* renamed from: u */
        boolean f8162u = false;

        /* renamed from: v */
        Paint.Style f8163v = Paint.Style.FILL_AND_STROKE;

        public C2362c(C2362c cVar) {
            this.f8142a = cVar.f8142a;
            this.f8143b = cVar.f8143b;
            this.f8153l = cVar.f8153l;
            this.f8144c = cVar.f8144c;
            this.f8145d = cVar.f8145d;
            this.f8146e = cVar.f8146e;
            this.f8149h = cVar.f8149h;
            this.f8148g = cVar.f8148g;
            this.f8154m = cVar.f8154m;
            this.f8151j = cVar.f8151j;
            this.f8160s = cVar.f8160s;
            this.f8158q = cVar.f8158q;
            this.f8162u = cVar.f8162u;
            this.f8152k = cVar.f8152k;
            this.f8155n = cVar.f8155n;
            this.f8156o = cVar.f8156o;
            this.f8157p = cVar.f8157p;
            this.f8159r = cVar.f8159r;
            this.f8161t = cVar.f8161t;
            this.f8147f = cVar.f8147f;
            this.f8163v = cVar.f8163v;
            if (cVar.f8150i != null) {
                this.f8150i = new Rect(cVar.f8150i);
            }
        }

        public C2362c(C2366k kVar, C1293a aVar) {
            this.f8142a = kVar;
            this.f8143b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            C2359g gVar = new C2359g(this);
            boolean unused = gVar.f8120h = true;
            return gVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        f8115B = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C2359g() {
        this(new C2366k());
    }

    public C2359g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C2366k.m11019e(context, attributeSet, i, i2).mo8889m());
    }

    protected C2359g(C2362c cVar) {
        this.f8117e = new C2374m.C2381g[4];
        this.f8118f = new C2374m.C2381g[4];
        this.f8119g = new BitSet(8);
        this.f8121i = new Matrix();
        this.f8122j = new Path();
        this.f8123k = new Path();
        this.f8124l = new RectF();
        this.f8125m = new RectF();
        this.f8126n = new Region();
        this.f8127o = new Region();
        Paint paint = new Paint(1);
        this.f8129q = paint;
        Paint paint2 = new Paint(1);
        this.f8130r = paint2;
        this.f8131s = new C2320a();
        this.f8133u = Looper.getMainLooper().getThread() == Thread.currentThread() ? C2370l.m11081k() : new C2370l();
        this.f8137y = new RectF();
        this.f8138z = true;
        this.f8116d = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m10959f0();
        m10957e0(getState());
        this.f8132t = new C2360a();
    }

    public C2359g(C2366k kVar) {
        this(new C2362c(kVar, (C1293a) null));
    }

    /* renamed from: C */
    private float m10945C() {
        if (m10948K()) {
            return this.f8130r.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: I */
    private boolean m10946I() {
        C2362c cVar = this.f8116d;
        int i = cVar.f8158q;
        return i != 1 && cVar.f8159r > 0 && (i == 2 || mo8833S());
    }

    /* renamed from: J */
    private boolean m10947J() {
        Paint.Style style = this.f8116d.f8163v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: K */
    private boolean m10948K() {
        Paint.Style style = this.f8116d.f8163v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f8130r.getStrokeWidth() > 0.0f;
    }

    /* renamed from: M */
    private void m10949M() {
        super.invalidateSelf();
    }

    /* renamed from: P */
    private void m10950P(Canvas canvas) {
        if (m10946I()) {
            canvas.save();
            m10952R(canvas);
            if (!this.f8138z) {
                m10966n(canvas);
            } else {
                int width = (int) (this.f8137y.width() - ((float) getBounds().width()));
                int height = (int) (this.f8137y.height() - ((float) getBounds().height()));
                if (width < 0 || height < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.f8137y.width()) + (this.f8116d.f8159r * 2) + width, ((int) this.f8137y.height()) + (this.f8116d.f8159r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f = (float) ((getBounds().left - this.f8116d.f8159r) - width);
                float f2 = (float) ((getBounds().top - this.f8116d.f8159r) - height);
                canvas2.translate(-f, -f2);
                m10966n(canvas2);
                canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                createBitmap.recycle();
            }
            canvas.restore();
        }
    }

    /* renamed from: Q */
    private static int m10951Q(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: R */
    private void m10952R(Canvas canvas) {
        int x = mo8857x();
        int y = mo8858y();
        if (Build.VERSION.SDK_INT < 21 && this.f8138z) {
            Rect clipBounds = canvas.getClipBounds();
            int i = this.f8116d.f8159r;
            clipBounds.inset(-i, -i);
            clipBounds.offset(x, y);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate((float) x, (float) y);
    }

    /* renamed from: e0 */
    private boolean m10957e0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f8116d.f8145d == null || (color2 = this.f8129q.getColor()) == (colorForState2 = this.f8116d.f8145d.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.f8129q.setColor(colorForState2);
            z = true;
        }
        if (this.f8116d.f8146e == null || (color = this.f8130r.getColor()) == (colorForState = this.f8116d.f8146e.getColorForState(iArr, color))) {
            return z;
        }
        this.f8130r.setColor(colorForState);
        return true;
    }

    /* renamed from: f */
    private PorterDuffColorFilter m10958f(Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int l = mo8850l(color);
        this.f8136x = l;
        if (l != color) {
            return new PorterDuffColorFilter(l, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    /* renamed from: f0 */
    private boolean m10959f0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f8134v;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f8135w;
        C2362c cVar = this.f8116d;
        this.f8134v = m10964k(cVar.f8148g, cVar.f8149h, this.f8129q, true);
        C2362c cVar2 = this.f8116d;
        this.f8135w = m10964k(cVar2.f8147f, cVar2.f8149h, this.f8130r, false);
        C2362c cVar3 = this.f8116d;
        if (cVar3.f8162u) {
            this.f8131s.mo8641d(cVar3.f8148g.getColorForState(getState(), 0));
        }
        return !C0606c.m2652a(porterDuffColorFilter, this.f8134v) || !C0606c.m2652a(porterDuffColorFilter2, this.f8135w);
    }

    /* renamed from: g */
    private void m10960g(RectF rectF, Path path) {
        mo8848h(rectF, path);
        if (this.f8116d.f8151j != 1.0f) {
            this.f8121i.reset();
            Matrix matrix = this.f8121i;
            float f = this.f8116d.f8151j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f8121i);
        }
        path.computeBounds(this.f8137y, true);
    }

    /* renamed from: g0 */
    private void m10961g0() {
        float H = mo8829H();
        this.f8116d.f8159r = (int) Math.ceil((double) (0.75f * H));
        this.f8116d.f8160s = (int) Math.ceil((double) (H * 0.25f));
        m10959f0();
        m10949M();
    }

    /* renamed from: i */
    private void m10962i() {
        C2366k y = mo8823A().mo8882y(new C2361b(-m10945C()));
        this.f8128p = y;
        this.f8133u.mo8902d(y, this.f8116d.f8152k, m10969t(), this.f8123k);
    }

    /* renamed from: j */
    private PorterDuffColorFilter m10963j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = mo8850l(colorForState);
        }
        this.f8136x = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: k */
    private PorterDuffColorFilter m10964k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? m10958f(paint, z) : m10963j(colorStateList, mode, z);
    }

    /* renamed from: m */
    public static C2359g m10965m(Context context, float f) {
        int c = C3622a.m16069c(context, C3096b.colorSurface, C2359g.class.getSimpleName());
        C2359g gVar = new C2359g();
        gVar.mo8830L(context);
        gVar.mo8836V(ColorStateList.valueOf(c));
        gVar.mo8835U(f);
        return gVar;
    }

    /* renamed from: n */
    private void m10966n(Canvas canvas) {
        if (this.f8119g.cardinality() > 0) {
            Log.w(f8114A, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f8116d.f8160s != 0) {
            canvas.drawPath(this.f8122j, this.f8131s.mo8640c());
        }
        for (int i = 0; i < 4; i++) {
            this.f8117e[i].mo8918b(this.f8131s, this.f8116d.f8159r, canvas);
            this.f8118f[i].mo8918b(this.f8131s, this.f8116d.f8159r, canvas);
        }
        if (this.f8138z) {
            int x = mo8857x();
            int y = mo8858y();
            canvas.translate((float) (-x), (float) (-y));
            canvas.drawPath(this.f8122j, f8115B);
            canvas.translate((float) x, (float) y);
        }
    }

    /* renamed from: o */
    private void m10967o(Canvas canvas) {
        m10968q(canvas, this.f8129q, this.f8122j, this.f8116d.f8142a, mo8853s());
    }

    /* renamed from: q */
    private void m10968q(Canvas canvas, Paint paint, Path path, C2366k kVar, RectF rectF) {
        if (kVar.mo8878u(rectF)) {
            float a = kVar.mo8877t().mo8815a(rectF) * this.f8116d.f8152k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: t */
    private RectF m10969t() {
        this.f8125m.set(mo8853s());
        float C = m10945C();
        this.f8125m.inset(C, C);
        return this.f8125m;
    }

    /* renamed from: A */
    public C2366k mo8823A() {
        return this.f8116d.f8142a;
    }

    /* renamed from: B */
    public ColorStateList mo8824B() {
        return this.f8116d.f8146e;
    }

    /* renamed from: D */
    public float mo8825D() {
        return this.f8116d.f8153l;
    }

    /* renamed from: E */
    public ColorStateList mo8826E() {
        return this.f8116d.f8148g;
    }

    /* renamed from: F */
    public float mo8827F() {
        return this.f8116d.f8142a.mo8875r().mo8815a(mo8853s());
    }

    /* renamed from: G */
    public float mo8828G() {
        return this.f8116d.f8157p;
    }

    /* renamed from: H */
    public float mo8829H() {
        return mo8854u() + mo8828G();
    }

    /* renamed from: L */
    public void mo8830L(Context context) {
        this.f8116d.f8143b = new C1293a(context);
        m10961g0();
    }

    /* renamed from: N */
    public boolean mo8831N() {
        C1293a aVar = this.f8116d.f8143b;
        return aVar != null && aVar.mo5119e();
    }

    /* renamed from: O */
    public boolean mo8832O() {
        return this.f8116d.f8142a.mo8878u(mo8853s());
    }

    /* renamed from: S */
    public boolean mo8833S() {
        int i = Build.VERSION.SDK_INT;
        return i < 21 || (!mo8832O() && !this.f8122j.isConvex() && i < 29);
    }

    /* renamed from: T */
    public void mo8834T(C2355c cVar) {
        setShapeAppearanceModel(this.f8116d.f8142a.mo8881x(cVar));
    }

    /* renamed from: U */
    public void mo8835U(float f) {
        C2362c cVar = this.f8116d;
        if (cVar.f8156o != f) {
            cVar.f8156o = f;
            m10961g0();
        }
    }

    /* renamed from: V */
    public void mo8836V(ColorStateList colorStateList) {
        C2362c cVar = this.f8116d;
        if (cVar.f8145d != colorStateList) {
            cVar.f8145d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: W */
    public void mo8837W(float f) {
        C2362c cVar = this.f8116d;
        if (cVar.f8152k != f) {
            cVar.f8152k = f;
            this.f8120h = true;
            invalidateSelf();
        }
    }

    /* renamed from: X */
    public void mo8838X(int i, int i2, int i3, int i4) {
        C2362c cVar = this.f8116d;
        if (cVar.f8150i == null) {
            cVar.f8150i = new Rect();
        }
        this.f8116d.f8150i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: Y */
    public void mo8839Y(float f) {
        C2362c cVar = this.f8116d;
        if (cVar.f8155n != f) {
            cVar.f8155n = f;
            m10961g0();
        }
    }

    /* renamed from: Z */
    public void mo8840Z(int i) {
        C2362c cVar = this.f8116d;
        if (cVar.f8161t != i) {
            cVar.f8161t = i;
            m10949M();
        }
    }

    /* renamed from: a0 */
    public void mo8841a0(float f, int i) {
        mo8844d0(f);
        mo8843c0(ColorStateList.valueOf(i));
    }

    /* renamed from: b0 */
    public void mo8842b0(float f, ColorStateList colorStateList) {
        mo8844d0(f);
        mo8843c0(colorStateList);
    }

    /* renamed from: c0 */
    public void mo8843c0(ColorStateList colorStateList) {
        C2362c cVar = this.f8116d;
        if (cVar.f8146e != colorStateList) {
            cVar.f8146e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: d0 */
    public void mo8844d0(float f) {
        this.f8116d.f8153l = f;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f8129q.setColorFilter(this.f8134v);
        int alpha = this.f8129q.getAlpha();
        this.f8129q.setAlpha(m10951Q(alpha, this.f8116d.f8154m));
        this.f8130r.setColorFilter(this.f8135w);
        this.f8130r.setStrokeWidth(this.f8116d.f8153l);
        int alpha2 = this.f8130r.getAlpha();
        this.f8130r.setAlpha(m10951Q(alpha2, this.f8116d.f8154m));
        if (this.f8120h) {
            m10962i();
            m10960g(mo8853s(), this.f8122j);
            this.f8120h = false;
        }
        m10950P(canvas);
        if (m10947J()) {
            m10967o(canvas);
        }
        if (m10948K()) {
            mo6891r(canvas);
        }
        this.f8129q.setAlpha(alpha);
        this.f8130r.setAlpha(alpha2);
    }

    public int getAlpha() {
        return this.f8116d.f8154m;
    }

    public Drawable.ConstantState getConstantState() {
        return this.f8116d;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f8116d.f8158q != 2) {
            if (mo8832O()) {
                outline.setRoundRect(getBounds(), mo8827F() * this.f8116d.f8152k);
                return;
            }
            m10960g(mo8853s(), this.f8122j);
            C1252a.m6083e(outline, this.f8122j);
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f8116d.f8150i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f8126n.set(getBounds());
        m10960g(mo8853s(), this.f8122j);
        this.f8127o.setPath(this.f8122j, this.f8126n);
        this.f8126n.op(this.f8127o, Region.Op.DIFFERENCE);
        return this.f8126n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo8848h(RectF rectF, Path path) {
        C2370l lVar = this.f8133u;
        C2362c cVar = this.f8116d;
        C2366k kVar = cVar.f8142a;
        float f = cVar.f8152k;
        lVar.mo8903e(kVar, f, rectF, this.f8132t, path);
    }

    public void invalidateSelf() {
        this.f8120h = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f8116d.f8146e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f8116d.f8145d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f8116d.f8148g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f8116d.f8147f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            k1.g$c r0 = r1.f8116d
            android.content.res.ColorStateList r0 = r0.f8148g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            k1.g$c r0 = r1.f8116d
            android.content.res.ColorStateList r0 = r0.f8147f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            k1.g$c r0 = r1.f8116d
            android.content.res.ColorStateList r0 = r0.f8146e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            k1.g$c r0 = r1.f8116d
            android.content.res.ColorStateList r0 = r0.f8145d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p072k1.C2359g.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo8850l(int i) {
        float H = mo8829H() + mo8856w();
        C1293a aVar = this.f8116d.f8143b;
        return aVar != null ? aVar.mo5117c(i, H) : i;
    }

    public Drawable mutate() {
        this.f8116d = new C2362c(this.f8116d);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f8120h = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = m10957e0(iArr) || m10959f0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo8852p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m10968q(canvas, paint, path, this.f8116d.f8142a, rectF);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo6891r(Canvas canvas) {
        m10968q(canvas, this.f8130r, this.f8123k, this.f8128p, m10969t());
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public RectF mo8853s() {
        this.f8124l.set(getBounds());
        return this.f8124l;
    }

    public void setAlpha(int i) {
        C2362c cVar = this.f8116d;
        if (cVar.f8154m != i) {
            cVar.f8154m = i;
            m10949M();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f8116d.f8144c = colorFilter;
        m10949M();
    }

    public void setShapeAppearanceModel(C2366k kVar) {
        this.f8116d.f8142a = kVar;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f8116d.f8148g = colorStateList;
        m10959f0();
        m10949M();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C2362c cVar = this.f8116d;
        if (cVar.f8149h != mode) {
            cVar.f8149h = mode;
            m10959f0();
            m10949M();
        }
    }

    /* renamed from: u */
    public float mo8854u() {
        return this.f8116d.f8156o;
    }

    /* renamed from: v */
    public ColorStateList mo8855v() {
        return this.f8116d.f8145d;
    }

    /* renamed from: w */
    public float mo8856w() {
        return this.f8116d.f8155n;
    }

    /* renamed from: x */
    public int mo8857x() {
        C2362c cVar = this.f8116d;
        double d = (double) cVar.f8160s;
        double sin = Math.sin(Math.toRadians((double) cVar.f8161t));
        Double.isNaN(d);
        return (int) (d * sin);
    }

    /* renamed from: y */
    public int mo8858y() {
        C2362c cVar = this.f8116d;
        double d = (double) cVar.f8160s;
        double cos = Math.cos(Math.toRadians((double) cVar.f8161t));
        Double.isNaN(d);
        return (int) (d * cos);
    }

    /* renamed from: z */
    public int mo8859z() {
        return this.f8116d.f8159r;
    }
}
