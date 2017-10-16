package demo;

import Entity.State;
import Repository.DistrictRepository;
import Repository.StateRepository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import Entity.District;


public class main{

	public static StateRepository SR;
	public static DistrictRepository DR;

	public static void main(String[] args) {
		// Create new state and district
		State newState = new State();
		District newDistrict = new District();
		
		File stateData = new File("/DataBaseDemo/src/main/resources/data/al.csv");
		StringTokenizer st = new StringTokenizer("");
		
		// fill the tables with data
		newState.setStateId();
		newState.setStateName();
		newState.setYear(2016);
		newState.setPolygon();
		newState.setClickCount(0);
		
		// Save entities to database
		SR.save(newState);
		//DR.save(newDistrict);
	  
		// Pull the data from the database
		Iterable<State> states = SR.findAll();
		//Iterable<District> districts = DR.findAll();
		
		// print out the data
		
  }
}



