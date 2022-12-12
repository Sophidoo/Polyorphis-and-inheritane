package org.example;

public class PolyDemo {
    public String userRegisteration(Long id, String email, String password){
        return "Your details are as follows \n Id: " + id + "\n Email: " + email + "\n Password: " + password;
    }

    public String userRegisteration(Long id, String email, String password, String Firstname, String Lastname){
        return "Your details are as follows \n Id: " + id + "\n Email: " + email + "\n Password: " + password + "\n Firstname: " + Firstname + "\n Lastname: " + Lastname;
    }

    public void userRegisteration(String password, String email){
        if(email.equals("sophia") && password.equals("onyeka")){
            System.out.println("Congratulations on your wedding anniversary");
        }else{
            System.err.println("wrong input ");
        }
    }
}
