import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

/**
 * Created by pht on 24/08/2019.
 */
public class main {
    public static void main(String []args) {
        Tesseract tesseract = new Tesseract();
        try {
            tesseract.setDatapath("D:\\MyPhuong\\Tess4J\\tessdata");
            String text = tesseract.doOCR(new File("D:\\MyPhuong\\bien_so_xe.jpg"));
            System.out.print(text);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }
}
