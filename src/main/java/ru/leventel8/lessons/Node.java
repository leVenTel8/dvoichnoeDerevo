package ru.leventel8.lessons;
/* узел дерева
объявление ссылок на левого и правого потомка
 */
class Node {

    public int iData; //id узла, по нему определяется положение в дереве
    public double dData; // данные которые содерит узел
    public Node leftChild; // ссылка на левого потомка
    public Node rightChild; // ссылка на правого потомка

    /* метод выводит
    id узла и данные, которые содержит узел
     */

    public void displayNode(){

        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");

    }

}
