// Objects can be passed to methods.
class Block
{
  int a, b, c;
  int volume;

  // contructor with formal parameters that are objects or primitives?
  Block(int i, int j, int k)
  {
    a = i;
    b = j;
    c = k;
    volume = a * b * c;
  }

  // Return true if ob defines same block.
  // the formal parameter to this method is an object
  boolean sameBlock(Block ob)
  {
    if((ob.a == this.a) & (ob.b == b) & (ob.c == c)) return true;
    else return false;
  }

  // Return true if ob has same volume.
  boolean sameVolume(Block ob)
  {
    if(ob.volume == volume) return true;
    else return false;
  }
}

class PassAnObjectToAMethodWithoutIdentifier
{
  public static void main(String[] args)
  {
	// instantiate objects
    Block ob1 = new Block(10, 2, 5);
    Block ob2 = new Block(10, 2, 5);
    Block ob3 = new Block(4, 5, 5);

    // pass an object to a method
    System.out.println("ob1 same dimensions as ob2: " +
                       ob1.sameBlock(ob2));
    System.out.println("ob1 same dimensions as ob3: " +
                        ob1.sameBlock(ob3));
    System.out.println("ob1 same volume as ob3: " +
                       ob1.sameVolume(ob3));
    System.out.println("The volume of ob1 is " +
                        ob1.volume);
    System.out.println("passing an unnamed runtime argument " +
                       ob1.sameVolume(new Block(400, 500, 500)));
    System.out.println("The volume of the unnamed object is " +
                        new Block(400, 500, 500).volume);
  }
}