
public class CalculateCost {
	/*
	 * To Calculate Construction Cost
	 * @param materialStandard
	 * @param area
	 * @param automated
	 * Returns the Cost needed to construct 
	 */
	public double getCost(String materialStandard,double area,boolean automated) {
		double cost = 0.0;
		if(materialStandard.equals("standard"))
			cost= 1200*area;
		else if(materialStandard.equals("aboveStandard"))
			cost = 1500*area;
		else if(materialStandard.equals("highStandard") && automated == true)
			cost = 1800*area;
		else if(materialStandard.equals("highStandard"))
			cost = 1800*area;
		return cost;
	}
}
