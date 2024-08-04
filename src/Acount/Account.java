package Acount;

public class Account {

private String name;
private String password;

public Account(){

}

    public Account(String name , String password){
this.name=name;
this.password=password;
    }

    public String getName(){
    return name;
    }

public String getPassword(){
    return password;

}

public String toString(){
    System.out.println("____________________________");
    return "Tài khoản:"+name+" "+" Mật khẩu:"+password;

}

    @Override // override sẽ ghi đè lên phương thức equals mặc định của Class
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Kiểm tra đối tượng hiện tại(this) xem có trùng với obj không
        if (obj == null || getClass() != obj.getClass()) return false;  // Kiểm tra nếu đối tượng khác loại
        Account account = (Account) obj; // vì muốn so sánh kiểu Account thì phải ép obj về Account
                                        // để cùng kiểu mới có thể so sánh cách thuộc tính
        return name.equals(account.name)&&password.equals(account.password);  // So sánh thuộc tính
    }

    @Override
    public int hashCode() {
        return name.hashCode();  // Trả về mã băm của thuộc tính name
    }


}
