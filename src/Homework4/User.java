package Homework4;

public class User {

    private String nickname;
    private String password;
    private int loginAttemptsLeft;
    private boolean blocked;


    public User(String nickname, String password) {

        this.nickname = nickname;
        this.password = password;
        this.loginAttemptsLeft = 3;
        this.blocked = false;
    }

    public String getNickname() {
        return this.nickname;
    }

    private String getPassword() {
        return this.password;
    }

    public int getLoginAttemptsLeft() {
        return loginAttemptsLeft;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void setLoginAttemptsLeft(int attemptsLeft) {
        this.loginAttemptsLeft = attemptsLeft;
    }

    private void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean verifyPassword(String password) {
        if ((this.getLoginAttemptsLeft()!=0) && (!this.isBlocked()) && password.equals(this.getPassword())) {
            this.setLoginAttemptsLeft(3);
            return true;
        }
        else if (this.getLoginAttemptsLeft() == 0) {
            this.setBlocked(true);
            return false;
        }
        else {
            int attemptsLeft = this.getLoginAttemptsLeft() - 1;
            this.setLoginAttemptsLeft(attemptsLeft);
            return false;
        }

    }
}

