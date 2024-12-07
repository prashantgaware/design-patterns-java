package dp.problem1.factory;

import dp.problem1.dao.*;

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
