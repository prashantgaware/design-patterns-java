package dp.solution1.factory;

import dp.solution1.dao.IDAO;

public interface IDAOFactory {
    IDAO createDao(String type);
}
