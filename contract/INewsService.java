package contract;

import com.bj58.spat.gaea.server.contract.annotation.OperationContract;
import com.bj58.spat.gaea.server.contract.annotation.ServiceContract;
import entity.News;

import java.util.List;

/**
 * @author Xiamuzi
 * @version 1.0
 * @date 2020/2/14 14:50
 */
@ServiceContract
public interface INewsService {
    @OperationContract
    public News getNewsByID(int newsID) throws Exception;
    @OperationContract
    public List<News> getNewsByCateID() throws Exception;
}
