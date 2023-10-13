package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p070k.C2335a;

/* renamed from: androidx.versionedparcelable.b */
class C1189b extends C1188a {

    /* renamed from: d */
    private final SparseIntArray f4174d;

    /* renamed from: e */
    private final Parcel f4175e;

    /* renamed from: f */
    private final int f4176f;

    /* renamed from: g */
    private final int f4177g;

    /* renamed from: h */
    private final String f4178h;

    /* renamed from: i */
    private int f4179i;

    /* renamed from: j */
    private int f4180j;

    /* renamed from: k */
    private int f4181k;

    C1189b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2335a(), new C2335a(), new C2335a());
    }

    private C1189b(Parcel parcel, int i, int i2, String str, C2335a<String, Method> aVar, C2335a<String, Method> aVar2, C2335a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f4174d = new SparseIntArray();
        this.f4179i = -1;
        this.f4181k = -1;
        this.f4175e = parcel;
        this.f4176f = i;
        this.f4177g = i2;
        this.f4180j = i;
        this.f4178h = str;
    }

    /* renamed from: A */
    public void mo4942A(byte[] bArr) {
        if (bArr != null) {
            this.f4175e.writeInt(bArr.length);
            this.f4175e.writeByteArray(bArr);
            return;
        }
        this.f4175e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo4944C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4175e, 0);
    }

    /* renamed from: E */
    public void mo4946E(int i) {
        this.f4175e.writeInt(i);
    }

    /* renamed from: G */
    public void mo4948G(Parcelable parcelable) {
        this.f4175e.writeParcelable(parcelable, 0);
    }

    /* renamed from: I */
    public void mo4950I(String str) {
        this.f4175e.writeString(str);
    }

    /* renamed from: a */
    public void mo4955a() {
        int i = this.f4179i;
        if (i >= 0) {
            int i2 = this.f4174d.get(i);
            int dataPosition = this.f4175e.dataPosition();
            this.f4175e.setDataPosition(i2);
            this.f4175e.writeInt(dataPosition - i2);
            this.f4175e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1188a mo4956b() {
        Parcel parcel = this.f4175e;
        int dataPosition = parcel.dataPosition();
        int i = this.f4180j;
        if (i == this.f4176f) {
            i = this.f4177g;
        }
        int i2 = i;
        return new C1189b(parcel, dataPosition, i2, this.f4178h + "  ", this.f4171a, this.f4172b, this.f4173c);
    }

    /* renamed from: g */
    public boolean mo4958g() {
        return this.f4175e.readInt() != 0;
    }

    /* renamed from: i */
    public byte[] mo4960i() {
        int readInt = this.f4175e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f4175e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public CharSequence mo4962k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4175e);
    }

    /* renamed from: m */
    public boolean mo4964m(int i) {
        while (this.f4180j < this.f4177g) {
            int i2 = this.f4181k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f4175e.setDataPosition(this.f4180j);
            int readInt = this.f4175e.readInt();
            this.f4181k = this.f4175e.readInt();
            this.f4180j += readInt;
        }
        return this.f4181k == i;
    }

    /* renamed from: o */
    public int mo4966o() {
        return this.f4175e.readInt();
    }

    /* renamed from: q */
    public <T extends Parcelable> T mo4968q() {
        return this.f4175e.readParcelable(getClass().getClassLoader());
    }

    /* renamed from: s */
    public String mo4970s() {
        return this.f4175e.readString();
    }

    /* renamed from: w */
    public void mo4974w(int i) {
        mo4955a();
        this.f4179i = i;
        this.f4174d.put(i, this.f4175e.dataPosition());
        mo4946E(0);
        mo4946E(i);
    }

    /* renamed from: y */
    public void mo4976y(boolean z) {
        this.f4175e.writeInt(z ? 1 : 0);
    }
}
