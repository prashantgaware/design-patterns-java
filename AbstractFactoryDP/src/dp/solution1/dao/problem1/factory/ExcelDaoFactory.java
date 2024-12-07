package dp.solution1.dao.problem1.factory;

import dp.solution1.dao.problem1.dao.ExcelCourseDao;
import dp.solution1.dao.problem1.dao.ExcelStudentDao;
import dp.solution1.dao.problem1.dao.IDAO;

public class ExcelDaoFactory {
    public static IDAO createDao(String type) {
        IDAO dao = null;
        if (type.equalsIgnoreCase("student"))
            dao = new ExcelStudentDao();
        else if (type.equalsIgnoreCase("course")) {
            dao = new ExcelCourseDao();
        } else
            throw new IllegalArgumentException("Invalid DAO type.");

        return dao;
    }
}
