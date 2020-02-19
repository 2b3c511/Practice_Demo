package components;

import com.bj58.spat.gaea.server.contract.annotation.ServiceBehavior;
import contract.INewsService;
import entity.News;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiamuzi
 * @version 1.0
 * @date 2020/2/14 14:51
 */
@ServiceBehavior
public class NewsService implements INewsService {
    @Override
    public News getNewsByID(int newsID) throws Exception {
        return NewsService.getNews();
    }

    @Override
    public List<News> getNewsByCateID() throws Exception {
        List<News> list = new ArrayList<News>();
        list.add(NewsService.getNews());
        return list;
    }

    private static News getNews() {
        News news = new News();
        news.setNewsID(58);
        news.setTitle("58 同城一个神奇的网站");
        return news;
    }
}
