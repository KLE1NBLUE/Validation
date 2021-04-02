import Scripts.Environment;
import Scripts.TestDriver;

import java.util.ArrayList;

public class RunMain {

    public static boolean correct11(Object object) {
        Class className = object.getClass();
        if (className.equals(Float.class) && (float) object >= 0.0 && (float) object <= 1.0) {
            return true;
        }
        return false;
    }

    public static boolean correct1N(ArrayList arrayList) {

        for (Object obj : arrayList) {
            if (obj instanceof Float && (float) obj >= 0.0 && (float) obj <= 1.0) {
            } else {return false;
        }}

        return true;
    }

    public static void main(String[] args) {
        Environment environment = new Environment();

        if (environment.checkOsVesion() && environment.checkFile()) {

            System.out.println("环境检测完成，下面将显示返回值的验证情况:");
        }else {
            return;
        }

        TestDriver testDriver = new TestDriver();//TestDriver类获取1:1和1:N测试的相似度

        testDriver.setLike();//设置相似度的值

        if (correct11(testDriver.like11)) {
            System.out.println("1:1比对返回值正确");
        } else {
            System.out.println("1:1比对返回值错误\n正确的返回值应是float类型的相似度");
            return;
        }

        if (correct1N(testDriver.like1N)) {
            System.out.println("1:N比对返回值正确");
        } else {
            System.out.println("1:N比对返回值错误\n正确的返回值应是内部装有float类型相似度的ArrayList");
            return;
        }

        System.out.println("您的算法满足参加测试的要求，请将本项目文件打包成zip压缩包，在算法管理页面上传本算法");

    }

}
