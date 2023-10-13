package org.osmdroid.views;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import p117r4.C3090a;

/* renamed from: org.osmdroid.views.b */
public class C2865b {

    /* renamed from: a */
    private final C2875d f9413a;

    /* renamed from: b */
    private final Point f9414b = new Point();

    /* renamed from: c */
    private Bitmap f9415c;

    /* renamed from: d */
    private Bitmap f9416d;

    /* renamed from: e */
    private Bitmap f9417e;

    /* renamed from: f */
    private Bitmap f9418f;

    /* renamed from: g */
    private Paint f9419g;

    /* renamed from: h */
    private int f9420h;

    /* renamed from: i */
    private C2867b f9421i;

    /* renamed from: j */
    private C2868c f9422j;

    /* renamed from: k */
    private boolean f9423k;

    /* renamed from: l */
    private float f9424l;

    /* renamed from: m */
    private float f9425m;

    /* renamed from: n */
    private float f9426n;

    /* renamed from: o */
    private float f9427o;

    /* renamed from: p */
    private float f9428p;

    /* renamed from: q */
    private float f9429q;

    /* renamed from: r */
    private float f9430r;

    /* renamed from: s */
    private float f9431s;

    /* renamed from: t */
    private float f9432t;

    /* renamed from: u */
    private float f9433u;

    /* renamed from: org.osmdroid.views.b$a */
    static /* synthetic */ class C2866a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9434a;

