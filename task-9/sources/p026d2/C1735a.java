package p026d2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import p063io.flutter.embedding.android.C2141a;
import p063io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import p121s2.C3118h;

@TargetApi(19)
/* renamed from: d2.a */
public class C1735a extends FrameLayout {

    /* renamed from: d */
    private FlutterMutatorsStack f6488d;

    /* renamed from: e */
    private float f6489e;

    /* renamed from: f */
    private int f6490f;

    /* renamed from: g */
    private int f6491g;

    /* renamed from: h */
    private int f6492h;

    /* renamed from: i */
    private int f6493i;

    /* renamed from: j */
    private final C2141a f6494j;

    /* renamed from: k */
    ViewTreeObserver.OnGlobalFocusChangeListener f6495k;

    /* renamed from: d2.a$a */
    class C1736a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: d */
        final /* synthetic */ View.OnFocusChangeListener f6496d;

        /* renamed from: e */
        final /* synthetic */ View f6497e;

        C1736a(View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f6496d = onFocusChangeListener;
            this.f6497e = view;
        }

        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f6496d;
            View view3 = this.f6497e;
            onFocusChangeListener.onFocusChange(view3, C3118h.m13867c(view3));
        }
    }

    public C1735a(Context context, float f, C2141a aVar) {
        super(context, (AttributeSet) null);
        this.f6489e = f;
        this.f6494j = aVar;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f6488d.getFinalMatrix());
        float f = this.f6489e;
        matrix.preScale(1.0f / f, 1.0f / f);
        matrix.postTranslate((float) (-this.f6490f), (float) (-this.f6491g));
        return matrix;
    }

    /* renamed from: a */
    public void mo7276a(FlutterMutatorsStack flutterMutatorsStack, int i, int i2, int i3, int i4) {
        this.f6488d = flutterMutatorsStack;
        this.f6490f = i;
        this.f6491g = i2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    /* renamed from: b */
    public void mo7277b() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.f6495k) != null) {
            this.f6495k = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void draw(Canvas canvas) {
        canvas.save();
        for (Path path : this.f6488d.getFinalClippingPaths()) {
            Path path2 = new Path(path);
            path2.offset((float) (-this.f6490f), (float) (-this.f6491g));
            canvas.clipPath(path2);
        }
        super.draw(canvas);
        canvas.restore();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        float f;
        if (this.f6494j == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i2 = this.f6490f;
            this.f6492h = i2;
            i = this.f6491g;
            this.f6493i = i;
            f = (float) i2;
        } else if (action != 2) {
            f = (float) this.f6490f;
            i = this.f6491g;
        } else {
            matrix.postTranslate((float) this.f6492h, (float) this.f6493i);
            this.f6492h = this.f6490f;
            this.f6493i = this.f6491g;
            return this.f6494j.mo8074g(motionEvent, matrix);
        }
        matrix.postTranslate(f, (float) i);
        return this.f6494j.mo8074g(motionEvent, matrix);
    }

    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        mo7277b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f6495k == null) {
            C1736a aVar = new C1736a(onFocusChangeListener, this);
            this.f6495k = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }
}
