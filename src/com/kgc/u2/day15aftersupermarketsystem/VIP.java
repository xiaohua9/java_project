package com.kgc.u2.day15aftersupermarketsystem;

import java.util.Objects;

//会员类
public class VIP {
    //属性：姓名，账号，密码,积分，开卡日期
    private String name;
    private String count;
    private String password;
    private double rewardPoints=100;//开卡赠送100积分
    private String cardBirthday;
//////set/get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(double rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public String getCardBirthday() {
        return cardBirthday;
    }

    public void setCardBirthday(String cardBirthday) {
        this.cardBirthday = cardBirthday;
    }
    //重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VIP vip = (VIP) o;
        return Objects.equals(count, vip.count) &&
                Objects.equals(password, vip.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, password);
    }
}

