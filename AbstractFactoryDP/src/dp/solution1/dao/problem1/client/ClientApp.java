package dp.solution1.dao.problem1.client;

import dp.solution1.dao.problem1.dao.IDAO;
import dp.solution1.dao.problem1.factory.DBDaoFactory;
import dp.solution1.dao.problem1.factory.ExcelDaoFactory;

public class ClientApp {
    public static void main(String[] args) {
//        IDAO dao = null;
        /**
         * here the client is getting freedom to use two different factories to create the objects of the same families
         *     classes, ie, he is able to save student info in DB s/w and course info in excel file by getting
         *     two dao objects using two different objects
         */
        IDAO studDao = DBDaoFactory.createDao("student");
        IDAO courseDao = ExcelDaoFactory.createDao("student");
        studDao.insert();
        System.out.println("======================");
        courseDao.insert();
    }
}