        /* renamed from: b */
        static final /* synthetic */ int[] f9435b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                org.osmdroid.views.b$c[] r0 = org.osmdroid.views.C2865b.C2868c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9435b = r0
                r1 = 1
                org.osmdroid.views.b$c r2 = org.osmdroid.views.C2865b.C2868c.TOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f9435b     // Catch:{ NoSuchFieldError -> 0x001d }
                org.osmdroid.views.b$c r3 = org.osmdroid.views.C2865b.C2868c.BOTTOM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f9435b     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.osmdroid.views.b$c r4 = org.osmdroid.views.C2865b.C2868c.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                org.osmdroid.views.b$b[] r3 = org.osmdroid.views.C2865b.C2867b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f9434a = r3
                org.osmdroid.views.b$b r4 = org.osmdroid.views.C2865b.C2867b.LEFT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f9434a     // Catch:{ NoSuchFieldError -> 0x0043 }
                org.osmdroid.views.b$b r3 = org.osmdroid.views.C2865b.C2867b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f9434a     // Catch:{ NoSuchFieldError -> 0x004d }
                org.osmdroid.views.b$b r1 = org.osmdroid.views.C2865b.C2867b.CENTER     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.views.C2865b.C2866a.<clinit>():void");
        }
    }

    /* renamed from: org.osmdroid.views.b$b */
    public enum C2867b {
        LEFT,
        CENTER,
        RIGHT
    }

    /* renamed from: org.osmdroid.views.b$c */
    public enum C2868c {
        TOP,
        CENTER,
        BOTTOM
    }

    public C2865b(C2875d dVar) {
        this.f9413a = dVar;
        mo9851n(true, C2867b.CENTER, C2868c.BOTTOM);
        mo9850m(0.5f, 0.5f);
    }

    /* renamed from: b */
    private Bitmap m12971b(boolean z, boolean z2) {
        if (this.f9415c == null) {
            mo9849l(mo9847g(true, true), mo9847g(true, false), mo9847g(false, true), mo9847g(false, false));
        }
        return z ? z2 ? this.f9415c : this.f9417e : z2 ? this.f9416d : this.f9418f;
    }

    /* renamed from: c */
    private float m12972c(int i) {
        float f;
        int i2 = C2866a.f9434a[this.f9421i.ordinal()];
        if (i2 == 1) {
            return this.f9430r;
        }
        if (i2 == 2) {
            float f2 = ((float) i) - this.f9432t;
            int i3 = this.f9420h;
            return (f2 - ((float) i3)) - (this.f9423k ? (this.f9425m * ((float) i3)) + ((float) i3) : 0.0f);
        } else if (i2 == 3) {
            float f3 = ((float) i) / 2.0f;
            if (this.f9423k) {
                float f4 = this.f9425m;
                int i4 = this.f9420h;
                f = ((f4 * ((float) i4)) / 2.0f) + ((float) i4);
            } else {
                f = ((float) this.f9420h) / 2.0f;
            }
            return f3 - f;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    private float m12973d(int i) {
        float f;
        float f2;
        int i2 = C2866a.f9435b[this.f9422j.ordinal()];
        if (i2 == 1) {
            return this.f9431s;
        }
        if (i2 == 2) {
            float f3 = ((float) i) - this.f9433u;
            int i3 = this.f9420h;
            float f4 = f3 - ((float) i3);
            if (this.f9423k) {
                f = 0.0f;
            } else {
                f = ((float) i3) + (this.f9425m * ((float) i3));
            }
            return f4 - f;
        } else if (i2 == 3) {
            float f5 = ((float) i) / 2.0f;
            if (this.f9423k) {
                f2 = ((float) this.f9420h) / 2.0f;
            } else {
                float f6 = this.f9425m;
                int i4 = this.f9420h;
                f2 = ((f6 * ((float) i4)) / 2.0f) + ((float) i4);
            }
            return f5 - f2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: f */
    private float m12974f(boolean z, boolean z2) {
        float d;
        if (z2) {
            d = m12972c(this.f9413a.getWidth());
            if (!this.f9423k || !z) {
                return d;
            }
        } else {
            d = m12973d(this.f9413a.getHeight());
            if (this.f9423k || z) {
                return d;
            }
        }
        int i = this.f9420h;
        return d + ((float) i) + (this.f9425m * ((float) i));
    }

    /* renamed from: h */
    private boolean m12975h(int i, int i2, boolean z) {
        return m12976j(z, true, (float) i) && m12976j(z, false, (float) i2);
    }

    /* renamed from: j */
    private boolean m12976j(boolean z, boolean z2, float f) {
        float f2 = m12974f(z, z2);
        return f >= f2 && f <= f2 + ((float) this.f9420h);
    }

    /* renamed from: k */
    private void m12977k() {
        float f = this.f9424l * ((float) this.f9420h);
        this.f9430r = this.f9426n + f;
        this.f9431s = this.f9427o + f;
        this.f9432t = this.f9428p + f;
        this.f9433u = f + this.f9429q;
    }

    /* renamed from: a */
    public void mo9845a(Canvas canvas, float f, boolean z, boolean z2) {
        Paint paint;
        if (f != 0.0f) {
            if (f == 1.0f) {
                paint = null;
            } else {
                if (this.f9419g == null) {
                    this.f9419g = new Paint();
                }
                this.f9419g.setAlpha((int) (f * 255.0f));
                paint = this.f9419g;
            }
            canvas.drawBitmap(m12971b(true, z), m12974f(true, true), m12974f(true, false), paint);
            canvas.drawBitmap(m12971b(false, z2), m12974f(false, true), m12974f(false, false), paint);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Bitmap mo9846e(boolean z) {
        return ((BitmapDrawable) this.f9413a.getResources().getDrawable(z ? C3090a.f10018d : C3090a.f10019e)).getBitmap();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Bitmap mo9847g(boolean z, boolean z2) {
        Bitmap e = mo9846e(z);
        this.f9420h = e.getWidth();
        m12977k();
        int i = this.f9420h;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(z2 ? -1 : -3355444);
        paint.setStyle(Paint.Style.FILL);
        int i2 = this.f9420h;
        canvas.drawRect(0.0f, 0.0f, (float) (i2 - 1), (float) (i2 - 1), paint);
        canvas.drawBitmap(e, 0.0f, 0.0f, (Paint) null);
        return createBitmap;
    }

    /* renamed from: i */
    public boolean mo9848i(MotionEvent motionEvent, boolean z) {
        if (motionEvent.getAction() == 1) {
            return m12975h((int) motionEvent.getX(), (int) motionEvent.getY(), z);
        }
        return false;
    }

    /* renamed from: l */
    public void mo9849l(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4) {
        this.f9415c = bitmap;
        this.f9417e = bitmap2;
        this.f9416d = bitmap3;
        this.f9418f = bitmap4;
        this.f9420h = bitmap.getWidth();
        m12977k();
    }

    /* renamed from: m */
    public void mo9850m(float f, float f2) {
        this.f9424l = f;
        this.f9425m = f2;
        m12977k();
    }

    /* renamed from: n */
    public void mo9851n(boolean z, C2867b bVar, C2868c cVar) {
        this.f9423k = z;
        this.f9421i = bVar;
        this.f9422j = cVar;
    }
}
