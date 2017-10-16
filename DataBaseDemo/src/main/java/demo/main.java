package demo;

import Entity.State;
import Repository.DistrictRepository;
import Repository.StateRepository;

import java.util.ArrayList;
import java.util.List;

import Entity.District;


public class main{

	public static StateRepository SR;
	public static DistrictRepository DR;

	public static void main(String[] args) {
		// Create new state and district
		State newState = new State();
		District newDistrict = new District();
	  
		// fill the tables with data
		
		
		// Save entities to database
		SR.save(newState);
		DR.save(newDistrict);
	  
		// Pull the data from the database
		Iterable<State> states = SR.findAll();
		Iterable<District> districts = DR.findAll();
		
		// print out the data
		
  }
}
