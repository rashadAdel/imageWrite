
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;



//ده كلاس موديل يعني عبارة عن خصائص التكست اللي هيتكتب
public class TxtModel {

    final int x, y; // ده مكان التكست فين من الشاشه

    public TxtModel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private static BufferedImage image; // دي هنحط فيها الصورة اللى هنعدل عليها 

    private static Graphics g;  // دي الاداة اللي بترسم على الصورة

    
    public static void newImage(){
      //هنا بلغي الصورة واداة الرسم علشان لما يجي يستدعيهم ينشئ صورة جديدة وميكتبش علي الصورة القديمة
        image = null;
        g=null;  
        image = image();
        image().createGraphics();
    }
    

    // دي لاستدعاء اداة الرسم
    public static Graphics graphics() {
        if (g == null) {
            g = image.getGraphics();// تحديد ان الرسم هيكون على الصورة

            // تحديد خصائص اداة الرسم
            g.setFont(new Font("Arial",Font.BOLD,12));
            g.setColor(Color.WHITE);
            
        } 
        return g;

    }

    public static BufferedImage image() {
        // انشاء ملف الصورة للتعديل عليه
        if (image == null) {
            try {
                image=ImageIO.read(new File("src/images/img.jpg"));
            } catch (IOException ex) {
                Logger.getLogger(TxtModel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        return image;
    }


    // هنا بعمل ١٠ تكست للاسم وبحدد مكانهم ف الصورة
    public static TxtModel txtUser0 = new TxtModel(215, 97);
    public static TxtModel txtUser1 = new TxtModel(670, 97); 
    public static TxtModel txtUser2 = new TxtModel(215, 348);  
    public static TxtModel txtUser3 = new TxtModel(670, 348);
    public static TxtModel txtUser4 = new TxtModel(214, 593);
    public static TxtModel txtUser5 = new TxtModel(671, 593);
    public static TxtModel txtUser6 = new TxtModel(214, 840);
    public static TxtModel txtUser7 = new TxtModel(671, 840);
    public static TxtModel txtUser8 = new TxtModel(214, 1088);
    public static TxtModel txtUser9 = new TxtModel(671, 1088);
    // هنا بعمل ١٠ تكست للباسورد وبحدد مكانهم ف الصورة
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
        // هنا بستدعيه يكتب الكلام اللي جايله
        try {
            graphics().drawString(string, x, y + g.getFontMetrics().getHeight());
        } catch (Exception e) {
        }
    }

}
