package p030e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0515a;

/* renamed from: e.d */
public class C1760d extends Drawable {

    /* renamed from: m */
    private static final float f6599m = ((float) Math.toRadians(45.0d));

    /* renamed from: a */
    private final Paint f6600a;

    /* renamed from: b */
    private float f6601b;

    /* renamed from: c */
    private float f6602c;

    /* renamed from: d */
    private float f6603d;

    /* renamed from: e */
    private float f6604e;

    /* renamed from: f */
    private boolean f6605f;

    /* renamed from: g */
    private final Path f6606g;

    /* renamed from: h */
    private final int f6607h;

    /* renamed from: i */
    private boolean f6608i;

    /* renamed from: j */
    private float f6609j;

    /* renamed from: k */
    private float f6610k;

    /* renamed from: l */
    private int f6611l;

    /* renamed from: a */
    private static float m8758a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: b */
    public void mo7446b(float f) {
        if (this.f6609j != f) {
            this.f6609j = f;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i = this.f6611l;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? C0515a.m2365f(this) == 0 : C0515a.m2365f(this) == 1))) {
            z = true;
        }
        float f = this.f6601b;
        float a = m8758a(this.f6602c, (float) Math.sqrt((double) (f * f * 2.0f)), this.f6609j);
        float a2 = m8758a(this.f6602c, this.f6603d, this.f6609j);
        float round = (float) Math.round(m8758a(0.0f, this.f6610k, this.f6609j));
        float a3 = m8758a(0.0f, f6599m, this.f6609j);
        double d = (double) a;
        float a4 = m8758a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f6609j);
        double d2 = (double) a3;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        boolean z2 = z;
        float round2 = (float) Math.round(cos * d);
        double sin = Math.sin(d2);
        Double.isNaN(d);
        float round3 = (float) Math.round(d * sin);
        this.f6606g.rewind();
        float a5 = m8758a(this.f6604e + this.f6600a.getStrokeWidth(), -this.f6610k, this.f6609j);
        float f2 = (-a2) / 2.0f;
        this.f6606g.moveTo(f2 + round, 0.0f);
        this.f6606g.rLineTo(a2 - (round * 2.0f), 0.0f);
        this.f6606g.moveTo(f2, a5);
        this.f6606g.rLineTo(round2, round3);
        this.f6606g.moveTo(f2, -a5);
        this.f6606g.rLineTo(round2, -round3);
        this.f6606g.close();
        canvas.save();
        float strokeWidth = this.f6600a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f3 = this.f6604e;
        canvas2.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f3))) / 4) * 2)) + (strokeWidth * 1.5f) + f3);
        if (this.f6605f) {
            canvas2.rotate(a4 * ((float) (this.f6608i ^ z2 ? -1 : 1)));
        } else if (z2) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f6606g, this.f6600a);
        canvas.restore();
    }

    public int getIntrinsicHeight() {
        return this.f6607h;
    }

    public int getIntrinsicWidth() {
        return this.f6607h;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        if (i != this.f6600a.getAlpha()) {
            this.f6600a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f6600a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
