package ru.itacademy;//packageru.itacademy;
import ru.itacademy.AccountDao;
import ru.itacademy.servlt.Account;

import java.sql.SQLException;
import java.sql.Statement;
public  class  Main{
    public  static  void  main  (String[] args) throws  SQLException{

        final  String url =  "jdbc:postgresql:// loclhost:5432 /agona-db";
        final  String username = "postgres";
        final  String password = "password";
        AccountDao dao = new AccountDao(url, username, password);

    }



}



