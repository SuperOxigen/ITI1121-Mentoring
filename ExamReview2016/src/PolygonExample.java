import java.util.LinkedList;

/*This code was generated using the UMPLE 1.24.0-949994e modeling language!*/
/**
 * Positioning
 */
class Shape2D
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Shape2D Attributes
  private String center;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Shape2D(String aCenter)
  {
    center = aCenter;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCenter(String aCenter)
  {
    boolean wasSet = false;
    center = aCenter;
    wasSet = true;
    return wasSet;
  }

  public String getCenter()
  {
    return center;
  }

  public void delete()
  {}


  public String toString()
  {
    String outputString = "";
    return super.toString() + "["+
            "center" + ":" + getCenter()+ "]"
     + outputString;
  }

  public static void main(String [] args)
  {
    // Constructor arguments are added for this example
    Polygon p = new Rectangle("0,0", "0", "20px", "30px");
    System.out.println(p.getCenter());


    try
    {
      EllipticalShape es = new Circle("0,0", "50px");
      Ellipse e = (Ellipse) es; // Looks good, but this will cause a run time error.
      System.out.println("Cast success!");
    }
    catch (Exception e)
    {
      System.out.println("Cast failed!");
    }

    LinkedList<Polygon> list = new LinkedList<>();
    list.add(new Rectangle("0,0", "45deg", "15px", "15px"));
    list.add(new RegularPolygon("0,0", "0deg", "8", "10px"));
  }
}

/*This code was generated using the UMPLE 1.24.0-949994e modeling language!*/

class Circle extends EllipticalShape
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Circle(String aCenter, String aSemiMajorAxis)
  {
    super(aCenter, aSemiMajorAxis);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

}

/*This code was generated using the UMPLE 1.24.0-949994e modeling language!*/
class Ellipse extends EllipticalShape
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ellipse(String aCenter, String aSemiMajorAxis)
  {
    super(aCenter, aSemiMajorAxis);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

}


/*This code was generated using the UMPLE 1.24.0-949994e modeling language!*/

class ArbitraryPolygon extends Polygon
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ArbitraryPolygon Attributes
  private String points;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ArbitraryPolygon(String aCenter, String aPoints)
  {
    super(aCenter);
    points = aPoints;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPoints(String aPoints)
  {
    boolean wasSet = false;
    points = aPoints;
    wasSet = true;
    return wasSet;
  }

  public String getPoints()
  {
    return points;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    String outputString = "";
    return super.toString() + "["+
            "points" + ":" + getPoints()+ "]"
     + outputString;
  }
}


/*This code was generated using the UMPLE 1.24.0-949994e modeling language!*/
class Rectangle extends SimplePolygon
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Rectangle Attributes
  private String height;
  private String width;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Rectangle(String aCenter, String aOrientation, String aHeight, String aWidth)
  {
    super(aCenter, aOrientation);
    height = aHeight;
    width = aWidth;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setHeight(String aHeight)
  {
    boolean wasSet = false;
    height = aHeight;
    wasSet = true;
    return wasSet;
  }

  public boolean setWidth(String aWidth)
  {
    boolean wasSet = false;
    width = aWidth;
    wasSet = true;
    return wasSet;
  }

  public String getHeight()
  {
    return height;
  }

  public String getWidth()
  {
    return width;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    String outputString = "";
    return super.toString() + "["+
            "height" + ":" + getHeight()+ "," +
            "width" + ":" + getWidth()+ "]"
     + outputString;
  }
}



/*This code was generated using the UMPLE 1.24.0-949994e modeling language!*/
/**
 * Abstract
 */
class EllipticalShape extends Shape2D
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EllipticalShape Attributes
  private String semiMajorAxis;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EllipticalShape(String aCenter, String aSemiMajorAxis)
  {
    super(aCenter);
    semiMajorAxis = aSemiMajorAxis;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setSemiMajorAxis(String aSemiMajorAxis)
  {
    boolean wasSet = false;
    semiMajorAxis = aSemiMajorAxis;
    wasSet = true;
    return wasSet;
  }

  public String getSemiMajorAxis()
  {
    return semiMajorAxis;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    String outputString = "";
    return super.toString() + "["+
            "semiMajorAxis" + ":" + getSemiMajorAxis()+ "]"
     + outputString;
  }
}


/*This code was generated using the UMPLE 1.24.0-949994e modeling language!*/
/**
 * Abstract
 */
class Polygon extends Shape2D
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Polygon(String aCenter)
  {
    super(aCenter);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

}



/*This code was generated using the UMPLE 1.24.0-949994e modeling language!*/
class RegularPolygon extends SimplePolygon
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //RegularPolygon Attributes
  private String numPoints;
  private String radius;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public RegularPolygon(String aCenter, String aOrientation, String aNumPoints, String aRadius)
  {
    super(aCenter, aOrientation);
    numPoints = aNumPoints;
    radius = aRadius;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNumPoints(String aNumPoints)
  {
    boolean wasSet = false;
    numPoints = aNumPoints;
    wasSet = true;
    return wasSet;
  }

  public boolean setRadius(String aRadius)
  {
    boolean wasSet = false;
    radius = aRadius;
    wasSet = true;
    return wasSet;
  }

  public String getNumPoints()
  {
    return numPoints;
  }

  public String getRadius()
  {
    return radius;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    String outputString = "";
    return super.toString() + "["+
            "numPoints" + ":" + getNumPoints()+ "," +
            "radius" + ":" + getRadius()+ "]"
     + outputString;
  }
}

/*This code was generated using the UMPLE 1.24.0-949994e modeling language!*/

class SimplePolygon extends Polygon
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //SimplePolygon Attributes
  private String orientation;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SimplePolygon(String aCenter, String aOrientation)
  {
    super(aCenter);
    orientation = aOrientation;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setOrientation(String aOrientation)
  {
    boolean wasSet = false;
    orientation = aOrientation;
    wasSet = true;
    return wasSet;
  }

  public String getOrientation()
  {
    return orientation;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    String outputString = "";
    return super.toString() + "["+
            "orientation" + ":" + getOrientation()+ "]"
     + outputString;
  }
}
