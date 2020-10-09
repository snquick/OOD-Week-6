public class RealVideo implements Video {
	private String fileName;
	
	public RealVideo(String fileName) {
		this.fileName = fileName;
		load(fileName);
	}
	
	@Override
	public void begin() {
		System.out.println("Previewing.. " +fileName);
	   }

	   private void load(String fileName){
	      System.out.println("Loading... da da da... " +fileName);
	   }

}
