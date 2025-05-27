package shootingspaceship;

import java.awt.Color;
import java.awt.Graphics;

public class LaserShot extends Shot {
    private final int length = 100;

    public LaserShot(int x, int y) {
        super(x, y);
    }

    @Override
    public void drawShot(Graphics g) {
        if (!alive) return;

        g.setColor(Color.red);
        g.fillOval(x_pos, y_pos - length, 4, length); // 너비 4짜리 광선 앞으로 발사사
    }
}

