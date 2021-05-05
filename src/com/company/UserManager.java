package com.company;

public class UserManager {
    public void SignUp(User user){
        System.out.println(user.userName + "Kayıt edildi.");
    }
    public void LogIn(User user){
        System.out.println(user.userName + " hoşgeldiniz.");
    }
}
