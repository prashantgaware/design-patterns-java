package dp.solution1.abstract_factory;

import dp.solution1.factory.DBDaoFactory;
import dp.solution1.factory.ExcelDaoFactory;
import dp.solution1.factory.IDAOFactory;

public class DAOFactoryCreator {
    public static IDAOFactory buildDAOFactory(String factory) {
        IDAOFactory idaoFactory = null;
        if (factory.equalsIgnoreCase("DB")) {
            return idaoFactory = new DBDaoFactory();
        } else if (factory.equalsIgnoreCase("Excel")) {
            return idaoFactory = new ExcelDaoFactory();
        } else
            throw new IllegalArgumentException("Invalid factory type");
    }
}
