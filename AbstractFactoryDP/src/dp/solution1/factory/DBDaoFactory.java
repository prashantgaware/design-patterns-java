package dp.solution1.factory;

import dp.solution1.dao.DBCourseDao;
import dp.solution1.dao.DBStudentDao;
import dp.solution1.dao.IDAO;

public class DBDaoFactory implements IDAOFactory {
    public IDAO createDao(String type) {
        IDAO dao = null;
        if (type.equalsIgnoreCase("student"))
            dao = new DBStudentDao();
        else if (type.equalsIgnoreCase("course")) {
            dao = new DBCourseDao();
        } else
            throw new IllegalArgumentException("Invalid DAO type.");

        return dao;
    }
}
