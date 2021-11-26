package com.github.catvod.spider;

import com.github.catvod.spider.merge.C0337cw;
import com.github.catvod.spider.merge.C0394hM;
import org.json.JSONObject;

public class Nfzjm extends C0394hM {
    /* access modifiers changed from: protected */
    /* renamed from: BL */
    public boolean mo53BL(String str) {
        return !str.equals(C0337cw.m1497us(-91384889514086L));
    }

    /* access modifiers changed from: protected */
    /* renamed from: M4 */
    public String mo54M4() {
        return C0337cw.m1497us(-91131486443622L);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public JSONObject mo55S(String str, String str2) {
        str.equals(C0337cw.m1497us(-91573868075110L));
        return super.mo55S(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: jx */
    public String mo56jx(String str, String str2) {
        String replace = str.replace(C0337cw.m1497us(-91419249252454L), C0337cw.m1497us(-91432134154342L));
        C0337cw.m1497us(-91440724088934L);
        if (replace.contains(C0337cw.m1497us(-91445019056230L))) {
            String us = C0337cw.m1497us(-91466493892710L);
            return replace.replace(us, C0337cw.m1497us(-91487968729190L) + str2);
        } else if (str.contains(C0337cw.m1497us(-91509443565670L))) {
            String us2 = C0337cw.m1497us(-91530918402150L);
            return replace.replace(us2, C0337cw.m1497us(-91552393238630L) + str2);
        } else {
            return replace + str2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo57o(String str) {
        return !str.equals(C0337cw.m1497us(-91406364350566L));
    }

    /* access modifiers changed from: protected */
    /* renamed from: tC */
    public String mo58tC() {
        return C0337cw.m1497us(-91303285135462L);
    }
}
