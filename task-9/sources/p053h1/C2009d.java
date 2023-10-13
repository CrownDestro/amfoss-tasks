package p053h1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.C0490h;
import p119s0.C3105k;

/* renamed from: h1.d */
public class C2009d {

    /* renamed from: a */
    public final ColorStateList f7071a;

    /* renamed from: b */
    public final ColorStateList f7072b;

    /* renamed from: c */
    public final ColorStateList f7073c;

    /* renamed from: d */
    public final String f7074d;

    /* renamed from: e */
    public final int f7075e;

    /* renamed from: f */
    public final int f7076f;

    /* renamed from: g */
    public final boolean f7077g;

    /* renamed from: h */
    public final float f7078h;

    /* renamed from: i */
    public final float f7079i;

    /* renamed from: j */
    public final float f7080j;

    /* renamed from: k */
    public final boolean f7081k;

    /* renamed from: l */
    public final float f7082l;

    /* renamed from: m */
    private ColorStateList f7083m;

    /* renamed from: n */
    private float f7084n;

    /* renamed from: o */
    private final int f7085o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f7086p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Typeface f7087q;

    /* renamed from: h1.d$a */
    class C2010a extends C0490h.C0496f {

        /* renamed from: a */
        final /* synthetic */ C2013f f7088a;

        C2010a(C2013f fVar) {
            this.f7088a = fVar;
        }

        /* renamed from: h */
        public void mo1513h(int i) {
            boolean unused = C2009d.this.f7086p = true;
            this.f7088a.mo5873a(i);
        }

        /* renamed from: i */
        public void mo1514i(Typeface typeface) {
            C2009d dVar = C2009d.this;
            Typeface unused = dVar.f7087q = Typeface.create(typeface, dVar.f7075e);
            boolean unused2 = C2009d.this.f7086p = true;
            this.f7088a.mo5874b(C2009d.this.f7087q, false);
        }
    }

    /* renamed from: h1.d$b */
    class C2011b extends C2013f {

        /* renamed from: a */
        final /* synthetic */ Context f7090a;

        /* renamed from: b */
        final /* synthetic */ TextPaint f7091b;

        /* renamed from: c */
        final /* synthetic */ C2013f f7092c;

        C2011b(Context context, TextPaint textPaint, C2013f fVar) {
            this.f7090a = context;
            this.f7091b = textPaint;
            this.f7092c = fVar;
        }

        /* renamed from: a */
        public void mo5873a(int i) {
            this.f7092c.mo5873a(i);
        }

        /* renamed from: b */
        public void mo5874b(Typeface typeface, boolean z) {
            C2009d.this.mo7753p(this.f7090a, this.f7091b, typeface);
            this.f7092c.mo5874b(typeface, z);
        }
    }

