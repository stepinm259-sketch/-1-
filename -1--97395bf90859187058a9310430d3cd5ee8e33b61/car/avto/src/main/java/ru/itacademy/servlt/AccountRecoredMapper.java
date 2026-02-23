package ru.itacademy.servlt;


import ru.itacademy.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRecoredMapper implements RowMapper<Account> {


    @Override
    public Account mapRow(ResultSet resultSet) throws SQLException {
        return new Account(resultSet.getLong
                ("id"),resultSet.getString
                ("name"),resultSet.getInt
                ("age") );
    }
}