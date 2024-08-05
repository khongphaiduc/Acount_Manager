package Account_Admin;

import java.util.ArrayList;

public class Account_Admin {

    ArrayList<ADMIN>accountAdmin=new ArrayList<>();


    public  Account_Admin(){
        ADMIN admins=new ADMIN("phamtrungduc","123456789");
        accountAdmin.add(admins);
    }

    public boolean Account_ADMIN(String account,String pass){
        ADMIN admins1=new ADMIN(account,pass);
        if(accountAdmin.contains(admins1)){
            return true;
        }else{
            System.out.println(" (System) => Tài Khoản của bạn không được phân quyền admin  ");

            return false;
        }

    }

}
