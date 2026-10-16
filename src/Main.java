import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejemplo: arbol del enunciado
        //            A
        //          /   \
        //         B     C
        //        / \   / \
        //       D   E F   G
        //      / \
        //     H   I
        TreeNode a = new TreeNode("A");
        BinaryTree tree = new BinaryTree(a);

        a.left = new TreeNode("B");
        a.right = new TreeNode("C");
        a.left.left = new TreeNode("D");
        a.left.right = new TreeNode("E");
        a.right.left = new TreeNode("F");
        a.right.right = new TreeNode("G");
        a.left.left.left = new TreeNode("H");
        a.left.left.right = new TreeNode("I");

        String texto = """
                ========== MENU ==========
                        1. Construir arbol                  (buildTree(new Scanner(System.in)))
                        2. Mostrar arbol                    (printTree())
                        3. Recorrido Preorden               (preorder())
                        4. Recorrido Inorden                (inorder())
                        5. Recorrido Posorden               (postorder())
                        6. Mostrar factores de equilibrio   (printBalanceFactors())
                        7. Balancear arbol (AVL)            (balance())
                        8. Salir
                        ==========================
                        Seleccione una opcion:
                """;
        System.out.println(texto);
        int opcion = scanner.nextInt();
    do {
        switch (opcion){
            case 1:

        }
    }while (opcion != 8);
        /*
        Implemente aqui el menu (cada opcion llama al metodo de BinaryTree
        indicado entre parentesis):
        ========== MENU ==========
        1. Construir arbol                  (buildTree(new Scanner(System.in)))
        2. Mostrar arbol                    (printTree())
        3. Recorrido Preorden               (preorder())
        4. Recorrido Inorden                (inorder())
        5. Recorrido Posorden               (postorder())
        6. Mostrar factores de equilibrio   (printBalanceFactors())
        7. Balancear arbol (AVL)            (balance())
        8. Salir
        ==========================
        Seleccione una opcion:
        */
    }
}
