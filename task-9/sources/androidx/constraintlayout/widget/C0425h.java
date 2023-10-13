package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p094o.C2830e;

/* renamed from: androidx.constraintlayout.widget.h */
public class C0425h extends View {

    /* renamed from: d */
    private int f1842d;

    /* renamed from: e */
    private View f1843e;

    /* renamed from: f */
    private int f1844f;

    /* renamed from: a */
    public void mo2288a(ConstraintLayout constraintLayout) {
        if (this.f1843e != null) {
            ConstraintLayout.C0405b bVar = (ConstraintLayout.C0405b) getLayoutParams();
            ConstraintLayout.C0405b bVar2 = (ConstraintLayout.C0405b) this.f1843e.getLayoutParams();
            bVar2.f1665n0.mo9664D0(0);
            C2830e.C2832b y = bVar.f1665n0.mo9733y();
            C2830e.C2832b bVar3 = C2830e.C2832b.FIXED;
            if (y != bVar3) {
                bVar.f1665n0.mo9666E0(bVar2.f1665n0.mo9682P());
            }
            if (bVar.f1665n0.mo9679M() != bVar3) {
                bVar.f1665n0.mo9700h0(bVar2.f1665n0.mo9727v());
            }
            bVar2.f1665n0.mo9664D0(8);
        }
    }

    /* renamed from: b */
    public void mo2289b(ConstraintLayout constraintLayout) {
        if (this.f1842d == -1 && !isInEditMode()) {
            setVisibility(this.f1844f);
        }
        View findViewById = constraintLayout.findViewById(this.f1842d);
        this.f1843e = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.C0405b) findViewById.getLayoutParams()).f1641b0 = true;
            this.f1843e.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1843e;
    }

    public int getEmptyVisibility() {
        return this.f1844f;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f1842d != i) {
            View view = this.f1843e;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.C0405b) this.f1843e.getLayoutParams()).f1641b0 = false;
                this.f1843e = null;
            }
            this.f1842d = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f1844f = i;
    }
}