    public C2009d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C3105k.f10198V4);
        mo7750l(obtainStyledAttributes.getDimension(C3105k.f10205W4, 0.0f));
        mo7749k(C2008c.m9266a(context, obtainStyledAttributes, C3105k.f10226Z4));
        this.f7071a = C2008c.m9266a(context, obtainStyledAttributes, C3105k.f10234a5);
        this.f7072b = C2008c.m9266a(context, obtainStyledAttributes, C3105k.f10242b5);
        this.f7075e = obtainStyledAttributes.getInt(C3105k.f10219Y4, 0);
        this.f7076f = obtainStyledAttributes.getInt(C3105k.f10212X4, 1);
        int e = C2008c.m9270e(obtainStyledAttributes, C3105k.f10290h5, C3105k.f10282g5);
        this.f7085o = obtainStyledAttributes.getResourceId(e, 0);
        this.f7074d = obtainStyledAttributes.getString(e);
        this.f7077g = obtainStyledAttributes.getBoolean(C3105k.f10298i5, false);
        this.f7073c = C2008c.m9266a(context, obtainStyledAttributes, C3105k.f10250c5);
        this.f7078h = obtainStyledAttributes.getFloat(C3105k.f10258d5, 0.0f);
        this.f7079i = obtainStyledAttributes.getFloat(C3105k.f10266e5, 0.0f);
        this.f7080j = obtainStyledAttributes.getFloat(C3105k.f10274f5, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C3105k.f10360q3);
            int i2 = C3105k.f10368r3;
            this.f7081k = obtainStyledAttributes2.hasValue(i2);
            this.f7082l = obtainStyledAttributes2.getFloat(i2, 0.0f);
            obtainStyledAttributes2.recycle();
            return;
        }
        this.f7081k = false;
        this.f7082l = 0.0f;
    }

    /* renamed from: d */
    private void m9277d() {
        String str;
        if (this.f7087q == null && (str = this.f7074d) != null) {
            this.f7087q = Typeface.create(str, this.f7075e);
        }
        if (this.f7087q == null) {
            int i = this.f7076f;
            this.f7087q = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f7087q = Typeface.create(this.f7087q, this.f7075e);
        }
    }

    /* renamed from: m */
    private boolean m9278m(Context context) {
        if (C2012e.m9294a()) {
            return true;
        }
        int i = this.f7085o;
        return (i != 0 ? C0490h.m2265c(context, i) : null) != null;
    }

    /* renamed from: e */
    public Typeface mo7743e() {
        m9277d();
        return this.f7087q;
    }

    /* renamed from: f */
    public Typeface mo7744f(Context context) {
        if (this.f7086p) {
            return this.f7087q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface g = C0490h.m2269g(context, this.f7085o);
                this.f7087q = g;
                if (g != null) {
                    this.f7087q = Typeface.create(g, this.f7075e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f7074d, e);
            }
        }
        m9277d();
        this.f7086p = true;
        return this.f7087q;
    }

    /* renamed from: g */
    public void mo7745g(Context context, TextPaint textPaint, C2013f fVar) {
        mo7753p(context, textPaint, mo7743e());
        mo7746h(context, new C2011b(context, textPaint, fVar));
    }

    /* renamed from: h */
    public void mo7746h(Context context, C2013f fVar) {
        if (m9278m(context)) {
            mo7744f(context);
        } else {
            m9277d();
        }
        int i = this.f7085o;
        if (i == 0) {
            this.f7086p = true;
        }
        if (this.f7086p) {
            fVar.mo5874b(this.f7087q, true);
            return;
        }
        try {
            C0490h.m2271i(context, i, new C2010a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f7086p = true;
            fVar.mo5873a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f7074d, e);
            this.f7086p = true;
            fVar.mo5873a(-3);
        }
    }

    /* renamed from: i */
    public ColorStateList mo7747i() {
        return this.f7083m;
    }

    /* renamed from: j */
    public float mo7748j() {
        return this.f7084n;
    }

    /* renamed from: k */
    public void mo7749k(ColorStateList colorStateList) {
        this.f7083m = colorStateList;
    }

    /* renamed from: l */
    public void mo7750l(float f) {
        this.f7084n = f;
    }

    /* renamed from: n */
    public void mo7751n(Context context, TextPaint textPaint, C2013f fVar) {
        mo7752o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f7083m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f7080j;
        float f2 = this.f7078h;
        float f3 = this.f7079i;
        ColorStateList colorStateList2 = this.f7073c;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: o */
    public void mo7752o(Context context, TextPaint textPaint, C2013f fVar) {
        if (m9278m(context)) {
            mo7753p(context, textPaint, mo7744f(context));
        } else {
            mo7745g(context, textPaint, fVar);
        }
    }

    /* renamed from: p */
    public void mo7753p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a = C2014g.m9297a(context, typeface);
        if (a != null) {
            typeface = a;
        }
        textPaint.setTypeface(typeface);
        int style = this.f7075e & (typeface.getStyle() ^ -1);
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f7084n);
        if (Build.VERSION.SDK_INT >= 21 && this.f7081k) {
            textPaint.setLetterSpacing(this.f7082l);
        }
    }
}
