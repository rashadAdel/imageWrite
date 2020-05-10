
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class TxtModel {

    final int x, y;
    final int width = 133;
    final int hieht = 22;

    public TxtModel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private static BufferedImage image;

    private static Graphics g;

    
    public static void newImage(){
      
        image = null;
        g=null;  
        image = image();
        image().createGraphics();
    }
    
    public static Graphics graphics() {
        if (g == null) {
            g = image.getGraphics();
            g.setFont(new Font("Arial",Font.BOLD,12));
            g.setColor(Color.WHITE);
            
        } 
        return g;

    }

    public static BufferedImage image() {
        
        if (image == null) {
            try {
                image=ImageIO.read(new File("src/images/img.jpg"));
            } catch (IOException ex) {
                Logger.getLogger(TxtModel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        return image;
    }

    public static TxtModel txtUser0 = new TxtModel(215, 97);
    public static TxtModel txtUser1 = new TxtModel(670, 97); //  تم
    public static TxtModel txtUser2 = new TxtModel(215, 348);  // تم
    public static TxtModel txtUser3 = new TxtModel(670, 348);
    public static TxtModel txtUser4 = new TxtModel(214, 593);
    public static TxtModel txtUser5 = new TxtModel(671, 593);
    public static TxtModel txtUser6 = new TxtModel(214, 840);
    public static TxtModel txtUser7 = new TxtModel(671, 840);
    public static TxtModel txtUser8 = new TxtModel(214, 1088);
    public static TxtModel txtUser9 = new TxtModel(671, 1088);
    
    public static TxtModel txtPass0 = new TxtModel(240, 138);
    public static TxtModel txtPass1 = new TxtModel(715, 138);
    public static TxtModel txtPass2 = new TxtModel(248, 390);
    public static TxtModel txtPass3 = new TxtModel(715, 390);
    public static TxtModel txtPass4 = new TxtModel(242, 633);
    public static TxtModel txtPass5 = new TxtModel(710, 635);
    public static TxtModel txtPass6 = new TxtModel(245, 883);
    public static TxtModel txtPass7 = new TxtModel(710, 883);
    public static TxtModel txtPass8 = new TxtModel(243, 1130);
    public static TxtModel txtPass9 = new TxtModel(710, 1130);

    public void drawString(String string) {

        try {
            graphics().drawString(string, x, y + g.getFontMetrics().getHeight());
        } catch (Exception e) {
        }
    }

}
