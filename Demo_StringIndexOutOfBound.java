package Sleep;
class 	Demo_StringIndexOutOfBound
{
    public static void main(String args[])
    {
    	try {
    		String a = " this is chipping";
    		char c= a.charAt(24);
    		System.out.println(c);
    	    }
    	catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("stringIndexOutOfBoundException");
    	}
    }
}
