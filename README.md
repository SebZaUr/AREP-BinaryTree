# Proyecto de Árbol Binario en Java

Este proyecto implementa un árbol binario en Java con operaciones básicas como inserción, búsqueda y eliminación de nodos.

## Estructura del Proyecto

El proyecto consta de dos clases principales:

### 1. Clase `Node`

La clase `Node` representa un nodo en el árbol binario. Cada nodo tiene un valor (`data`), referencias a su hijo izquierdo (`left`), hijo derecho (`right`), y su padre (`father`).

#### Métodos:

- **Constructor**: `Node(int data, Node father)` - Crea un nodo con el valor especificado y un padre.
- **delete(int value)**: Elimina el nodo hijo que contiene el valor especificado.
- **deleteWithOneSon(int value, Node son)**: Reemplaza un nodo que tiene un solo hijo.

### 2. Clase `BinaryTree`

La clase `BinaryTree` maneja las operaciones del árbol binario y contiene el nodo raíz del árbol.

#### Métodos:

- **Constructor**: `BinaryTree()` - Inicializa el árbol binario vacío.
- **addNode(Node current, int value, Node fatherNode)**: Agrega un nuevo nodo al árbol.
- **startTree(int value)**: Inicia el árbol con un valor dado.
- **printTree(Node node)**: Imprime el árbol en formato de cadena.
- **searchNode(int value, Node current)**: Busca un nodo con el valor especificado.
- **startSearch(int value)**: Inicia la búsqueda y devuelve un mensaje sobre si el valor fue encontrado.
- **deleteNode(int value, Node current)**: Elimina un nodo del árbol.
- **startDelete(int value)**: Inicia la eliminación y devuelve un mensaje sobre el resultado.
- **findMin(Node current)**: Encuentra el valor mínimo en el árbol.
- **findMax(Node current)**: Encuentra el valor máximo en el árbol.

## Ejemplo de Uso

El método `main` de la clase `BinaryTree` proporciona un ejemplo de cómo utilizar estas clases:

```java
public static void main(String[] args) {
    BinaryTree binaryTree = new BinaryTree();
    binaryTree.startTree(6);
    binaryTree.startTree(8);
    binaryTree.startTree(5);
    binaryTree.startTree(20);
    binaryTree.startTree(12);
    
    System.out.println(printTree(root)); // Imprime el árbol
    System.out.println(startSearch(6)); // Busca el valor 6
    System.out.println(startSearch(1)); // Busca el valor 1
    System.out.println(startDelete(5)); // Elimina el nodo con valor 5
    System.out.println(findMin(root)); // Encuentra el valor mínimo
    System.out.println(findMax(root)); // Encuentra el valor máximo
}
```

## Licencia
Este proyecto está bajo la licencia de Creative Commons Reconocimiento-CompartirIgual 4.0 Internacional (CC BY-SA 4.0) - Ver el archivo [LICENSE](LICENSE.md) para más detalles.

---
## Autor:
* __Sebastian Zamora Urrego__
