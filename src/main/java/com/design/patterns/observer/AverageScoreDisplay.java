package com.design.patterns.observer;

public class AverageScoreDisplay implements Observer{
	private float runRate; 
	private int predictedScore; 

	@Override
	public void update(int runs, int wickets, float overs) {
		this.runRate =(float)runs/overs; 
		this.predictedScore = (int)(this.runRate * 50);
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "AverageScoreDisplay [runRate=" + runRate + ", predictedScore=" + predictedScore + "]";
	}	
	
	public float getRunRate() {
		return runRate;
	}
	
	public int getPredictedScore() {
		return predictedScore;
	}
}
