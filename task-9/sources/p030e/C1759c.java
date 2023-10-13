package p030e;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0515a;

/* renamed from: e.c */
public class C1759c extends Drawable implements Drawable.Callback {

    /* renamed from: d */
    private Drawable f6598d;

    public C1759c(Drawable drawable) {
        mo7418a(drawable);
    }

    /* renamed from: a */
    public void mo7418a(Drawable drawable) {
        Drawable drawable2 = this.f6598d;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f6598d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f6598d.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f6598d.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f6598d.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f6598d.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f6598d.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f6598d.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f6598d.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f6598d.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f6598d.getPadding(rect);
    }

    public int[] getState() {
        return this.f6598d.getState();
    }

    public Region getTransparentRegion() {
        return this.f6598d.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0515a.m2367h(this.f6598d);
    }

    public boolean isStateful() {
        return this.f6598d.isStateful();
    }

    public void jumpToCurrentState() {
        this.f6598d.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f6598d.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f6598d.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f6598d.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0515a.m2369j(this.f6598d, z);
    }

    public void setChangingConfigurations(int i) {
        this.f6598d.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f6598d.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f6598d.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f6598d.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0515a.m2370k(this.f6598d, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0515a.m2371l(this.f6598d, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f6598d.setState(iArr);
    }

    public void setTint(int i) {
        C0515a.m2373n(this.f6598d, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0515a.m2374o(this.f6598d, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0515a.m2375p(this.f6598d, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f6598d.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
