import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Simplecalculation {
	
	/**
	 * file that access xml file
	 */
	private static final String FLOWERS_FEED = 
			"http://services.hanselandpetal.com/feeds/flowers.xml";

	/**
	 * the main method reads xml file
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		InputStream stream = null;
		BufferedInputStream buf = null;
		try {
			URL url = new URL(FLOWERS_FEED);
			stream = url.openStream();
			buf = new BufferedInputStream(stream);
			
			StringBuilder sb = new StringBuilder();
			while(true){
				int data = buf.read();
				if (data == -1){
					break;
				}
				else {
					sb.append((char)data);
					
				}
			}

			System.out.println(sb);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			stream.close();
			buf.close();
		}
	}

}
