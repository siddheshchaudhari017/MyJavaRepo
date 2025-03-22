class Demo
{
    public static void main(String args[])
    {
        int a=2;
        int j=1;
        // int c = a /j;

        try {
            System.out.print(a/j);  
            //Nested try - catch
            try {
                
            } catch (Exception e) {
                // TODO: handle exception
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error : "+e);
        }
        finally {
            System.out.println("Program executed successfully");
        }
    }
}