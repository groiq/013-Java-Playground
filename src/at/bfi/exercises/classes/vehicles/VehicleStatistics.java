package at.bfi.exercises.classes.vehicles;

import at.bfi.exercises.arrays.Statistics;

public class VehicleStatistics {
	
	final Vehicle[] input;
	/*
	 * track stats on:
	 * - power
	 * - county
	 * 
	 */
	final Statistics powers;
	final String[] counties;
	

	/**
	 * @param input
	 */
	public VehicleStatistics(Vehicle[] input) {
		super();
		this.input = input;
		
		double[] powers = new double[input.length];
		String[] counties = new String[input.length];
		
		for (int i = 0; i < powers.length; i++) {
			powers[i] = (double) input[i].getPower();
			counties[i] = input[i].getLicensePlate().getCounty();
		}
		this.powers = new Statistics(powers);
		this.counties = counties;
		
		
	}
	
	public Vehicle[] getInput() {
		return input;
	}

	public Statistics getPowers() {
		return powers;
	}

	public String[] getCounties() {
		return counties;
	}
	
		public double averagePower() {
		return powers.getAverage();
		
	}

		

	

}
