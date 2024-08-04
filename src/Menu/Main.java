package Menu;

import java.util.Scanner;
import Acount.*;
public class Main {
    public static void main(String[] args) {
        Data_Acount obj1= new Data_Acount();
        Scanner duc =new Scanner(System.in);
        boolean mycheck=true;
        boolean tong=true;
  boolean mycheck2=true;

         // vòng 1 kiểm tra người dùng dã có tài khoản hay chưa

        while(mycheck2){
            System.out.println("Bạn đã có tài toàn chưa ? ");
            System.out.println("Nếu chưa có thì nhập 0(No) để tạo hoặc nhập 1(Yes) để bỏ qua ! ");
            System.out.println("Yes or No");
            int option1= duc.nextInt();
            duc.nextLine();
            if(option1==1){
                mycheck2=false;
                break;
            }else{
                obj1.Creative_Acount();
            }
        }
      // vòng 2 Đăng nhập
        while(tong){
            System.out.println("----Đăng nhập----");
            System.out.print("Nhập tài khoản :");
            String name= duc.nextLine();

            System.out.print("Nhập password :");
            String password=duc.nextLine();

             if(obj1.SignIn(name,password)){

                 while(mycheck){
                     System.out.println("------------ Hệ thống quản lý thông tin các nhân--------------");
                     System.out.println("Enter (8888888) để vào vào với tư cách Admin ");
                     System.out.println("1.Thêm thông tin mới  ");
                     System.out.println("2.Hiển thị danh sách những các nhân hiện có ");
                     System.out.println("3.Chỉnh sửa thông tin ");
                     System.out.println("4.Đăng Xuất");
                     System.out.println("5.Thoát");

                     int op = duc.nextInt();
                     duc.nextLine();
                     // vòng 2.1 vào phần ADMIN
                     if(op==8888888){
                         System.out.println("--------- ADMIN --------");
                         System.out.println("1.Xem danh sách tài khoản hiện có trong hệ thống.");
                         System.out.println("2.Xóa tài khoản.");
                         System.out.println("3.Chỉnh sửa tải khoản hoặc mật khẩu .");
                         System.out.println("4.Thoát khỏi quyền ADMIN ");
                         boolean mycheck4=true;
                         while(mycheck4){
                         int option1=duc.nextInt();
                         switch (option1){
                             case 1:{
                                 obj1.printoutAll_Account();
                                 break;
                             }
                             case 2:{
                                 System.out.print("Nhập tên tài khoản muốn xóa :");
                                 String removeAccount=duc.nextLine();
                                 obj1.Remove_Account(removeAccount);
                                 // trường hợp 2 này đang bị lỗi cần  kiểm tra lại .
                                 break;
                             }
                             case 3:{
                                 System.out.println("hệ Thống đang được cập nhật ");
                                 break;

                             }
                             case 4:{
                                 System.out.println(" _____________________");
                                 System.out.println("| Đã thoát khỏi ADMIN |");
                                 System.out.println(" _____________________");
                                 mycheck4=false;
                                 break;
                             }
                         }
                         }
                     }

          // 2.2 Chọn các option của Program.

                     switch (op){
                         case 1:{
                             System.out.println(" thủ 1 ");
                             break;
                         }
                         case 2:{
                             System.out.println("thu 2 ");
                             break;
                         }
                         case 3:{
                             System.out.println("thu 3 ");
                             break;
                         }
                         case 5:{
                             mycheck=false;
                             System.out.println("Đã thoát.");
                         }
                         case 4:{
                             tong=false;
                         }
//                         default:{
//                             System.out.println("Không hợp lệ vui lòng chọn lại, Xin cảm ơn ");
//                         }

                     }


                 }
             }

        }



    }
}
