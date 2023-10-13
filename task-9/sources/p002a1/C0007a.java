package p002a1;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: a1.a */
public class C0007a implements View.OnTouchListener {

    /* renamed from: d */
    private final Dialog f68d;

    /* renamed from: e */
    private final int f69e;

    /* renamed from: f */
    private final int f70f;

    /* renamed from: g */
    private final int f71g;

    public C0007a(Dialog dialog, Rect rect) {
        this.f68d = dialog;
        this.f69e = rect.left;
        this.f70f = rect.top;
        this.f71g = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f69e + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f70f + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f71g;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f68d.onTouchEvent(obtain);
    }
}
