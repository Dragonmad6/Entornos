/**
 * 
 */
package actividad1;
import java.util.Scanner;
/**
 * @author CMaster
 *
 */
public class Actividad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nif minif = new Nif(12345678, 'C');
			System.out.println(minif.getDni()+ "-"+minif.getLetra());
			minif.setLetra('U');
		System.out.println(minif.getDni()+ "-"+minif.getLetra());

	}

}
