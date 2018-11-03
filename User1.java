package sample;

public class User1 {

    private String user;
    private String password;

    //constructor fara parametrii
    public User1(){
    this.user = "";
    this.password = "";
}
//constructor cu parametrii
    public User1(String user, String password)
    {
        this.user = user;
        this.password = password;
    }


//functii get si set
    public String getUser()
    {
        return user;
    }
    public String getPassword()
    {
        return password;
    }
    public void setUser(String user)
    {
        this.user = user;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
}
