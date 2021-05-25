package com.kevin.sp.ElectionGuesserSPA.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="counties")
public class County {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="fips")
	private int fips;
	
	@Column(name="state")
	private String state;
	
	@Column(name="name")
	private String name;
	
	@Column(name="stat_area")
	private String stat_area;
	
	@Column(name="pop")
	private int pop;
	
	@Column(name="pov_rate")
	private String pov_rate;
	
	@Column(name="hh_inc")
	private String hh_inc;
	
	@Column(name="per_no_hs")
	private int per_no_hs;
	
	@Column(name="per_hs_only")
	private int per_hs_only;
	
	@Column(name="per_sc")
	private int per_sc;
	
	@Column(name="per_bach")
	private int per_bach;
	
	@Column(name="marg_2008")
	private int marg_2008;

	@Column(name="marg_2012")
	private int marg_2012;
	
	@Column(name="marg_2016")
	private int marg_2016;
	
	@Column(name="marg_2020")
	private int marg_2020;
	
	// must have default constructor
	public County() {}

	// all attributes that are in database must be here
	public County(int id, int fips, String state, String name, String stat_area, int pop, String pov_rate,
			String hh_inc, int per_no_hs, int per_hs_only, int per_sc, int per_bach, int marg_2008, int marg_2012,
			int marg_2016, int marg_2020) {
		this.id = id;
		this.fips = fips;
		this.state = state;
		this.name = name;
		this.stat_area = stat_area;
		this.pop = pop;
		this.pov_rate = pov_rate;
		this.hh_inc = hh_inc;
		this.per_no_hs = per_no_hs;
		this.per_hs_only = per_hs_only;
		this.per_sc = per_sc;
		this.per_bach = per_bach;
		this.marg_2008 = marg_2008;
		this.marg_2012 = marg_2012;
		this.marg_2016 = marg_2016;
		this.marg_2020 = marg_2020;
	}

	// results separated into own methods - not best method but easy for front end
	public String getresult2008()
	{
		if (marg_2008 == 0)
			return "Nearly Tied!";
		
		if (marg_2008 < 0)
			return "McCain by " + (marg_2008 * -1) + "";

		return "Obama by " + marg_2008 + "";
	}
	
	public String getresult2012()
	{
		if (marg_2012 < 0)
			return "Romney by " + (marg_2012 * -1) + "";
		
		return "Obama by " + marg_2012 + "";
	}
	
	public String getresult2016()
	{
		if (marg_2016 < 0)
			return "Trump by " + (marg_2016 * -1) + "";
		
		return "Clinton by " + marg_2016 + "";
	}
	
	public String getresult2020()
	{
		if (marg_2020 < 0)
			return "Trump by " + (marg_2020 * -1) + "";
		
		return "Biden by " + marg_2020 + "";
	}
	
	// getting image is its own class
	public String getImageURL()
	{
		return CountyImage.setImage(name, state);
	}
	
	// getting three random arrays - again easier for front end 
	public ArrayList<Integer> getRandom2012()
	{
		return Guessed.getRandomArray(marg_2012);
	}
	
	public ArrayList<Integer> getRandom2016()
	{
		return Guessed.getRandomArray(marg_2016);
	}
	
	public ArrayList<Integer> getRandom2020()
	{
		return Guessed.getRandomArray(marg_2020);
	}
	
	// getting the margin for each year in integer form 
	public int getRealMargin2008()
	{
		return (int)(marg_2008);
	}
	
	public int getRealMargin2012()
	{
		return (int)(marg_2012);
	}
	
	public int getRealMargin2016()
	{
		return (int)(marg_2016);
	}
	
	public int getRealMargin2020()
	{
		return (int)(marg_2020);
	}

	// if margin is less than 0, Republic won
	public boolean demWonGuessed(int num)
	{
		if (num < 0) return false;
		return true;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFips() {
		return fips;
	}

	public void setFips(int fips) {
		this.fips = fips;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStat_area() {
		return stat_area;
	}

	public void setStat_area(String stat_area) {
		this.stat_area = stat_area;
	}
	
	// if there is no statistical area, return 'No Major Cities'
	public String getRealStatArea() {
		if (stat_area.equals(""))
			return "No Major Cities";
		return getStat_area();
	}
	
	// changes 1234567 into 1,234,567
	public String getFormattedPop()
	{
		String realPop = Integer.toString(pop);
		int numDigits = 0;
		int population = pop;
		while (population != 0)
		{
			population = population / 10;
			numDigits++;
		}
		
		StringBuilder sb = new StringBuilder(realPop);
		if (numDigits > 3)
			sb.insert(numDigits - 3, ',');
		
		if (numDigits > 6)
			sb.insert(numDigits - 6,',');

		return sb.toString();
	}


	public int getPop() {
		return pop;
	}

	public void setPop(int pop) {
		this.pop = pop;
	}

	public String getPov_rate() {
		return pov_rate;
	}

	public void setPov_rate(String pov_rate) {
		this.pov_rate = pov_rate;
	}

	public String getHh_inc() {
		return hh_inc;
	}

	public void setHh_inc(String hh_inc) {
		this.hh_inc = hh_inc;
	}

	public int getPer_no_hs() {
		return per_no_hs;
	}

	public void setPer_no_hs(int per_no_hs) {
		this.per_no_hs = per_no_hs;
	}

	public int getPer_hs_only() {
		return per_hs_only;
	}

	public void setPer_hs_only(int per_hs_only) {
		this.per_hs_only = per_hs_only;
	}

	public int getPer_sc() {
		return per_sc;
	}

	public void setPer_sc(int per_sc) {
		this.per_sc = per_sc;
	}

	public int getPer_bach() {
		return per_bach;
	}

	public void setPer_bach(int per_bach) {
		this.per_bach = per_bach;
	}

	public double getMarg_2008() {
		return marg_2008;
	}

	public void setMarg_2008(int marg_2008) {
		this.marg_2008 = marg_2008;
	}

	public double getMarg_2012() {
		return marg_2012;
	}

	public void setMarg_2012(int marg_2012) {
		this.marg_2012 = marg_2012;
	}

	public double getMarg_2016() {
		return marg_2016;
	}

	public void setMarg_2016(int marg_2016) {
		this.marg_2016 = marg_2016;
	}

	public double getMarg_2020() {
		return marg_2020;
	}

	public void setMarg_2020(int marg_2020) {
		this.marg_2020 = marg_2020;
	}

	@Override
	public String toString() {
		return "County [id=" + id + ", fips=" + fips + ", state=" + state + ", name=" + name + ", stat_area="
				+ stat_area + ", pop=" + pop + ", pov_rate=" + pov_rate + ", hh_inc=" + hh_inc + ", per_no_hs="
				+ per_no_hs + ", per_hs_only=" + per_hs_only + ", per_sc=" + per_sc + ", per_bach=" + per_bach
				+ ", marg_2008=" + marg_2008 + ", marg_2012=" + marg_2012 + ", marg_2016=" + marg_2016 + ", marg_2020="
				+ marg_2020 + "]";
	}
}
