package ru.itacademy;

import ru.itacademy.servlt.Account;
import ru.itacademy.servlt.AccountRecoredMapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountDao {

    private  final String url;
    private final   String username;
    private final   String password;
    private  final AccountRecoredMapper mapper;

    //language=sql
    private  static   final  String SQL_GET_BY_ID = "select * from  account where id =?";
    public AccountDao(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.mapper = new AccountRecoredMapper();
    }


    public Account getById( final String id) throws SQLException {
        PreparedStatement preparedStatement = getConetion().prepareStatement(SQL_GET_BY_ID);
        preparedStatement.setLong(1, Long.parseLong(id));


        return  mapper.mapRow( preparedStatement.executeQuery());

    }

    private  Connection getConetion() throws SQLException {
        return DriverManager.getConnection(this.url,this.username,this.password);
    }
}

