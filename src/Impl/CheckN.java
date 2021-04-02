package Impl;

import java.util.ArrayList;

public class CheckN {

    public ArrayList<Float> getLike(String str,String url1,ArrayList<String> url2) {

        ArrayList<Float> like = new ArrayList<>(); // 初始化
        FaceCheck faceCheck = new FaceCheck();
        for (String url :  url2) {
            like.add(faceCheck.check(str,url1, url));
        }
        return like;
    }
}
