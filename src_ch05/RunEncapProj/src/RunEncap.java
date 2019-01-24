public class RunEncap {
    public static void main (String[] args) {
        EncapTest encap = new EncapTest ();
        encap.setName ("Petet Chen");
        encap.setAge (62);
        encap.setIdNum ("12345");
        System.out.println ("Name: " + encap.getName() + " Age: " + encap.getAge());
    }
}
