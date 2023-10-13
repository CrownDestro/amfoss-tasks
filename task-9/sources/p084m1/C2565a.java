package p084m1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p070k.C2348g;
import p142w.C3433a;

/* renamed from: m1.a */
public class C2565a extends C3433a {
    public static final Parcelable.Creator<C2565a> CREATOR = new C2566a();

    /* renamed from: f */
    public final C2348g<String, Bundle> f8663f;

    /* renamed from: m1.a$a */
    class C2566a implements Parcelable.ClassLoaderCreator<C2565a> {
        C2566a() {
        }

        /* renamed from: a */
        public C2565a createFromParcel(Parcel parcel) {
            return new C2565a(parcel, (ClassLoader) null, (C2566a) null);
        }

        /* renamed from: b */
        public C2565a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C2565a(parcel, classLoader, (C2566a) null);
        }

        /* renamed from: c */
        public C2565a[] newArray(int i) {
            return new C2565a[i];
        }
    }

    private C2565a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f8663f = new C2348g<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f8663f.put(strArr[i], bundleArr[i]);
        }
    }

    /* synthetic */ C2565a(Parcel parcel, ClassLoader classLoader, C2566a aVar) {
        this(parcel, classLoader);
    }

    public C2565a(Parcelable parcelable) {
        super(parcelable);
        this.f8663f = new C2348g<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f8663f + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f8663f.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f8663f.mo8789i(i2);
            bundleArr[i2] = this.f8663f.mo8794m(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
