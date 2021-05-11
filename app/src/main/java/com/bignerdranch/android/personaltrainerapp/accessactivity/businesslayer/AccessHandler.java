package com.bignerdranch.android.personaltrainerapp.accessactivity.businesslayer;

import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.Member;
import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.MemberCard;

public class AccessHandler {
    private int mTransactionID;
    private Member mMember;
    private MemberCard mMemberCard;

    public Member RetrieveMemberInfo(String memberName) {
        return null;
    }

    public MemberCard RetrieveMemberCardInfo(int memberID) {
        return null;
    }

    public int CreateChargeSlip(int memberID, String memberName, String activityName) {
        return 0;
    }

    public void UpdateSlipSignature(int transactionID, boolean hasSignature) {

    }
}
