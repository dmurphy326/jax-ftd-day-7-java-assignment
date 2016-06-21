package com.cooksys.ftd.impl;

import com.cooksys.butterpillar.model.IButterpillar;

public class Butterpillar implements IButterpillar {

	private double length, leavesEaten;

	@Override
	public int compareTo(IButterpillar butter) {
		// greater than
		if (this.length > butter.getLength()) {
			// System.out.println(butter.getLength());
			// System.out.println(length);
			// System.out.println(butter.getLength() > this.length);
			return 1;
		}
		// less than
		else if (this.length < butter.getLength()) {
			return -1;
		}

		// equals
		else {
			if (this.leavesEaten > butter.getLeavesEaten()) {
				return 1;
			} else if (this.leavesEaten < butter.getLeavesEaten()) {
				return -1;
			} else {
				return 0;
			}
		}
	} // end compareTo method

	@Override
	public void setLength(double length) {
		this.length = length;

	}

	@Override
	public double getLength() {
		return length;
	}

	@Override
	public void setLeavesEaten(double leavesEaten) {
		this.leavesEaten = leavesEaten;

	}

	@Override
	public double getLeavesEaten() {
		return leavesEaten;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(leavesEaten);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Butterpillar other = (Butterpillar) obj;
		if (Double.doubleToLongBits(leavesEaten) != Double.doubleToLongBits(other.leavesEaten))
			return false;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		return true;
	}

}
