package p046g1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0383v;
import androidx.core.widget.C0770c;
import p119s0.C3096b;
import p119s0.C3104j;
import p161z0.C3622a;

/* renamed from: g1.a */
public class C1961a extends C0383v {

    /* renamed from: j */
    private static final int f6942j = C3104j.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: k */
    private static final int[][] f6943k = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: h */
    private ColorStateList f6944h;

    /* renamed from: i */
    private boolean f6945i;

    public C1961a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3096b.f10020I);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1961a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f6942j
            android.content.Context r8 = p096o1.C2844a.m12911c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p119s0.C3105k.f10304j3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C1541p.m7715i(r0, r1, r2, r3, r4, r5)
            int r10 = p119s0.C3105k.f10312k3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = p053h1.C2008c.m9266a(r8, r9, r10)
            androidx.core.widget.C0770c.m3496d(r7, r8)
        L_0x0028:
            int r8 = p119s0.C3105k.f10320l3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f6945i = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p046g1.C1961a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f6944h == null) {
            int d = C3622a.m16070d(this, C3096b.f10024e);
            int d2 = C3622a.m16070d(this, C3096b.colorOnSurface);
            int d3 = C3622a.m16070d(this, C3096b.colorSurface);
            int[][] iArr = f6943k;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C3622a.m16076j(d3, d, 1.0f);
            iArr2[1] = C3622a.m16076j(d3, d2, 0.54f);
            iArr2[2] = C3622a.m16076j(d3, d2, 0.38f);
            iArr2[3] = C3622a.m16076j(d3, d2, 0.38f);
            this.f6944h = new ColorStateList(iArr, iArr2);
        }
        return this.f6944h;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6945i && C0770c.m3494b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f6945i = z;
        C0770c.m3496d(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
