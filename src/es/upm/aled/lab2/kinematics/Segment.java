package es.upm.aled.lab2.kinematics;

import java.util.List;

import es.upm.aled.lab2.gui.Node;

// TODO: Implemente la clase
public class Segment {
	private double length;
	private double angle;
	private List<Segment> children;


	public Segment(double length, double angle) {
		this.length = length;
		this.angle = angle;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getAngle() {
		return angle;
	}
	
	public void setAngle(double angle) {
		this.angle = angle;
	}
	
	public List<Segment> getChildren() {
		return children;
	}
	
	public void addChild(Segment child) {
		if (!children.contains(child))
			children.add(child);
	}
}
