
public class Calculate {
	/*
	 * To Calculate SimpleIntrest
	 * @param principle
	 * @param time
	 * @param rateOfInterest
	 * Returns the simple interest
	 */
	
	public double simpleInterest(double principle, double time, double rateOfInterest) {
		return (principle*time*rateOfInterest) / 100.0;
	}
	/*
	 * To Calculate CompoundIntrest
	 * @param principle
	 * @param time
	 * @param rateOfInterest
	 * Returns the compound interest
	 */
	public double compoundInterest(double principle, double time, double rateOfInterest) {
		return principle * Math.pow((1+rateOfInterest)/100, time);
	}
}
