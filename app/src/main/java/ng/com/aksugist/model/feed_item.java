package ng.com.aksugist.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Nsikak  Thompson on 11/3/2016.
 */
public class feed_item {
    String title;
    int image;



    String description;
    public feed_item(){

    }

    public feed_item(String title,String description, int image) {
        this.title = title;
        this.image = image;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
