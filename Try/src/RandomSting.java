import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by faithpercious on 2017/9/25.
 */
public class RandomSting {
    //试验随机生成字符串，根据查找资料使用asccii码进行

public void testsort(){
        Random srandom=new Random();
        List<String>stringList=new ArrayList<>();
       int x;

        for (int i =0;i<10;i++){
            StringBuffer str=new StringBuffer();
            do {
//                int k;
//                do {
//                   k =srandom.nextInt(10);//随机生成字符串长度
//                }while (k==0);
                for (int j=0;j<10;j++){
                    x =srandom.nextInt(127);
                   if ((x>47&&x<58)||(x>64&&x<91 )||(x>96&&x<123)){
                       str.append((char)x);
                    }
                    else continue;
                    }
                }while (stringList.contains(str));
                stringList.add(str.toString());
            System.out.println("加入字符串："+str.toString());
        }
    System.out.println("---------ascaii码方法----------");
    System.out.println("----------排序前---------------");
    for (String obj:stringList
         ) {
        System.out.println("元素为;"+obj);
    }
    System.out.println("----------排序后---------------");
    Collections.sort(stringList);
    for (String obj:stringList
            ) {
        System.out.println("元素为;"+obj);
             }
    }
    
    public static void main(String[] args) {
        RandomSting s=new RandomSting();
        s.testsort();
    }
}

