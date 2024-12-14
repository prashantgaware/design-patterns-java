package dp.solution1.factory;

import dp.solution1.dao.ExcelCourseDao;
import dp.solution1.dao.ExcelStudentDao;
import dp.solution1.dao.IDAO;

public class ExcelDaoFactory implements IDAOFactory {
    public IDAO createDao(String type) {
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
