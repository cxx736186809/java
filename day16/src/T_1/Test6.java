package T_1;
/*
1. 给定一个导演 Director接口，内含唯一的抽象方法 makeMovie，且无参数、无返回值。
2. 在下面的代码中，请分别使用Lambda的标准格式及省略格式调用 invokeDirect 方法，打印输出： 导演拍电影啦!
 */
public class Test6 {
    public static void main(String[] args) {
        inDirector(()->{
            System.out.println("导演拍电影啦！");
        });
    }
    private static void inDirector(Director director){
        director.makeMovie();
    }
}

interface Director {

    void makeMovie();
}