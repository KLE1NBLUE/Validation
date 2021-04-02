package Impl;

public class Check1 {

    public float getLike(String str,String url1, String url2) {
        FaceCheck faceCheck = new FaceCheck();
        float like = faceCheck.check(str,url1, url2);
        return like;
    }
}

