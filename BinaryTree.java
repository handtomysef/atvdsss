//implementação de uma árvore binária
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



//no da árvore binária e contem um valor inteiro 
class Node {
    int value;
    Node left; //referencias no esq e no dir
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

// representa a bTree em si e possui um unico atributo root -> referência para o no raiz da árvore
class BinaryTree {
    Node root;

    // construtor
    public BinaryTree() {
        this.root = null; // inicializa a arvore como null
         
    }

    // insere um novo valor na árvore e chama o método privado Recursivo passando a raiz atual e o valor a ser inserido
    public void insert(int value) {
        root = Recursivo(root, value);
    }

    // realiza a inserção recursivamente na árvore e recebe como parâmetro o no atual e o valor a ser inserido
   
    private Node Recursivo(Node atualNode, int value) {
        if (Node == null) {  // se o no atual for null, significa que chegamos a uma posição vazia na árvore
            return new Node(value); // cria-se um novo no com o valor fornecido e retorna esse novo no
        }

        // caso contrário, compara-se o valor fornecido com o valor do no atual 
        if (value < atualNode.value) {
            atualNode.left = Recursivo(atualNode.left, value); // se o valor fornecido for menor, chama-se o metodo Recursivo passando o nó esquerdo como parâmetro 
        } else if (value > atualNode.value) { // se for maior, chama-se o método Recursivo passando o no direito como parâmetro. 
            atualNode.right = Recursivo(atualNode.right, value);
        }

        return atualNode; // retorna o no atualizado.
    }

    // realiza uma travessia em ordem na arvore e imprime os valores dos nos
    public void Ordem() {
        List<Node> List = new ArrayList<>();  // utiliza uma lista (List) para armazenar os nos a serem visitados
        List.add(root); // adiciona-se o no raiz na lista

        int idx = 0;
        // o idx é inicializado como 0

        // enquanto o índice for menor que o tamanho da lista, realiza-se o seguinte:
        while (idx < nodeList.size()) {
            Node atualNode = List.get(idx);
            System.out.print(atualNode.value + " ");
            // obtem-se o no atual da lista no índice idx e imprime o valor do nó atual

            if (atualNode.left != null) {
                List.add(atualNode.left);
                //Se o no esquerdo do nó atual existir, adiciona-se esse no esquerdo à lista
            }

            if (atualNode.right != null) {
                List.add(atualNode.right);
                // se o no direito do nó atual existir, adiciona-se esse no direito à lista
            }

            idx++; // incrementa-se o indice
        }
        System.out.println(); // ao final da execução do loop, é impressa uma nova linha
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // ler a entrada do usuario 
        int numCases = sc.nextInt(); // vai ler o num de casos para processar

        // para processar cada caso cria o for
        for (int i = 1; i <= numCases; i++) {
            BinaryTree binaryTree = new BinaryTree(); // para cada caso, cria-se um novo objeto BinaryTree

            int numValues = sc.nextInt(); // le o num de valores a serem inseridos na arvore
            // outro for para ler e inserir os valores na árvore
            for (int j = 0; j < numValues; j++) {
                int value = sc.nextInt();
                binaryTree.insert(value);
            }

            // imprime-se a mensagem onde representa o numero do caso atual 
            System.out.println("Case " + i + ":");
            binaryTree.Ordem(); // para imprimir os valores da árvore em ordem chama-se o metodo

            // se ainda houver casos restantes (ou seja, o número do caso atual for menor que o número total de casos), imprime-se uma nova linha
            if (i < numCases) {
                System.out.println();
            }
        }

        sc.close(); // fecha-se o objeto para liberar recursos
    }
}
