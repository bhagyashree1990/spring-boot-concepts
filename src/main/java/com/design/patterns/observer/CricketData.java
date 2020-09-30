package com.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class CricketData implements Subject {
	private int runs;
	private int wickets;
	private float overs;
	private  List<Observer> observerList;
	
	public CricketData() {
		this.observerList = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observerList.add(o);
	}
	
	@Override
	public void unregisterObserver(Observer o) {
		observerList.remove(o);
	}
	
	@Override
	public void notifyObservers() {
		for(Observer observer : observerList) {
			observer.update(runs, wickets, overs);
		}
	}
	
	public void getLatestData() {
		runs = 90;
		wickets = 2;
		overs = 10.2f;
		notifyObservers();
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

	public List<Observer> getObserverList() {
		return observerList;
	}

	
	
}
