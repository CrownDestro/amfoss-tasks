package p029d5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.LinkedList;
import org.osmdroid.views.C2875d;
import org.osmdroid.views.C2883f;
import p081l4.C2492b;
import p081l4.C2493c;
import p105p4.C2954a;
import p117r4.C3090a;
import p147w4.C3468d0;
import p147w4.C3472f;
import p159y4.C3593g;

/* renamed from: d5.d */
public class C1744d extends C3593g implements C1742b, C3593g.C3594a {

    /* renamed from: C */
    public static final int f6508C = C3593g.m15895h();

    /* renamed from: A */
    private boolean f6509A;

    /* renamed from: B */
    private boolean f6510B;

    /* renamed from: f */
    protected Paint f6511f;

    /* renamed from: g */
    protected Paint f6512g;

    /* renamed from: h */
    protected Bitmap f6513h;

    /* renamed from: i */
    protected Bitmap f6514i;

    /* renamed from: j */
    protected C2875d f6515j;

    /* renamed from: k */
    private C2492b f6516k;

    /* renamed from: l */
    public C1743c f6517l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final LinkedList<Runnable> f6518m;

    /* renamed from: n */
    private final Point f6519n;

    /* renamed from: o */
    private final Point f6520o;

    /* renamed from: p */
    private Handler f6521p;

    /* renamed from: q */
    private Object f6522q;

    /* renamed from: r */
    protected boolean f6523r;

    /* renamed from: s */
    private Location f6524s;

    /* renamed from: t */
    private final C3472f f6525t;

    /* renamed from: u */
    private boolean f6526u;

    /* renamed from: v */
    protected boolean f6527v;

    /* renamed from: w */
    protected boolean f6528w;

    /* renamed from: x */
    protected final PointF f6529x;

    /* renamed from: y */
    protected float f6530y;

    /* renamed from: z */
    protected float f6531z;

    /* renamed from: d5.d$a */
    class C1745a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Location f6532d;

        C1745a(Location location) {
            this.f6532d = location;
        }

