package lavallee.hamouche.tp1;

public class Main {

	public static void main(String[] args) {
		Grid myGrid = new Grid(3,5);
		for (int l=0; l<myGrid.getHeight();l++){
			String lineNumber = Integer.toString(l);
			for (int c=0; c<myGrid.getWidth();c++){
				myGrid.setCell(l,c,lineNumber+','+Integer.toString(c));
			}
		}
		System.out.println(myGrid);
	}

}
