package no.phasfjo.models.passenger;

import org.jetbrains.annotations.NotNull;

public class Passenger3 extends Passenger2 implements Comparable<Passenger3> {

    public static class RewardProgram {
        private int memberLevel; // 3 (1 st priority), 2, 1
        private int memberDays; // Secondary ordering

        public int getMemberLevel() {
            return memberLevel;
        }

        public void setMemberLevel(int memberLevel) {
            this.memberLevel = memberLevel;
        }

        public int getMemberDays() {
            return memberDays;
        }

        public void setMemberDays(int memberDays) {
            this.memberDays = memberDays;
        }
    }

    private String name;
    private RewardProgram rewardProgram = new RewardProgram();

    public RewardProgram getRewardProgram() {
        return rewardProgram;
    }

    public void setRewardProgram(RewardProgram rewardProgram) {
        this.rewardProgram = rewardProgram;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

/*    public int getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(int memberLevel) {
        this.memberLevel = memberLevel;
    }

    public int getMemberDays() {
        return memberDays;
    }

    public void setMemberDays(int memberDays) {
        this.memberDays = memberDays;
    }

    public Passenger3(int freeBags) {
        super(freeBags);
    }

    public Passenger3(int freeBags, int checkedBags) {
        super(freeBags, checkedBags);
    }

    public Passenger3(double perBagFee) {
        super(perBagFee);
    }*/
    public Passenger3(String name){
        this.name = name;
    }


    public Passenger3(@NotNull String name, int memberLevel, int memberDays){
        super();
        this.name = name;
        this.rewardProgram.memberLevel = memberLevel;
        this.rewardProgram.memberDays = memberDays;
    }

    @Override
    public int compareTo(@NotNull Passenger3 o) {
        int returnValue = o.rewardProgram.memberLevel - rewardProgram.memberLevel; // received passenger - current memberLevel
        if(returnValue == 0)
            returnValue = o.rewardProgram.memberDays - rewardProgram.memberDays; // received passenger days - current
        return returnValue;
    }

    @Override
    public String toString() {
        return "Passengers{" +
                "name='" + name + '\'' +
                ", \tmemberLevel=" + rewardProgram.memberLevel +
                ", \tmemberDays=" + rewardProgram.memberDays +
                '}';
    }
}