        public void run() {
            C1744d.this.mo7316P(this.f6532d);
            Iterator it = C1744d.this.f6518m.iterator();
            while (it.hasNext()) {
                Thread thread = new Thread((Runnable) it.next());
                thread.setName(getClass().getName() + "#onLocationChanged");
                thread.start();
            }
            C1744d.this.f6518m.clear();
        }
    }

    public C1744d(C1743c cVar, C2875d dVar) {
        this.f6511f = new Paint();
        this.f6512g = new Paint();
        this.f6518m = new LinkedList<>();
        this.f6519n = new Point();
        this.f6520o = new Point();
        this.f6522q = new Object();
        this.f6523r = true;
        this.f6525t = new C3472f(0, 0);
        this.f6526u = false;
        this.f6527v = false;
        this.f6528w = true;
        this.f6509A = true;
        this.f6510B = false;
        this.f6515j = dVar;
        this.f6516k = dVar.getController();
        this.f6512g.setARGB(0, 100, 100, 255);
        this.f6512g.setAntiAlias(true);
        this.f6511f.setFilterBitmap(true);
        mo7319S(((BitmapDrawable) dVar.getContext().getResources().getDrawable(C3090a.f10016b)).getBitmap());
        mo7314N(((BitmapDrawable) dVar.getContext().getResources().getDrawable(C3090a.f10017c)).getBitmap());
        this.f6529x = new PointF();
        mo7318R(0.5f, 0.8125f);
        mo7313M(0.5f, 0.5f);
        this.f6521p = new Handler(Looper.getMainLooper());
        mo7317Q(cVar);
    }

    public C1744d(C2875d dVar) {
        this(new C1741a(dVar.getContext()), dVar);
    }

    /* renamed from: C */
    public void mo7303C() {
        this.f6516k.mo9103d(false);
        this.f6527v = false;
    }

    /* renamed from: D */
    public void mo7304D() {
        this.f6526u = false;
        mo7320T();
        C2875d dVar = this.f6515j;
        if (dVar != null) {
            dVar.postInvalidate();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo7305E(Canvas canvas, C2883f fVar, Location location) {
        float f;
        Bitmap bitmap;
        float f2;
        float f3;
        fVar.mo10003S(this.f6525t, this.f6519n);
        if (this.f6528w) {
            float accuracy = location.getAccuracy() / ((float) C3468d0.m15236c(location.getLatitude(), fVar.mo9995J()));
            this.f6512g.setAlpha(50);
            this.f6512g.setStyle(Paint.Style.FILL);
            Point point = this.f6519n;
            canvas.drawCircle((float) point.x, (float) point.y, accuracy, this.f6512g);
            this.f6512g.setAlpha(150);
            this.f6512g.setStyle(Paint.Style.STROKE);
            Point point2 = this.f6519n;
            canvas.drawCircle((float) point2.x, (float) point2.y, accuracy, this.f6512g);
        }
        boolean hasBearing = location.hasBearing();
        canvas.save();
        if (hasBearing) {
            float bearing = location.getBearing();
            if (bearing >= 360.0f) {
                bearing -= 360.0f;
            }
            Point point3 = this.f6519n;
            canvas.rotate(bearing, (float) point3.x, (float) point3.y);
            bitmap = this.f6514i;
            Point point4 = this.f6519n;
            f3 = ((float) point4.x) - this.f6530y;
            f = (float) point4.y;
            f2 = this.f6531z;
        } else {
            Point point5 = this.f6519n;
            canvas.rotate(-this.f6515j.getMapOrientation(), (float) point5.x, (float) point5.y);
            bitmap = this.f6513h;
            Point point6 = this.f6519n;
            PointF pointF = this.f6529x;
            f3 = ((float) point6.x) - pointF.x;
            f = (float) point6.y;
            f2 = pointF.y;
        }
        canvas.drawBitmap(bitmap, f3, f - f2, this.f6511f);
        canvas.restore();
    }

    /* renamed from: F */
    public void mo7306F() {
        Location c;
        this.f6527v = true;
        if (mo7311K() && (c = this.f6517l.mo7296c()) != null) {
            mo7316P(c);
        }
        C2875d dVar = this.f6515j;
        if (dVar != null) {
            dVar.postInvalidate();
        }
    }

    /* renamed from: G */
    public boolean mo7307G() {
        return mo7308H(this.f6517l);
    }

    /* renamed from: H */
    public boolean mo7308H(C1743c cVar) {
        Location c;
        mo7317Q(cVar);
        boolean b = this.f6517l.mo7295b(this);
        this.f6526u = b;
        if (b && (c = this.f6517l.mo7296c()) != null) {
            mo7316P(c);
        }
        C2875d dVar = this.f6515j;
        if (dVar != null) {
            dVar.postInvalidate();
        }
        return b;
    }

    /* renamed from: I */
    public Location mo7309I() {
        return this.f6524s;
    }

    /* renamed from: J */
    public boolean mo7310J() {
        return this.f6527v;
    }

    /* renamed from: K */
    public boolean mo7311K() {
        return this.f6526u;
    }

    /* renamed from: L */
    public boolean mo7312L(Runnable runnable) {
        if (this.f6517l == null || this.f6524s == null) {
            this.f6518m.addLast(runnable);
            return false;
        }
        Thread thread = new Thread(runnable);
        thread.setName(getClass().getName() + "#runOnFirstFix");
        thread.start();
        return true;
    }

    /* renamed from: M */
    public void mo7313M(float f, float f2) {
        this.f6530y = ((float) this.f6514i.getWidth()) * f;
        this.f6531z = ((float) this.f6514i.getHeight()) * f2;
    }

    /* renamed from: N */
    public void mo7314N(Bitmap bitmap) {
        this.f6514i = bitmap;
    }

    /* renamed from: O */
    public void mo7315O(boolean z) {
        this.f6523r = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public void mo7316P(Location location) {
        this.f6524s = location;
        this.f6525t.mo11422y(location.getLatitude(), this.f6524s.getLongitude());
        if (this.f6527v) {
            this.f6516k.mo9104e(this.f6525t);
            return;
        }
        C2875d dVar = this.f6515j;
        if (dVar != null) {
            dVar.postInvalidate();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo7317Q(C1743c cVar) {
        if (cVar != null) {
            if (mo7311K()) {
                mo7320T();
            }
            this.f6517l = cVar;
            return;
        }
        throw new RuntimeException("You must pass an IMyLocationProvider to setMyLocationProvider()");
    }

    /* renamed from: R */
    public void mo7318R(float f, float f2) {
        this.f6529x.set(((float) this.f6513h.getWidth()) * f, ((float) this.f6513h.getHeight()) * f2);
    }

    /* renamed from: S */
    public void mo7319S(Bitmap bitmap) {
        this.f6513h = bitmap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo7320T() {
        Object obj;
        C1743c cVar = this.f6517l;
        if (cVar != null) {
            cVar.mo7297d();
        }
        Handler handler = this.f6521p;
        if (handler != null && (obj = this.f6522q) != null) {
            handler.removeCallbacksAndMessages(obj);
        }
    }

    /* renamed from: a */
    public void mo7302a(Location location, C1743c cVar) {
        Handler handler;
        if (location != null && (handler = this.f6521p) != null) {
            handler.postAtTime(new C1745a(location), this.f6522q, 0);
        }
    }

    /* renamed from: b */
    public boolean mo7321b(int i, int i2, Point point, C2493c cVar) {
        boolean z = false;
        if (this.f6524s != null) {
            this.f6515j.getProjection().mo10003S(this.f6525t, this.f6520o);
            Point point2 = this.f6520o;
            point.x = point2.x;
            point.y = point2.y;
            double d = (double) (i - point2.x);
            double d2 = (double) (i2 - point2.y);
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d2);
            if ((d * d) + (d2 * d2) < 64.0d) {
                z = true;
            }
            if (C2954a.m13328a().mo10181o()) {
                Log.d("OsmDroid", "snap=" + z);
            }
        }
        return z;
    }

    /* renamed from: f */
    public void mo7322f(Canvas canvas, C2883f fVar) {
        if (this.f6524s != null && mo7311K()) {
            mo7305E(canvas, fVar, this.f6524s);
        }
    }

    /* renamed from: k */
    public void mo95k(C2875d dVar) {
        mo7304D();
        this.f6515j = null;
        this.f6521p = null;
        this.f6512g = null;
        this.f6522q = null;
        this.f6524s = null;
        this.f6516k = null;
        C1743c cVar = this.f6517l;
        if (cVar != null) {
            cVar.mo7294a();
        }
        this.f6517l = null;
        super.mo95k(dVar);
    }

    /* renamed from: s */
    public void mo7323s() {
        this.f6510B = this.f6527v;
        mo7304D();
        super.mo7323s();
    }

    /* renamed from: t */
    public void mo7324t() {
        super.mo7324t();
        if (this.f6510B) {
            mo7306F();
        }
        mo7307G();
    }

    /* renamed from: y */
    public boolean mo96y(MotionEvent motionEvent, C2875d dVar) {
        boolean z = motionEvent.getAction() == 2 && motionEvent.getPointerCount() == 1;
        if (motionEvent.getAction() == 0 && this.f6523r) {
            mo7303C();
        } else if (z && mo7310J()) {
            return true;
        }
        return super.mo96y(motionEvent, dVar);
    }
}
