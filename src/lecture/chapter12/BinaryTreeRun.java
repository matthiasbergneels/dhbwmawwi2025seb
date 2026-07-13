package lecture.chapter12;

public class BinaryTreeRun {

  static void main() {
    BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();

    System.out.println("Anzahl Element: " + binaryTree.size());

    binaryTree.add(50);
    binaryTree.add(10);
    binaryTree.add(20);
    binaryTree.add(80);
    binaryTree.add(30);
    binaryTree.add(60);
    System.out.println("Added 80? " + binaryTree.add(80));
    binaryTree.add(100);

    System.out.println("Anzahl Element: " + binaryTree.size());

    System.out.println("Ende");


  }
}
