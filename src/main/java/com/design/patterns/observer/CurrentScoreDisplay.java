package com.design.patterns.observer;

public class CurrentScoreDisplay implements Observer{
	private int runs, wickets; 
    private float overs; 
    
	@Override
	public void update(int runs, int wickets, float overs) {
		this.runs = runs; 
        this.wickets = wickets; 
        this.overs = overs; 
        System.out.println(this);
	}

	@Override
	public String toString() {
		return "CurrentScoreDisplay [runs=" + runs + ", wickets=" + wickets + ", overs=" + overs + "]";
	}	
	
	public int getRuns() {
		return runs;
	}
	
	public int getWickets() {
		return wickets;
	}
	
	public float getOvers() {
		return overs;
	}

}
