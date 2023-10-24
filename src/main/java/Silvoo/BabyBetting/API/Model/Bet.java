package Silvoo.BabyBetting.API.Model;

import java.time.LocalDate;

public class Bet {
    private String betGender;
    private Integer betGenderAmount;
    private LocalDate betDate;
    private Integer betDateAmount;

    public Bet(){}
    public Bet(String betGender, Integer betGenderAmount, LocalDate betDate, Integer betDateAmount) {
        this.betGender = betGender;
        this.betGenderAmount = betGenderAmount;
        this.betDate = betDate;
        this.betDateAmount = betDateAmount;
    }

    public String getBetGender() {
        return betGender;
    }

    public void setBetGender(String betGender) {
        this.betGender = betGender;
    }

    public Integer getBetGenderAmount() {
        return betGenderAmount;
    }

    public void setBetGenderAmount(Integer betGenderAmount) {
        this.betGenderAmount = betGenderAmount;
    }

    public LocalDate getBetDate() {
        return betDate;
    }

    public void setBetDate(LocalDate betDate) {
        this.betDate = betDate;
    }

    public Integer getBetDateAmount() {
        return betDateAmount;
    }

    public void setBetDateAmount(Integer betDateAmount) {
        this.betDateAmount = betDateAmount;
    }

    @Override
    public String toString() {
        return "Bet{" +
                "betGender='" + betGender + '\'' +
                ", betGenderAmount=" + betGenderAmount +
                ", betDate=" + betDate +
                ", betDateAmount=" + betDateAmount +
                '}';
    }
}
