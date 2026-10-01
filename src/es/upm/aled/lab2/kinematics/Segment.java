package es.upm.aled.lab2.kinematics;

import java.util.List;

import es.upm.aled.lab2.gui.Node;

// TODO: Implemente la clase

/**
 * Class representing one segment in the GUI that paints the exoskeleton bones on
 * the screen. Each segment is identified by its length and angle on the space.
 *  Every Node has a List of their children Segments; those it's connected to.
 * 
 */
public class Segment {
	private double length;
	private double angle;
	private List<Segment> children;
	
	/**
	 * Builds a new Segment from its absolute position.
	 * 
	 * @param length The length of the segment in cm.
	 * @param angle The angle that forms with the parent´s Segment.
	 */
	public Segment(double length, double angle) {
		this.length = length;
		this.angle = angle;
	}
	
	/**
	 * Returns the length.
	 * 
	 * @return The length.
	 */
	public double getLength() {
		return length;
	}
	
	/**
	 * Returns the angle.
	 * 
	 * @return The angle.
	 */
	public double getAngle() {
		return angle;
	}
	
	public void setAngle(double angle) {
		this.angle = angle;
	}
	
	/**
	 * Returns the Segments this one is connected to. The children Segments don't have a
	 * reference to the parent Segment, so the connection is one-way.
	 * 
	 * @return A List of all the children Segments.
	 */
	public List<Segment> getChildren() {
		return children;
	}
	
	/**
	 * Adds a new Segment to the List of Segment this one is connected to. Each Segment can
	 * only appear as a child once.
	 * 
	 * @param child The Segment to be added.
	 */
	public void addChild(Segment child) {
		if (!children.contains(child))
			children.add(child);
	}
}
