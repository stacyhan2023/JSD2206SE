package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**子类重写超类含有throws声明异常抛出的方法时候，堆throws的重写规则*/
public class ThrowsDemo {
    public void dosome()throws IOException, AWTException{}
}
class SubClass extends ThrowsDemo{
   // public void dosome()throws IOException, AWTException{}
    //重写时可以不再抛出异常
   // public void dosome(){}
    //重写时候可以仅抛出部分异常
   //public void dosome()throws AWTException{}
    //重写时可以抛出超类方法抛出异常的子类行异常
   //public void dosome()throws FileNotFoundException {}
    //不允许抛出额外异常（超类方法上没有声明也没有继承关系）
   //public void dosome()throws SQLException {}
    //不允许抛出比超类方法声明的异常还大的异常
   //public void dosome()throws Exception{}

}


