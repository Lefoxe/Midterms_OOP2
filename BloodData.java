class BloodData{
	private String bloodType;
	private String rhFactor;
	
	public BloodData(){
		this.bloodType = "O";
		this.rhFactor = "+";
	}
	
	public void setBloodType(String b){
		this.bloodType = b;
	}
	
	public void setRhFactor(String r){
		this.rhFactor = r;
	}
	
	public String getBloodType(){
		return bloodType;
	}
	
	public String getRhFactor(){
		return rhFactor;
	}
	
	public void display(){
		System.out.print(getBloodType() + getRhFactor());
	}
}