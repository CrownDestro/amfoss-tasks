package p036e5;

import java.lang.annotation.Annotation;

/* renamed from: e5.x */
final class C1889x implements C1888w {

    /* renamed from: a */
    private static final C1888w f6846a = new C1889x();

    C1889x() {
    }

    /* renamed from: a */
    static Annotation[] m9056a(Annotation[] annotationArr) {
        if (C1890y.m9068l(annotationArr, C1888w.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = f6846a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class<? extends Annotation> annotationType() {
        return C1888w.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof C1888w;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "@" + C1888w.class.getName() + "()";
    }
}
