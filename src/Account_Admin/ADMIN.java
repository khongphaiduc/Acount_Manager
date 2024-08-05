package Account_Admin;

public class ADMIN {
    private String name ;
    private String pass;
    public ADMIN(){

    }
    public ADMIN(String name ,String pass){
        this.name=name;
        this.pass=pass;

    }
    public String getName(){
        return name;
    }
    public String getPass(){
        return pass;
    }
    public String toString(){
        return "Tài Khoản:"+name+"Mật khẩu :"+pass;
    }



    public boolean equals(Object obj){
        if(obj==null) return false ;
        ADMIN t = (ADMIN)obj;
        return this.name.equals(t.name)&&this.pass.equals(t.pass);
    }

}
