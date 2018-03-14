package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int row = 20;
	private int column = 12;
	private Cell [] [] cells;
	public Spreadsheet() {
		cells = new Cell[row][column];
		for(int i= 0; i<row; i++) {
			for(int j=0; j<column; j++) {
				cells[i][j] = new EmptyCell();

			}
		}
	}
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		return " ";
	}

	public int getRows()
	{
		// TODO Auto-generated method stub
		return 20;
	}

	public int getCols()
	{
		// TODO Auto-generated method stub
		return 12;
	}

	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
