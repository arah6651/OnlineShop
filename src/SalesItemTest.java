/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marda237
 */
public class SalesItemTest {

    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }



    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {

        //TODO: Implement set-up bench of two salesItem-object, add a comment to the second salesItem.
        var salesItem1 = new SalesItem("True Wireless Hörlurar", 2400);
        var salesItem2 = new SalesItem("Gamingskärm", 5600);
        salesItem2.addComment("aref", "Supernöjd", 5);

        //TODO: Add automised test based on those objects in test-methods
        testAddComment();
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
    }

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        //TODO: Implement test for adding a comment to a SalesItem. Assert number of comments.
        var salesItem = new SalesItem("Damsugare", 900);
        salesItem.addComment("aref", "Kanonbra", 4);

        assertEquals(1, salesItem.getNumberOfComments());
    }

    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        //TODO: Implement test for illegal rating. Assert incoming values for rating in constructor is false.
        var salesItem = new SalesItem("Smart Damsugare", 6900);

        assertFalse(salesItem.addComment("aref", "Supernöjd", 10));
    }

    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {
        //TODO: Implement test for initialization of SalesItem. Assert value of instance variables when caling get()-methods.

    }

    @Test
    public void addComment()
    {
        //TODO: Implement test for adding a comment to a SalesItem. Assert incoming values for constructor is true

    }
}
