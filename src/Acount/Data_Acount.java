package Acount;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Data_Acount {
 Scanner duc = new Scanner(System.in);

  ArrayList<Account> dataAcount=new ArrayList<>();

     public Data_Acount(){
         Account admin1= new Account("duc","1");//account admin
         Account admin2=new Account("phamtrungduc","123456789");
         dataAcount.add(admin1);
         dataAcount.add(admin2);
     }


     public void printoutAll_Account(){
         for(Account s:dataAcount){
             System.out.println(s);// phương thức này sẽ in theo phương thức toString của Account.
         }
     }

     public void Remove_Account(String account1111){
        boolean mycheck6= true;
         for(int i=0;i<dataAcount.size();i++){
             if(!dataAcount.get(i).getName().equals(account1111)){
                 System.out.println("(Thông báo)=>Tài khoản không tồn tại.");
                 mycheck6=false;
                 break;
             }else{
                 break;
             }
         }
         if(mycheck6){
             System.out.println("(Thông báo)=>Nhập (1) để xác nhận xóa hoặc (0) để hủy.");
             int opt=duc.nextInt();
             if(opt==1){

                 for(int i=dataAcount.size()-1;i>=0;i--){
                     if(dataAcount.get(i).getName().equals(account1111)){
                         dataAcount.remove(i);
                         System.out.println("Xóa thành công .");
                         break;
                     }

                 }

             }else if(opt==0){
                 System.out.println("Đã hủy.");

             }
         }

     }



 static public boolean checkpassword(String pass){
       return pass.matches("[1-9a-zA-Z]+");
  }

//+: Đảm bảo rằng toàn bộ chuỗi pass phải chứa ít nhất một ký tự và tất cả các ký tự phải thuộc tập hợp ký tự đã nêu.

  public void Creative_Acount() {
    try {
      System.out.println("---------- Tạo Tài Khoản------------");
        System.out.print("Nhập (-) để hủy .");
        System.out.println(" ");
      System.out.print("Enter name : ");
        String name = duc.nextLine();
        if(name.equals("-")){
            return ; // enter (-)  để dừng tính năng này
        }
      if (name.length() < 8) {
        throw new IllegalArgumentException();
      }

        boolean checktaikhoantontai = false;
        for(int i=0;i<dataAcount.size();i++){

            if(dataAcount.get(i).getName().equals(name)){
                checktaikhoantontai=true;
            }

        }
        if(checktaikhoantontai){
            System.out.println("(Thông báo)=>Tài Khoản đã tồn tại .");
            return ;
        }
      System.out.print("Enter password :");
      String password = duc.nextLine();

      if (!checkpassword(password) || password.length() < 8) throw new InputMismatchException();
      Account t = new Account(name,password);

      // for kiểm tra xem có đối tượng nào trong list trung tên với tài khoản mới hay không.



        if(!checktaikhoantontai){
            dataAcount.add(t); // add tài khoản vào arraylist.
            System.out.println("(Thông báo)=>Tạo tại khoản thành công ");
        }

    } catch (IllegalArgumentException e) {
      System.out.println("Name Acount phải lớn hơn hoặc bằng  8 ký tự ");
    }
    catch (InputMismatchException f){
      System.out.println("Mật khẩu phải dài hơn 8 ký tự và có chứa ít nhất 1 chữ số,chữ cái thường và hoa .");
    }

  }


public boolean SignIn(String name, String password){

  Account t1 = new Account(name,password);

  if(dataAcount.contains(t1)){
    System.out.println(" -Đăng nhâp thành công- ");
    return  true;
  }else{
    System.out.println("Tên tài khoản hoặc mật khẩu không chính xác.");
    return false;
  }

}
// khi sử dụng constain của arraylist thì mặc đỉnh sẽ sử dụng phương thức equals của Object để kiểm tra
// tất cả các đối tượng có trong list nếu tồn tại thì trả về true
// phương thức equals được định nghĩa trong lớp ( Object ) nếu không được ghi đè thì Constain sẽ
// sử dụng phương thức equals mặc đỉnh và chúng chỉ so sánh địa chỉ của các đối tượng
}
