package Scripts;

import java.io.File;

public class Environment extends Exception {

    public static Boolean hasFile(File file) {

        boolean hasFile = false;
        File[] listFiles = file.listFiles();
        for (File file1 : listFiles) {
            if (file1.isDirectory() && hasFile == false) {
                hasFile = hasFile(file1);   // 如果是目录且没有发现有文件，回调自身继续查询
            } else {
                return true;
            }
        }
        return hasFile;
    }


    public boolean checkOsVesion() {

        if (System.getProperty("os.name").equals("Windows 10") && System.getProperty("os.arch").equals("amd64")) {
            System.out.println("你的系统版本是:" + System.getProperty("os.name") + " x64\n符合参加测试的要求");//系统名
            return true;
        } else
            System.out.println("你的系统版本是:" + System.getProperty("os.name") + " x86" + "\n参加测试需要使用Windows 10 x64系统\n请检查你的系统版本.\n");
        return false;

    }

    public boolean checkFile() {
        //具体文件的检测 libs conf
        File file1 = new File("libs");

        if (hasFile(file1)) {
            System.out.println("libs文件夹下内容符合要求");
        } else {
            System.out.println("libs文件夹不能为空");
            return false;

        }

        File file2 = new File("conf");

        if (hasFile(file2)) {
            System.out.println("conf文件夹下内容符合要求");
        } else {
            System.out.println("conf文件夹不能为空");
            return false;
        }

        File file3 = new File("version.txt");
        if (!file3.exists()) {
            System.out.println("version.txt文件不存在，请创建对应文件");
            return false;
        } else {
            System.out.println("含有version.txt,符合要求");
        }
        return true;
    }


}
