/**
 * Name: sloanwoodberry
 * Lab Name: NodeDriver
 * Lab Purpose
 * Date: 8/23/18
 * Collaborators: None
 */
public class NodeDriver {
    public static void main(String[] args) {
        Node one = new Node("im number one");
        Node two = new Node("hi", one);
        Node three = new Node("yo", two);
        one.pointMe(three);
        one.pointMe(two);
        System.out.println(one.getPointer(0).getData());
        three.setData("hieeeeeeeeeeee");
        System.out.println(one.getPointer(0).getData());

    }
}
