import java.awt.*;
class MyFrame extends Frame
{
    MyFrame(String title){
        super(title);
    }
}
public class FrameDemo{
    public static void main(String args[]){
        MyFrame f = new MyFrame("Frames");
        f.setSize(300,300);
        f.setVisible(false);
        f.setTitle("Hello Guy's");
    }
}