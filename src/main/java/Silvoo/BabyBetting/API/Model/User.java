package Silvoo.BabyBetting.API.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class User {
    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";
    @Id
    private String id;
    private String userName;
    private String password;
    private Bet bets;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Bet getBets() {
        return bets;
    }

    public void setBets(Bet bets) {
        this.bets = bets;
    }
}
