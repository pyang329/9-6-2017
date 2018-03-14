package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
    private String cellName;
   
	public int getRow()
    {
        // TODO Auto-generated method stub
        return Integer.parseInt(cellName.substring(1, cellName.length()))-1;
    }

    public int getCol()
    {
        // TODO Auto-generated method stub
        return cellName.charAt(0)-65;
    }
    
    public SpreadsheetLocation(String cellName)
    {
        // TODO: Fill this out with your own code
    		this.cellName = cellName;
    }

}
