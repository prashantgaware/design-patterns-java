package dp.solution1.dao.problem1.factory;

import dp.solution1.dao.problem1.dao.DBCourseDao;
import dp.solution1.dao.problem1.dao.DBStudentDao;
import dp.solution1.dao.problem1.dao.IDAO;

public class DBDaoFactory {
    public static IDAO createDao(String type) {
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
