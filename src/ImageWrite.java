
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class ImageWrite {

    public static void main(String[] args) throws IOException {

        try {
            run();
        } catch (IOException ex) {
            Logger.getLogger(ImageWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void run() throws IOException {
        String url = JOptionPane.showInputDialog(null, "أدخل عنوان الملف");
        if (url != null && new File(url).exists()) {
            Scanner scan = null;
            File file = new File(url);
            int page = 0;
            scan = new Scanner(file);
            new File("pics").mkdir();
            BufferedImage cover = ImageIO.read(new File("src/images/cover.jpg"));
            ImageIO.write(cover, "jpg", new File("pics/cover.jpg"));
            while (scan.hasNextLine()) {
                TxtModel.newImage();
                try {
                    String line = scan.nextLine();
                    TxtModel.txtUser0.drawString("" + line.split("\\s{1,}")[0]);
                    TxtModel.txtPass0.drawString("" + line.split("\\s{1,}")[1]);
                    line = scan.nextLine();
                    
                    TxtModel.txtUser1.drawString("" + line.split("\\s{1,}")[0]);
                    TxtModel.txtPass1.drawString("" + line.split("\\s{1,}")[1]);
                    
                    line = scan.nextLine();
                    
                    TxtModel.txtUser2.drawString("" + line.split("\\s{1,}")[0]);
                    TxtModel.txtPass2.drawString("" + line.split("\\s{1,}")[1]);
                    
                    line = scan.nextLine();
                    
                    TxtModel.txtUser3.drawString("" + line.split("\\s{1,}")[0]);
                    TxtModel.txtPass3.drawString("" + line.split("\\s{1,}")[1]);
                    
                    line = scan.nextLine();
                    
                    TxtModel.txtUser4.drawString("" + line.split("\\s{1,}")[0]);
                    TxtModel.txtPass4.drawString("" + line.split("\\s{1,}")[1]);
                    
                    line = scan.nextLine();
                    
                    TxtModel.txtUser5.drawString("" + line.split("\\s{1,}")[0]);
                    TxtModel.txtPass5.drawString("" + line.split("\\s{1,}")[1]);
                    
                    line = scan.nextLine();
                    
                    TxtModel.txtUser6.drawString("" + line.split("\\s{1,}")[0]);
                    TxtModel.txtPass6.drawString("" + line.split("\\s{1,}")[1]);
                    
                    line = scan.nextLine();
                    
                    TxtModel.txtUser7.drawString("" + line.split("\\s{1,}")[0]);;
                    TxtModel.txtPass7.drawString("" + line.split("\\s{1,}")[1]);
                    
                    line = scan.nextLine();
                    
                    TxtModel.txtUser8.drawString("" + line.split("\\s{1,}")[0]);
                    TxtModel.txtPass8.drawString("" + line.split("\\s{1,}")[1]);
                    
                    line = scan.nextLine();
                    
                    TxtModel.txtUser9.drawString("" + line.split("\\s{1,}")[0]);
                    TxtModel.txtPass9.drawString("" + line.split("\\s{1,}")[1]);
                } catch (Exception e) {
                    
                }
                ImageIO.write(TxtModel.image(), "jpg", new File("pics/" + (++page) + ".jpg"));

            }
            scan.close();
            JOptionPane.showMessageDialog(null, "save " + page + " images at " + new File("pics").getPath());
            Desktop desktop = Desktop.getDesktop();
             File dirToOpen = null;
             try {
             dirToOpen = new File("D:\\imageWrite\\pics");
            desktop.open(dirToOpen);
             } catch (IllegalArgumentException iae) {
            System.out.println("File Not Found");
            }

        } else {
            int result = JOptionPane.showConfirmDialog(null, "هل تريد المحاولة مره اخري", "عنوان الملف غير صحيح", JOptionPane.OK_CANCEL_OPTION);
            if (result == 0) {
                run();
            }
        }
    }

}
