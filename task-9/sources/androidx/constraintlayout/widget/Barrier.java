package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p094o.C2824a;
import p094o.C2830e;

public class Barrier extends C0411b {

    /* renamed from: l */
    private int f1585l;

    /* renamed from: m */
    private int f1586m;

    /* renamed from: n */
    private C2824a f1587n;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r6 == 6) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r6 == 6) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1906o(p094o.C2830e r4, int r5, boolean r6) {
        /*
            r3 = this;
            r3.f1586m = r5
            r5 = 1
            r0 = 0
            r1 = 6
            r2 = 5
            if (r6 == 0) goto L_0x0012
            int r6 = r3.f1585l
            if (r6 != r2) goto L_0x000f
        L_0x000c:
            r3.f1586m = r5
            goto L_0x001c
        L_0x000f:
            if (r6 != r1) goto L_0x001c
            goto L_0x0016
        L_0x0012:
            int r6 = r3.f1585l
            if (r6 != r2) goto L_0x0019
        L_0x0016:
            r3.f1586m = r0
            goto L_0x001c
        L_0x0019:
            if (r6 != r1) goto L_0x001c
            goto L_0x000c
        L_0x001c:
            boolean r5 = r4 instanceof p094o.C2824a
            if (r5 == 0) goto L_0x0027
            o.a r4 = (p094o.C2824a) r4
            int r5 = r3.f1586m
            r4.mo9636P0(r5)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.m1906o(o.e, int, boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo2166g(AttributeSet attributeSet) {
        super.mo2166g(attributeSet);
        this.f1587n = new C2824a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0427j.f2011a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0427j.f2123q1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0427j.f2116p1) {
                    this.f1587n.mo9635O0(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0427j.f2130r1) {
                    this.f1587n.mo9637Q0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f1707g = this.f1587n;
        mo2249m();
    }

    public int getMargin() {
        return this.f1587n.mo9633M0();
    }

    public int getType() {
        return this.f1585l;
    }

    /* renamed from: h */
    public void mo2167h(C2830e eVar, boolean z) {
        m1906o(eVar, this.f1585l, z);
    }

    /* renamed from: n */
    public boolean mo2192n() {
        return this.f1587n.mo9631K0();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1587n.mo9635O0(z);
    }

    public void setDpMargin(int i) {
        C2824a aVar = this.f1587n;
        aVar.mo9637Q0((int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f1587n.mo9637Q0(i);
    }

    public void setType(int i) {
        this.f1585l = i;
    }
}
