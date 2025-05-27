package shootingspaceship;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.net.URL;
import java.io.IOException;


public class test {
    public static void main(String[] args) {
        try {
            URL imgUrl = test.class.getResource("/image/universe.jpg");
            if (imgUrl == null) {
                System.err.println("이미지 못 찾음!");
                return;
            }
            BufferedImage img = ImageIO.read(imgUrl);
            System.out.println("이미지 불러오기 성공!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

