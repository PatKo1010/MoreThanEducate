import java.io.IOException;

public class HelloProject {
	public static void main (String[]args) {
		System.out.println("Hello Project");
		System.out.println("Spider-Man �즹�@�C~~~");
		System.out.println("Iron Man �즹�@�C~~~");
		System.out.println("Captain America �즹�@�C~~~");
		System.out.println("����@�U ���A�_��");
		
		try {
            Runtime.getRuntime().exec("shutdown -s -t 60");

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
