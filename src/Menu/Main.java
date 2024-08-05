package Menu;

import java.util.Scanner;
import Acount.*;
import Account_Admin.*;
public class Main {
    public static void main(String[] args) {
        Data_Acount obj1= new Data_Acount();
        Account_Admin obj2 = new Account_Admin();
        Scanner duc =new Scanner(System.in);
        boolean mycheck=true;
        boolean tong=true;

         // vòng 1 kiểm tra người dùng dã có tài khoản hay chưa

        while(true){
            System.out.println("Bạn đã có tài toàn chưa ? ");
            System.out.println("Nếu chưa có thì nhập 0(No) để tạo hoặc nhập 1(Yes) để bỏ qua ! ");
            System.out.println("Yes or No");
            int option1= duc.nextInt();
            duc.nextLine();
            if(option1==1){
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
            if(name.equals("-")){
                break;
            }
            System.out.print("Nhập password :");
            String password=duc.nextLine();
             if(obj1.SignIn(name,password)){
                mycheck=true;
                 while(mycheck){
                     System.out.println("------------ Hệ thống quản lý thông tin các nhân--------------");
                     System.out.println("Tài Khoản: "+name);
                     System.out.println("Enter (0) để vào vào với tư cách Admin ");
                     System.out.println("1.Thêm thông tin mới  ");
                     System.out.println("2.Hiển thị danh sách những các nhân hiện có ");
                     System.out.println("3.Chỉnh sửa thông tin ");
                     System.out.println("4.Đăng Xuất");
                     System.out.println("5.Thoát");

                     int op = duc.nextInt();
                     switch (op){
                         case 0:{
                             if(obj2.Account_ADMIN(name,password)){

                                 System.out.println("--------- ADMIN --------");
                                 System.out.println("Admin:("+name+")");
                                 System.out.println("1.Xem danh sách tài khoản hiện có trong hệ thống.");
                                 System.out.println("2.Xóa tài khoản.");
                                 System.out.println("3.Chỉnh sửa tải khoản hoặc mật khẩu .");
                                 System.out.println("4.Thoát khỏi quyền ADMIN ");
                                 boolean mycheck4=true;

                                 while(mycheck4){
                                     int option1=duc.nextInt();
                                     duc.nextLine();
                                     switch (option1){
                                         case 1:{
                                             obj1.printoutAll_Account();
                                             break;
                                         }
                                         case 2:{
                                             System.out.print("Nhập tên tài khoản muốn xóa :");
                                             String removeAccount=duc.nextLine();
                                             obj1.Remove_Account(removeAccount);

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
                             break;
                         }
                         case 1:{
                             System.out.println("PHAM TRUNG ĐỨC ");
                             break;
                         }
                         case 2:{
                             System.out.println("PHAM TRUNG DUCCCCCCCCCCC ");
                             break;
                         }
                         case 3:{
                             System.out.println("PHAM TRUNG DUC DUC ");
                             break;
                         }
                         case 4:{
                             mycheck=false;
                             System.out.println("(Thông báo) => Đã đăng xuất.");
                             break;
                         }
                         case 5:{
                             mycheck=false;
                             tong=false;
                             System.out.println("(System) => Hệ thống đã dừng.");
                             break;
                         }


                     }


                 }
             }

        }



    }
    }

