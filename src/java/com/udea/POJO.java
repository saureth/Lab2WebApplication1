package com.udea;

/**
 *
 * @author santiago.sanmartin
 */

public class POJO {
    private String title;
    private String singer;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getSinger() {
        return singer;
    }
    public void setSinger(String singer) {
        this.singer = singer;
    }
    
    @Override
    public String toString(){
        return"pojo["+ "title="+ title + ", singer=" + singer + ']';
    }
}
