package by.htp.ex.service.impl;

import java.sql.SQLException;

import by.htp.ex.bean.User;
import by.htp.ex.dao.DaoException;
import by.htp.ex.dao.DaoProvider;
import by.htp.ex.dao.IUserDAO;
import by.htp.ex.dao.connection.ConnectionPoolException;
import by.htp.ex.service.IUserService;

public class UserServiceImpl implements IUserService{

    private final IUserDAO userDAO = DaoProvider.getInstance().getUserDAO();
    
    
    @Override
    public boolean registration(User newUser) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String signin(String login, String password) throws DaoException, ConnectionPoolException, SQLException {
        String role;
        if (userDAO.signIn(login, password)) {
            return role = userDAO.getRole(1);
        } else {
            return role = "guest";
        }
    }

    @Override
    public User findUserById(String id) throws SQLException, ConnectionPoolException {
        User user = userDAO.findUserById(id);
        return user;
    }

    @Override
    public int getUserId(String login) throws ConnectionPoolException, SQLException {
        User user = userDAO.getUser(login);
        System.out.println(user.getLogin());
        int id = user.getId();
        return id;
    }

    

  
    
    
}
