public class ProxyVideo implements Video {
	
	// declaring variables
	 private RealVideo realVideo;
	 private String fileName;

	 
	 public ProxyVideo(String fileName){
		 this.fileName = fileName;
	   }

	   @Override
	   public void begin() {
	      if (realVideo == null) {
	         realVideo = new RealVideo(fileName);
	      }
	      realVideo.begin();
	   }
}
