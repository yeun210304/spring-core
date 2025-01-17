package hello.core.discount;

import hello.core.member.Member;
import hello.core.member.Grade;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 100;    // 1000원 할일

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }
        else {
            return 0;
        }
    }

}
