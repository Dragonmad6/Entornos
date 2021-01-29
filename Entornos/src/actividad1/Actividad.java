/**
 * 
 */
package actividad1;
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
		Nif minif = new Nif(5999368, 'W');
			System.out.println(minif.getDni()+ "-"+minif.getLetra());
			minif.setLetra('D');
		System.out.println(minif.getDni()+ "-"+minif.getLetra());

	}

}
