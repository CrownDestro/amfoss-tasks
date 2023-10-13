package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.g */
public class C0424g extends View {
    public C0424g(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C0405b bVar = (ConstraintLayout.C0405b) getLayoutParams();
        bVar.f1638a = i;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C0405b bVar = (ConstraintLayout.C0405b) getLayoutParams();
        bVar.f1640b = i;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C0405b bVar = (ConstraintLayout.C0405b) getLayoutParams();
        bVar.f1642c = f;
        setLayoutParams(bVar);
    }

    public void setVisibility(int i) {
    }
}
