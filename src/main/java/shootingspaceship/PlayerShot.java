package shootingspaceship;

import java.awt.Color;
import java.awt.Graphics;


public class PlayerShot extends Shot {
    private int dmg;

    public PlayerShot(int x, int y, int dmg) {
        super(x,y);
        this.dmg = dmg;
    }

    public int getDmg() {
        return dmg;
    }

    @Override
    public void drawShot(Graphics g) {
        if (!alive) return;
        g.setColor(Color.cyan); //player shot color
        g.fillOval(x_pos, y_pos, radius, radius);
    }
}
