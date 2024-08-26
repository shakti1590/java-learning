package com.example.demo.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// java 8 stream map and collect example
public class MapAndCollect {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "shakti", "passcode", "abc@gmail.com"));
        users.add(new User(2, "singh", "passcode1", "def@gmail.com"));
        users.add(new User(3, "rohit", "passcode2" ,"xyz@gmail.com"));

        List<UserDTO> usersDTO = new ArrayList<UserDTO>();
        for(User user : users){
            usersDTO.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
        }
        for (UserDTO dto : usersDTO){
            System.out.println(dto);
        }
        System.out.println("**************************");
        // using stream .map()
        List<UserDTO> userDTO = users.stream().map((User user ) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail())).collect(Collectors.toList());
        usersDTO.forEach(System.out::println);

    }
}
class UserDTO{
    private int id;
    private String userName;
    private String email;

    public UserDTO (int id, String userName, String email){
        super();
        this.id = id;
        this.userName = userName;
        this.email = email;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    @Override
    public String toString(){
        return "User [id= "+id+", userName = "+userName+", email="+email+"]";
    }
}
class User {
    private int id;
    private String userName;
    private String password;
    private String email;

    public User (int id, String userName, String password, String email){
        super();
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    @Override
    public String toString(){
        return "User [id= "+id+", userName = "+userName+", password="+password+", email="+email+"]";
    }
}