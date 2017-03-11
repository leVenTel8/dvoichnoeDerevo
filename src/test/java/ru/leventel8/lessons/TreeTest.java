/* JUnit тест методов вставки поиска и удаления
 */
package ru.leventel8.lessons;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class TreeTest {
    //private Node root;

    /*проверяем вставку, методом поиска

     */
    @Test
    public void testInsert() {

        Tree theTree = new Tree();
        theTree.insert(50, 1.5);
        theTree.insert(25, 1.2);
        theTree.insert(75, 1.7);
        theTree.insert(12, 1.5);
        theTree.insert(37, 1.2);
        theTree.insert(43, 1.7);
        theTree.insert(30, 1.5);
        theTree.insert(33, 1.2);
        theTree.insert(87, 1.7);
        theTree.insert(93, 1.5);
        theTree.insert(97, 1.5);

        assertSame(12, theTree.find(12).iData);
    }

    /* проверка
     * метода удаления, на выходе должен вернуть true
     */
    @Test
    public void testDelete() {

        Tree theTree = new Tree();
        theTree.insert(50, 1.5);
        theTree.insert(25, 1.2);
        theTree.insert(75, 1.7);
        theTree.insert(12, 1.5);
        theTree.insert(37, 1.2);
        theTree.insert(43, 1.7);
        theTree.insert(30, 1.5);
        theTree.insert(33, 1.2);
        theTree.insert(87, 1.7);
        theTree.insert(93, 1.5);
        theTree.insert(97, 1.5);

        assertSame(true,theTree.delete(12));
    }

}