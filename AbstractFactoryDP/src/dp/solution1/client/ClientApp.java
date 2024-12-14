package dp.solution1.client;

import dp.solution1.abstract_factory.DAOFactoryCreator;
import dp.solution1.dao.IDAO;
import dp.solution1.factory.DBDaoFactory;
import dp.solution1.factory.ExcelDaoFactory;
import dp.solution1.factory.IDAOFactory;

public class ClientApp {
    public static void main(String[] args) {

        IDAOFactory daoFactory = null;
        IDAO stDAO = null, crDAO = null;

        daoFactory = DAOFactoryCreator.buildDAOFactory("db");
        stDAO = daoFactory.createDao("student");
        crDAO = daoFactory.createDao("course");

        stDAO.insert();
        crDAO.insert();
    }
}
