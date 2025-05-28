package shootingspaceship;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Defenser extends Player {
    private int atkDmg;
    private int sharedDmg;
    private boolean isSkilled;

    protected Image defenserImage;
    protected Image skillImage;

    public Defenser(int x, int y, int min_x, int max_x, int atkDmg, int sharedDmg ) {
        super(x, y, min_x, max_x);
        this.atkDmg = atkDmg;
        this.sharedDmg = sharedDmg;
        defenserImage = new ImageIcon(getClass().getResource("/image/defenser.png")).getImage();
        skillImage = new ImageIcon(getClass().getResource("/image/tankerskill.png")).getImage();
    }

    public int getAtkDmg() {
        return atkDmg;
    }

    public boolean isSkilled() {
        return isSkilled;
    }

    public int sharedDmg() {
        return sharedDmg;
    }

    @Override
    public PlayerShot generateShot() {
        return new PlayerShot(x_pos, y_pos, atkDmg);
    }

    public 
}
