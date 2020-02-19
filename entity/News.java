package entity;

import com.bj58.spat.gaea.serializer.component.annotation.GaeaMember;
import com.bj58.spat.gaea.serializer.component.annotation.GaeaSerializable;

/**
 * @author Xiamuzi
 * @version 1.0
 * @date 2020/2/14 14:52
 */
@GaeaSerializable
public class News {
    @GaeaMember
    private int newsID;
    @GaeaMember
    private String title;
	@GaeaMember
	private int family_name;
    public int getNewsID() {
        return newsID;
    }

    public void setNewsID(int newsID) {
        this.newsID = newsID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}