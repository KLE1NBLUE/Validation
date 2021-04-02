package Scripts;

import Impl.Check1;
import Impl.CheckN;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author KLE1NBLUE
 */
public class TestDriver {
    public float like11;
    public ArrayList<Float> like1N;

    String conf = "";
    //输入conf文件夹的绝对路径

    String url = "";
    //输入images文件夹的绝对路径

    String url1 = url + "",
    //比对的样本图片文件名
            url2 = url + "";
    //1:1比对的对象图片文件名

    ArrayList<String> url3 = new ArrayList(Arrays.asList());
    //1:n比对的对象图片文件名

    public void setLike() {
        Check1 check1 = new Check1();
        CheckN checkN = new CheckN();

        this.like11 = check1.getLike(conf,url1, url2);
        //1:1 参数为两个String,返回值为float类型的相似度

        this.like1N = checkN.getLike(conf,url1, url3);
        //1:N 参数为一个String和一个ArrayList<String>，返回值为一个Arraylist<Float>的相似度
    }

}
