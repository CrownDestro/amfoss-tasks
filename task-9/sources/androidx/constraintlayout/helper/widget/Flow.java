package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0427j;
import androidx.constraintlayout.widget.C0428k;
import p094o.C2830e;
import p094o.C2834g;
import p094o.C2841l;

public class Flow extends C0428k {

    /* renamed from: n */
    private C2834g f1584n;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo2166g(AttributeSet attributeSet) {
        super.mo2166g(attributeSet);
        this.f1584n = new C2834g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0427j.f2011a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0427j.f2018b1) {
                    this.f1584n.mo9772S1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0427j.f2025c1) {
                    this.f1584n.mo9810Y0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0427j.f2095m1) {
                    this.f1584n.mo9815d1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0427j.f2102n1) {
                    this.f1584n.mo9812a1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0427j.f2032d1) {
                    this.f1584n.mo9813b1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0427j.f2039e1) {
                    this.f1584n.mo9816e1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0427j.f2046f1) {
                    this.f1584n.mo9814c1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0427j.f2053g1) {
                    this.f1584n.mo9811Z0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0427j.f1921L1) {
                    this.f1584n.mo9777X1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0427j.f1854B1) {
                    this.f1584n.mo9765M1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0427j.f1915K1) {
                    this.f1584n.mo9776W1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0427j.f2158v1) {
                    this.f1584n.mo9759G1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0427j.f1868D1) {
                    this.f1584n.mo9767O1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0427j.f2172x1) {
                    this.f1584n.mo9761I1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0427j.f1882F1) {
                    this.f1584n.mo9769Q1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0427j.f2186z1) {
                    this.f1584n.mo9763K1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0427j.f2151u1) {
                    this.f1584n.mo9758F1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0427j.f1861C1) {
                    this.f1584n.mo9766N1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0427j.f2165w1) {
                    this.f1584n.mo9760H1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0427j.f1875E1) {
                    this.f1584n.mo9768P1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0427j.f1903I1) {
                    this.f1584n.mo9774U1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0427j.f2179y1) {
                    this.f1584n.mo9762J1(obtainStyledAttributes.getInt(index, 2));
                } else if (index == C0427j.f1896H1) {
                    this.f1584n.mo9773T1(obtainStyledAttributes.getInt(index, 2));
                } else if (index == C0427j.f1847A1) {
                    this.f1584n.mo9764L1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0427j.f1909J1) {
                    this.f1584n.mo9775V1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0427j.f1889G1) {
                    this.f1584n.mo9770R1(obtainStyledAttributes.getInt(index, -1));
                }
            }
        }
        this.f1707g = this.f1584n;
        mo2249m();
    }

    /* renamed from: h */
    public void mo2167h(C2830e eVar, boolean z) {
        this.f1584n.mo9797K0(z);
    }

    /* renamed from: n */
    public void mo2168n(C2841l lVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (lVar != null) {
            lVar.mo9771S0(mode, size, mode2, size2);
            setMeasuredDimension(lVar.mo9800N0(), lVar.mo9799M0());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        mo2168n(this.f1584n, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f1584n.mo9758F1(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f1584n.mo9759G1(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f1584n.mo9760H1(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f1584n.mo9761I1(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f1584n.mo9762J1(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f1584n.mo9763K1(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f1584n.mo9764L1(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f1584n.mo9765M1(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f1584n.mo9770R1(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f1584n.mo9772S1(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.f1584n.mo9810Y0(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f1584n.mo9811Z0(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f1584n.mo9813b1(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f1584n.mo9814c1(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f1584n.mo9816e1(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f1584n.mo9773T1(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f1584n.mo9774U1(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f1584n.mo9775V1(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f1584n.mo9776W1(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f1584n.mo9777X1(i);
        requestLayout();
    }
}
