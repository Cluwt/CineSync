/*
 * $Id: CirclesPanel.java,v 1.1 2005/05/25 23:13:26 rbair Exp $
 *
 * Copyright 2004 Sun Microsystems, Inc., 4150 Network Circle,
 * Santa Clara, California 95054, U.S.A. All rights reserved.
 */

package br.com.cinesync.project.swingx;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import javax.swing.Timer;

public class CirclesPanel extends GradientPanel {
	private RenderingHints hints;
	private int counter = 0;
         private Timer timer = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        
        public void start(){
            timer.start();
        }

        public void stop(){
            timer.stop();
        }

	public CirclesPanel() {
            super(new Color(138,43,226), new Color(138,43,226));
		hints = new RenderingHints(RenderingHints.KEY_ALPHA_INTERPOLATION,
				RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
		hints.put(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		hints.put(RenderingHints.KEY_COLOR_RENDERING,
				RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		hints.put(RenderingHints.KEY_INTERPOLATION,
				RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		hints.put(RenderingHints.KEY_RENDERING,
				RenderingHints.VALUE_RENDER_QUALITY);
	}

	public void paintComponent(Graphics g) {
		counter++;

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHints(hints);
		super.paintComponent(g2);

		float width = getWidth();
		
		g2.translate(0, -30);
		drawCurve(g2,
				20.0f, -10.0f, 20.0f, -10.0f,
				width / 2.0f - 40.0f, 10.0f,
				0.0f, -5.0f,
				width / 2.0f + 40, 1.0f,
				0.0f, 5.0f,
				50.0f, 5.0f, false);
		g2.translate(0, 30);

		drawCircles(g2, 45.0f, 30.0f, 16.0f, 1.0f, true, false);
		drawCircles(g2, 40.0f, 24.0f, 12.0f, 2.0f, false, false);
		drawCircles(g2, getHeight() - 25.0f, 50.0f, 0.0f, 1.0f, false, true);
		drawCircles(g2, getHeight() - 40.0f, 70.0f, 20.0f, 2.0f, true, true);
		
		g2.translate(width - 150, 0);
		drawCircles(g2, getHeight() - 110.0f, 300.0f, width, 0.0f, false, true);
		g2.translate(-width + 150, 0);
	}

	private void drawCircles(Graphics2D g2, float y, float diameter,
			float gap, float speed, boolean invertDirection,
			boolean invertGradient) {
		float width = getWidth();

		Color start = new Color(255, 255, 255, 150);
		Color end = new Color(255, 255, 255, 0);

		GradientPaint painter = new GradientPaint(0, y,
				invertGradient ? end : start,
				0, y + diameter,
				invertGradient ? start : end);
		Paint oldPainter = g2.getPaint();
		g2.setPaint(painter);

		float block = diameter + gap;
		float startX = invertDirection ? -(counter % block) * speed :
			(counter % block) * speed - speed * block;
		for (float x = startX; x < width; x += block) {
			Ellipse2D circle = new Ellipse2D.Double(x, y, diameter, diameter);
			g2.fill(circle);
		}
		
		g2.setPaint(oldPainter);
	}
	
	private void drawCurve(Graphics2D g2, 
			float y1, float y1_offset,
			float y2, float y2_offset,
			float cx1, float cx1_offset,
			float cy1, float cy1_offset,
			float cx2, float cx2_offset,
			float cy2, float cy2_offset,
			float thickness,
			float speed,
			boolean invert) {

		float width = getWidth();
		float height = getHeight();

		double offset = Math.sin(counter / (speed * Math.PI));
		float start_x = 0.0f;
		float start_y = y1 + (float) (offset * y1_offset);
		float end_x = width;
		float end_y = y2 + (float) (offset * y2_offset);
		float ctrl1_x = (float) offset * cx1_offset + cx1;
		float ctrl1_y = cy1 + (float) (offset * cy1_offset);
		float ctrl2_x = (float) (offset * cx2_offset) + cx2;
		float ctrl2_y = (float) (offset * cy2_offset) + cy2;

		CubicCurve2D curve = new CubicCurve2D.Double(start_x, start_y, ctrl1_x, ctrl1_y, ctrl2_x, ctrl2_y, end_x, end_y);
		
		GeneralPath path = new GeneralPath(curve);
		path.lineTo(width, height);
		path.lineTo(0, height);
		path.closePath();
		
		Area thickCurve = new Area((Shape) path.clone());
		AffineTransform translation = AffineTransform.getTranslateInstance(0, thickness);
		path.transform(translation);
		thickCurve.subtract(new Area(path));

		Color start = new Color(255, 255, 255, 200);
		Color end = new Color(255, 255, 255, 0);

		Rectangle bounds = thickCurve.getBounds();
		GradientPaint painter = new GradientPaint(0, curve.getBounds().y,
				invert ? end : start,
				0, bounds.y + bounds.height,
				invert ? start : end);
		Paint oldPainter = g2.getPaint();
		g2.setPaint(painter);
		
		g2.fill(thickCurve);
		
		g2.setPaint(oldPainter);
	}
}