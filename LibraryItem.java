abstract class LibraryItem{
	String title;
	String itemID;
	boolean check = true;
	
	public LibraryItem(String title,String itemID,boolean check){
		this.title=title;
		this.itemID=itemID;
		this.check=check;
	}
	public void checkOut(){
		check = false;
	}
	
	public void checkIn(){
		check = true;
	}
	public String getCheck(){
		String Availbility;
		if(check == true){
			
			Availbility = "Available";
			return Availbility;
			
		}
		else{
			
			Availbility = "Not Available";
			return Availbility;
		}
	}
	
	public void displayItemDetails(){
		
	}
}