package forkJoinOracle;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

import static forkJoinOracle.ForkBlur.blur;

/**
 * Created by roberto on 10/05/17.
 */
public class Test {
    public static void main(String[] args) throws Exception {

        String srcName = "res/landscape.jpg";
        File srcFile = new File(srcName);
        BufferedImage image = ImageIO.read(srcFile);

        System.out.println("Source image: " + srcName);

        BufferedImage blurredImage = blur(image);

        String dstName = "res/blurred-tulips.jpg";
        File dstFile = new File(dstName);
        ImageIO.write(blurredImage, "jpg", dstFile);

        System.out.println("Output image: " + dstName);

    }
}
