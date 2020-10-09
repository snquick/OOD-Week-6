public class Client {
	 public static void main(String[] args) {
	      Video video = new ProxyVideo("How_To_Program_For_Dummies.mp4"); // creating object

	      // loads video from disk
	      video.begin(); 
	      System.out.println("");
	      
	      video.begin(); // Does not load video 
	   }
}
